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
public class CommissionEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, double sales) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        totalSales = sales;
    }

    public CommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate) {
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double TotalSales) {
        this.totalSales = TotalSales;
    }

    public double computeSalary() {
        double salary;
        if (this.totalSales < 50000) {
            salary = this.totalSales * 0.05;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000) {
            salary = this.totalSales * 0.2;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000) {
            salary = this.totalSales * 0.3;
        } else {
            salary = this.totalSales * 0.5;
        }
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
                + "\nTotal Sales: " + format(this.totalSales)
                + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
}
