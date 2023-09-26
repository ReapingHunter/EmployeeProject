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
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, float totalHours, float hourlyRate) {
        super(id, name, hireDate, birthDate);
        totalHoursWorked = totalHours;
        ratePerHour = hourlyRate;
    }

    public HourlyEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, float hourlyRate) {
        super(id, name, hireDate, birthDate);
        ratePerHour = hourlyRate;
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

    @Override
    public double computeSalary() {
        float overtimeHours = 0;
        if (this.totalHoursWorked > 40) {
            overtimeHours = this.totalHoursWorked - 40;
        }
        float necessaryHours = this.totalHoursWorked - overtimeHours;
        return this.ratePerHour * necessaryHours + (overtimeHours * this.ratePerHour * 1.5);
    }
    
    
    @Override
    public void displayInfo() {
        System.out.println(this + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
    
    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nTotal Hours Worked: " + this.totalHoursWorked
                + "\nRate per Hour: " + this.ratePerHour);
    }

}
