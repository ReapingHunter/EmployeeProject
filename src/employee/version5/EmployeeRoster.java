/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;
import java.time.*;
import java.util.*;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    private String format = "| %-15s | %-30s | %-30s | %-15s |\n";
    
    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
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
        for(Employee emp : empList) {
            if(emp.getClass() == type.getClass()) {
                System.out.printf(format, emp.getID(), emp.getName(), emp.getClass().getSimpleName(), emp.format(getSalary(emp)));
            }
        }
        System.out.println("\n");
        
    }
    
    public void displayAllEmployee() {
        for(Employee emp : empList){
            System.out.printf(format, emp.getID(), emp.getName(), emp.getClass().getSimpleName(), emp.format(getSalary(emp)));
        }
        System.out.println("\n");
    }
    
    public int countHE() {
        int x;
        int c = 0;
        for(Employee emp : empList) {
            if(emp instanceof HourlyEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countPWE() {
        int x;
        int c = 0;
        for(Employee emp : empList) {
            if(emp instanceof PieceWorkerEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countCE() {
        int x;
        int c = 0;
         for(Employee emp : empList) {
            if(emp instanceof CommissionEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public int countBPCE() {
        int x;
        int c = 0;
         for(Employee emp : empList) {
            if(emp instanceof BasePlusCommissionEmployee) {
                c++;
            }
        }
        return c;
    }
    
    public boolean addEmployee(Employee ... e) {
        if(e != null) {
            empList.addAll(Arrays.asList(e));
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id) {
        for(Employee emp : empList) {
            if(emp != null && emp.getID() == id) {
                empList.remove(emp);
                return emp;
            }
        }
        return null;
        
    }
    
    public boolean updateEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate) {
        for(Employee emp : empList){
            if(emp != null && emp.getID() == id) {
                emp.setName(name);
                emp.setHireDate(hireDate);
                emp.setBirthDate(birthDate);
                return true;
            }
        }
        return false;
        
    }
    
    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster emp = new EmployeeRoster();
        int bool = 0;
        for(Employee x : empList) {
            if(x.getName().toString().toLowerCase().contains(keyword.toLowerCase())) {
                emp.empList.add(x);
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
