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
        return super.computeSalary() + this.baseSalary;
    }
    
    @Override
    public void displayInfo() {
        System.out.println(this + "\nSalary: " + this.computeSalary() + "\n");
    }
    
    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nBase Salary: " + this.baseSalary);
    }

}
