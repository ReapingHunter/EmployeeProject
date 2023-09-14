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
public class BasePlusCommissionEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, double sales, double salary) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        totalSales = sales;
        baseSalary = salary;
    }

    public BasePlusCommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, double salary) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        baseSalary = salary;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double BaseSalary) {
        this.baseSalary = BaseSalary;
    }

    public double computeSalary() {
        double salary;
        if (this.totalSales < 50000) {
            salary = this.totalSales * 0.05 + this.baseSalary;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000) {
            salary = this.totalSales * 0.2 + this.baseSalary;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000) {
            salary = this.totalSales * 0.3 + this.baseSalary;
        } else {
            salary = this.totalSales * 0.5 + this.baseSalary;
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
                + "\nID: " + this.getID()
                + "\nName: " + this.getName()
                + "\nDate Hired: " + convert().format(this.getHireDate())
                + "\nDate of Birth: " + convert().format(this.getBirthDate())
                + "\nTotal Sales: " + format(this.totalSales)
                + "\nBase Salary: " + format(this.baseSalary)
                + "\nSalary: " + format(this.computeSalary()) + "\n");
    }

}
