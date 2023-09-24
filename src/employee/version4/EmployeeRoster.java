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
    private String format = "| %s | %s | %s | %s | %s |"
    
    public EmployeeRoster() {
        empList = new Employee[MAX];
        count = 0;
    }
    
    public EmployeeRoster(int size) {
        MAX = size;
        this();
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
    
    public void displayEmployee(Employee e) {

    }
    
    public void displayAllEmployee() {

    }
    
    public int countHE() {
        
    }
    
    public int countPWE() {
        
    }
    
    public int countCE() {
        
    }
    
    public int countBPCE() {
        
    }
    
    public boolean addEmployee(Employee e) {
        
    }
    
    public Employee removeEmployee(int id) {
        
    }
    
    public void updateEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate) {
        
    }
    
    public EmployeeRoster searchEmployee() {
        
    }
    
}


