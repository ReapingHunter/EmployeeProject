/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.time.*;
import java.time.format.*;
import java.util.*;

/**
 *
 * @author User
 */
public class HourlyEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, float totalHours, float hourlyRate) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        totalHoursWorked = totalHours;
        ratePerHour = hourlyRate;
    }

    public HourlyEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, float hourlyRate) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        ratePerHour = hourlyRate;
    }

    public int getID() {
        return empID;
    }

    public void setID(int id) {
        this.empID = id;
    }

    public String getName() {
        return empName;
    }

    public void setName(String name) {
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

    public float getTotalHours() {
        return totalHoursWorked;
    }

    public void setTotalHours(float totalHours) {
        this.totalHoursWorked = totalHours;
    }

    public float getHourlyRate() {
        return ratePerHour;
    }

    public void setHourlyRate(float hourlyRate) {
        this.ratePerHour = hourlyRate;
    }

    public double computeSalary() {
        double salary;
        float overtimeHours = 0;
        if (this.totalHoursWorked > 40) {
            overtimeHours = this.totalHoursWorked - 40;
        }
        float necessaryHours = this.totalHoursWorked - overtimeHours;
        salary = this.ratePerHour * necessaryHours + (overtimeHours * this.ratePerHour * 1.5);
        return salary;
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
                + "\nName: " + this.empName
                + "\nDate Hired: " + convert().format(this.empDateHired)
                + "\nDate of Birth: " + convert().format(this.empBirthDate)
                + "\nTotal Hours Worked: " + this.getTotalHours()
                + "\nRate per Hour: " + this.getHourlyRate()
                + "\nSalary: " + format(this.computeSalary()) + "\n");
    }

}
