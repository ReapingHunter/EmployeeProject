/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;
import java.time.*;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, double sales, double salary) {
        super(id, name, hireDate, birthDate, sales);
        baseSalary = salary;
    }

    public BasePlusCommissionEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, double salary) {
        super(id, name, hireDate, birthDate);
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double BaseSalary) {
        this.baseSalary = BaseSalary;
    }
    
    @Override
    public double computeSalary() {
        double salary;
        if (super.getTotalSales() < 50000) {
            salary = super.getTotalSales() * 0.05 + this.baseSalary;
        } else if (super.getTotalSales() >= 50000 && super.getTotalSales() < 100000) {
            salary = super.getTotalSales() * 0.2 + this.baseSalary;
        } else if (super.getTotalSales() >= 100000 && super.getTotalSales() < 500000) {
            salary = super.getTotalSales() * 0.3 + this.baseSalary;
        } else {
            salary = super.getTotalSales() * 0.5 + this.baseSalary;
        }
        return salary;
    }
    
    @Override
    public String toString() {
        return String.format(super.toString()
                + "Base Salary: " + format(this.baseSalary) + "\n");
    }

}
