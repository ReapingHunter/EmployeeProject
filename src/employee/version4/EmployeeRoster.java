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
        for(x = 0; x < MAX; x++) {
            if(empList[x] instanceof type){
                
            }
        }
    }
    
    public void displayAllEmployee() {
        int x;
        for(x = 0; x < MAX; x++){
            System.out.println(empList[x]);
        }
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
        empList[count].setID(e.getID());
        empList[count].setName(e.getName());
    }
    
    public Employee removeEmployee(int id) {
        
    }
    
    public void updateEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate) {
        
    }
    
    public EmployeeRoster searchEmployee() {
        
    }
    @Override
    public String toString(){
        int x = 0;
        return String.format("| %s | %s | %s | %s |",empList[x].getID(), empList[x].getName(), empList[x].type, empList[x].computeSalary());
    }
}
