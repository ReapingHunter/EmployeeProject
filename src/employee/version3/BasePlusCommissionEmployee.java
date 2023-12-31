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
        salary = super.computeSalary() + this.baseSalary;
        return salary;
    }
    
    @Override
    public void displayInfo() {
        System.out.println(this + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
    
    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nBase Salary: " + format(this.baseSalary));
    }

}
