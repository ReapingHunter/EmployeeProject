/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;
import java.time.*;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{

    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, double sales) {
        super(id, name, hireDate, birthDate);
        totalSales = sales;
    }

    public CommissionEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate) {
        super(id, name, hireDate, birthDate);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double TotalSales) {
        this.totalSales = TotalSales;
    }

    @Override
    public double computeSalary() {
        double [] array = {0.05, 0.2, 0.3, 0.5};
        int ndx;
        if (this.totalSales < 50000) {
            ndx = 0;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000) {
            ndx = 1;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000) {
            ndx = 2;
        } else {
            ndx = 3;
        }
        return this.totalSales * array[ndx];
    }
    
    @Override
    public void displayInfo() {
        System.out.println(this + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
    
    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nTotal Sales: " + format(this.totalSales));
    }
}
