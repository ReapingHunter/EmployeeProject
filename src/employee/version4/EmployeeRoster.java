/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;
import java.time.*;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int MAX = 10;
    private String format = "| %-15s | %-30s | %-30s | %-15s |\n";
    
    public EmployeeRoster() {
        empList = new Employee[MAX];
        count = 0;
    }
    
    public EmployeeRoster(int size) {
        MAX = size;
        empList = new Employee[MAX];
        count = 0;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public int getCount() {
        return count;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double getSalary(Employee e) {
        double salary;
        switch(e) {
            case HourlyEmployee x:
               salary = x.computeSalary();
               break;
            case PieceWorkerEmployee x:
               salary = x.computeSalary();
               break;
            case CommissionEmployee x:
               salary = x.computeSalary();
               break;
            default:
                salary = 0;
        }
        return salary;   
    }
    public void displayEmployee(Employee type) {
        int x;
        if(count != 0) {
            for(x = 0; x < count; x++) {
                if(empList[x].getClass() == type.getClass()) {
                    System.out.printf(format, empList[x].getID(), empList[x].getName(), empList[x].getClass().getSimpleName(), empList[x].format(getSalary(empList[x])));
                }
            }
            System.out.println("\n");
        }
        
    }
    
    public void displayAllEmployee() {
        int x;
        for(x = 0; x < count; x++){
            System.out.printf(format, this.empList[x].getID(), this.empList[x].getName(), this.empList[x].getClass().getSimpleName(), this.empList[x].format(getSalary(empList[x])));
        }
        System.out.println("\n");
    }
    
    public int countHE() {
        int x;
        int c = 0;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof HourlyEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countPWE() {
        int x;
        int c = 0;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof PieceWorkerEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countCE() {
        int x;
        int c = 0;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof CommissionEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countBPCE() {
        int x;
        int c = 0;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof BasePlusCommissionEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public boolean addEmployee(Employee ... e) {
        int k;
        if(this.count != MAX) {
            for(k = 0; k < count && empList[k].getID() != e[0].getID(); k++){}
            if(k == count) {
                for(Employee x : e){
                    empList[count++] = x;
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public Employee removeEmployee(int id) {
        int x;
        Employee empDel;
        for(x = 0; x < count && empList[x].getID() != id; x++){}
        if(x != count) {
            count--;
            empDel = empList[x];
            for(;x < count; x++) {
                empList[x] = empList[x+1];
            }
            return empDel;
        }
        return null;
        
    }
    
    public boolean updateEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate) {
        int x;
        for(x = 0; x < count && empList[x].getID() != id; x++){}
        if (x != count) {
            empList[x].setName(name);
            empList[x].setHireDate(hireDate);
            empList[x].setBirthDate(birthDate);
            return true;
        }
        return false;
        
    }
    
    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster emp = new EmployeeRoster(this.count);
        int x;
        int y;
        int bool = 0;
        for(x = 0, y = 0; x < count; x++) {
            if(this.empList[x].getName().toString().toLowerCase().contains(keyword.toLowerCase())) {
                emp.addEmployee(empList[x]);
                bool = 1;
            }
        }
        
        if(bool == 1) {
            System.out.println("Matches Found!!!\n");
            emp.displayAllEmployee();
        } else {
            System.out.println("No match found...\n");
        }
        return emp;
    }
    
    @Override
    public String toString(){
        return String.format("| ID              |  Name                          | Type                           | Salary          |");
    }
}
