/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;
import java.time.*;

/**^
 *
 * @author User
 */
public class TestMain {
    
    public static void main(String[] args) {
        int x;
        EmployeeRoster empList = new EmployeeRoster();
        EmployeeRoster searchEmp;
        HourlyEmployee h = new HourlyEmployee(20103264, new Name("Marlex", "Manalili", "Acorin"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 45.4f, 315);
        HourlyEmployee h2 = new HourlyEmployee(1, new Name("The", "Keeper", "K"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 38.8f, 215);
        HourlyEmployee h3 = new HourlyEmployee(154, new Name("Don", "Watson", "Jr.", "W"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 42.4f, 325);
        HourlyEmployee h4 = new HourlyEmployee(36, new Name("The", "Seeker", "S"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 46.4f, 318);
        
        PieceWorkerEmployee pw = new PieceWorkerEmployee(234, new Name("Jenny", "Diane"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 254, 215);
        PieceWorkerEmployee pw2 = new PieceWorkerEmployee(2, new Name("The", "Seeker", "S"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 98, 124);
        
        CommissionEmployee c = new CommissionEmployee(123, new Name("Matthew Cedric", "Calaycay"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 43526);
        CommissionEmployee c2 = new CommissionEmployee(456, new Name("Sean","Duran"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 314567);
        CommissionEmployee c3 = new CommissionEmployee(32, new Name("Jared", "Schulz"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 574839);
        CommissionEmployee c4 = new CommissionEmployee(78, new Name("Rey", "Laurence"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 125342);
        CommissionEmployee c5 = new CommissionEmployee(13, new Name("Angelo", "Pumar"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 30029);
        CommissionEmployee c6 = new CommissionEmployee(14, new Name("Josilito", "Yap"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 62839);
        
        BasePlusCommissionEmployee b = new BasePlusCommissionEmployee(43, new Name("Carpet", "Price"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 43526, 15000);
        BasePlusCommissionEmployee b2 = new BasePlusCommissionEmployee(299, new Name("Sorting","Souls"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 314567, 25000);
        BasePlusCommissionEmployee b3 = new BasePlusCommissionEmployee(100, new Name("Vending", "Machine"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 574839, 50000);
        BasePlusCommissionEmployee b4 = new BasePlusCommissionEmployee(1234, new Name("The", "Employees"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 125342, 45000);
        BasePlusCommissionEmployee b5 = new BasePlusCommissionEmployee(1345, new Name("Cities", "Cities"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 30029, 250);
        BasePlusCommissionEmployee b6 = new BasePlusCommissionEmployee(2456, new Name("The", "Monopoly"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 62839, 13000);
        BasePlusCommissionEmployee b7 = new BasePlusCommissionEmployee(900, new Name("The", "Frankenstein"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 999999, 25000);
        BasePlusCommissionEmployee b8 = new BasePlusCommissionEmployee(1324, new Name("Secret", "Encryption"), LocalDate.of(2015, 5, 14), LocalDate.of(2003, 5, 13), 162839, 75000);

        empList.addEmployee(h2);
        empList.addEmployee(h);
        empList.addEmployee(h4);
        empList.addEmployee(h3);
        empList.addEmployee(pw);
        empList.addEmployee(pw2);
        empList.addEmployee(c2);
        empList.addEmployee(c4);
        empList.addEmployee(c6);
        empList.addEmployee(c5);
        empList.addEmployee(c);
        empList.addEmployee(c3);
        empList.addEmployee(b);
        empList.addEmployee(b2);
        empList.addEmployee(b3);
        empList.addEmployee(b4);
        empList.addEmployee(b5);
        empList.addEmployee(b6);
        empList.addEmployee(b7);
        empList.addEmployee(b8);
        empList.removeEmployee(32);
        empList.updateEmployee(43, new Name("The", "Cringer"), LocalDate.MIN, LocalDate.MIN);
        empList.displayEmployee(c3);
        empList.displayAllEmployee();
        searchEmp = empList.searchEmployee("the");
        System.out.println(empList.countHE());
    }
}

