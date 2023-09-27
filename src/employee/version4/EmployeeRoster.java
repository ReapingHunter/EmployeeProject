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
    private String format = "| %s | %s | %s | %s |\n";
    
    public EmployeeRoster() {
        empList = new Employee[MAX];
        count = 0;
    }
    
    public EmployeeRoster(int size) {
        this();
        MAX = size;
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
    
    public void displayEmployee(Employee type) {
        int x;
        System.out.println(this);
        if(count != 0) {
            for(x = 0; x < count; x++) {
                System.out.printf(format, empList[x].getID(), empList[x].getName(), empList[x].getClass().getSimpleName(), empList[x].getClass().getSimpleName());
            }
        }
        
    }
    
    public void displayAllEmployee() {
        int x;
        for(x = 0; x < count; x++){
            if(empList[x] instanceof HourlyEmployee) {
                
            }
            System.out.println(empList[x]);
        }
    }
    
    public int countHE() {
        int x;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof HourlyEmployee) {
                x++;
            }
        }
        return x;
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
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof CommissionEmployee) {
                x++;
            }
        }
        return x;
    }
    
    public int countBPCE() {
        int x;
        for(x = 0; x < count; x++) {
            if(empList[x] instanceof BasePlusCommissionEmployee) {
                x++;
            }
        }
        return x;
    }
    
    public boolean addEmployee(Employee ... e) {
        for(Employee x : e){
            empList[count++] = x;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id) {
        int x;
        Employee empDel;
        for(x = 0; x < count && empList[x].getID() != id; x++){}
        if(x != count) {
            empDel = empList[x];
            for(;x < --count; x++) {
                empList[x] = empList[x+1];
            }
            empList[x+1] = null;
            return empDel;
        }
        return null;
        
    }
    
    public void updateEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate) {
        int x;
        for(x = 0; x < count && empList[x].getID() != id; x++){}
        empList[x].setID(empList[x].getID());
        empList[x].setName(empList[x].getName());
        empList[x].setHireDate(empList[x].getHireDate());
        empList[x].setBirthDate(empList[x].getBirthDate());
    }
    
//    public EmployeeRoster searchEmployee(String keyword) {
//        EmployeeRoster emp;
//        return emp;
//    }
    @Override
    public String toString(){
        return String.format("|     ID     |     Name     |    Type     |     Salary    |");
    }
}
