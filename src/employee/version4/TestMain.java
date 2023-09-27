/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;
import java.time.*;

/**^
 *
 * @author User
 */
public class TestMain {
    
    public static void main(String[] args) {
        EmployeeRoster empList = new EmployeeRoster(20);
        HourlyEmployee h = new HourlyEmployee(20103264, new Name("Marlex", "Manalili", "Acorin"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 45.4f, 315);
        HourlyEmployee h2 = new HourlyEmployee(1, new Name("The", "Keeper", "K"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 45.4f, 315);
        empList.addEmployee(h2);
        empList.addEmployee(h);
        empList.displayEmployee(h);
        System.out.println(empList.countHE());
    }
}

