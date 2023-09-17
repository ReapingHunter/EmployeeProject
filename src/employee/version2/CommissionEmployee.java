/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.time.*;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{

    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, double sales) {
        super(id, name, hireDate, birthDate);
        totalSales = sales;
    }

    public CommissionEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate) {
        super(id, name, hireDate, birthDate);
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

    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nTotal Sales: " + format(this.totalSales)
                + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
}
