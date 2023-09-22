/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;
import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author Marlex
 */
public class Employee {
    private int empID;
    private Name empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    
    public Employee(){
        
    }
    
    public Employee(int id, Name name, LocalDate hireDate, LocalDate birthDate){
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
    }

    public int getID() {
        return empID;
    }

    public void setID(int id) {
        this.empID = id;
    }

    public Name getName() {
        return empName;
    }

    public void setName(Name name) {
        this.empName = name;
    }

    public LocalDate getHireDate() {
        return empDateHired;
    }

    public void setHireDate(LocalDate hireDate) {
        this.empDateHired = hireDate;
    }

    public LocalDate getBirthDate() {
        return empBirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.empBirthDate = birthDate;
    }
    public DateTimeFormatter convert() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return formatter;
    }

    public Formatter format(double d) {
        Formatter formatter = new Formatter();
        formatter.format("%.2f", d);
        return formatter;
    }
    
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Employee Information: "
                + "\nID: " + this.empID
                + "\nName: " + this.empName.toString()
                + "\nDate Hired: " + convert().format(this.empDateHired)
                + "\nDate of Birth: " + convert().format(this.empBirthDate));
    }
}
