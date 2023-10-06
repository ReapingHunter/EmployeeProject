/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;
import java.time.*;
import java.util.*;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    private String format = "| %-15s | %-30s | %-30s | %-15s |";
    
    public EmployeeRoster() {
        empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public String getFormat() {
        return format;
    }
    
    public void displayEmployee(Employee type) {
        System.out.println(String.format(format, "ID ","Name", "Type", "Salary"));
        for(Employee emp : empList) {
            if(emp.getClass() == type.getClass()) {
                System.out.println(String.format(format,emp.getID(), emp.getName(), emp.getClass().getSimpleName(), String.format("%.2f", emp.computeSalary())));
            }
        }
        System.out.println("\n");
        
    }
    
    public void displayAllEmployee() {
        System.out.println(String.format(format, "ID","Name", "Type", "Salary"));
        for(Employee emp : empList){
            System.out.println(String.format(format,emp.getID(), emp.getName(), emp.getClass().getSimpleName(), String.format("%.2f", emp.computeSalary())));
        }
        System.out.println("\n");
    }
    
    private boolean isInstance(Employee emp, String type) {
        boolean bool;
        switch(type.toUpperCase()) {
            case "HE" ->
                bool = (emp instanceof HourlyEmployee);
            case "PWE" ->
                bool = (emp instanceof PieceWorkerEmployee);
            case "CE" ->
                bool = (emp instanceof CommissionEmployee);
            case "BPCE" ->
                bool = (emp instanceof BasePlusCommissionEmployee);
            default ->
                bool = false;
        }
        return bool;
    }
    
    public int countHE() {
        int c = 0;
        for(Employee emp : empList) {
            if(isInstance(emp, "HE")) {
                c++;
            }
        }
        return c;
    }
    
    public int countPWE() {
        int c = 0;
        for(Employee emp : empList) {
            if(isInstance(emp, "PWE")) {
                c++;
            }
        }
        return c;
    }
    
    public int countCE() {
        int c = 0;
        for(Employee emp : empList) {
            if(isInstance(emp, "CE")) {
                c++;
            }
        }
        return c;
    }
    
    public int countBPCE() {
        int c = 0;
        for(Employee emp : empList) {
            if(isInstance(emp, "BPCE")) {
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
        } else {
            System.out.println("No match found...\n");
        }
        return emp;
    }
}
