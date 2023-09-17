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
public class TestMain {
    
    public static void main(String[] args) {
        double salary;
        double pSalary;
        double cSalary;
        double bSalary;
        HourlyEmployee emp = new HourlyEmployee(40, new Name("Marlex Lance", "Manalili", "Acorin"), LocalDate.of(2013, Month.OCTOBER, 15), LocalDate.of(2003, Month.MAY, 13), 45.8f, 275);
        HourlyEmployee emp2 = new HourlyEmployee();
        HourlyEmployee emp3 = new HourlyEmployee(58, new Name("John", "Doe"), LocalDate.of(2016, 10, 19), LocalDate.of(2004, 11, 23), 300);
        
        PieceWorkerEmployee pEmp = new PieceWorkerEmployee(5, new Name("The", "Keeper"), LocalDate.of(2000, Month.DECEMBER, 15), LocalDate.of(1, Month.DECEMBER, 16), 245, 290);
        PieceWorkerEmployee pEmp2 = new PieceWorkerEmployee();
        PieceWorkerEmployee pEmp3 = new PieceWorkerEmployee(72, new Name("Kevin", "Kaslana"), LocalDate.of(2018, 8, 17), LocalDate.of(2003, 11, 17), 210);
        
        CommissionEmployee cEmp = new CommissionEmployee(78, new Name("The", "Seeker"), LocalDate.of(2002, Month.AUGUST, 20), LocalDate.of(2, Month.APRIL, 1), 500000);
        CommissionEmployee cEmp2 = new CommissionEmployee();
        CommissionEmployee cEmp3 = new CommissionEmployee(67, new Name("Alpha", "Roberts"), LocalDate.of(2019, 12, 11), LocalDate.of(2002, 1, 20));
        
        BasePlusCommissionEmployee bEmp = new BasePlusCommissionEmployee(78, new Name("The", "Seeker"), LocalDate.of(2002, Month.AUGUST, 20), LocalDate.of(2, Month.APRIL, 1), 456789, 50000);
        BasePlusCommissionEmployee bEmp2 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee bEmp3 = new BasePlusCommissionEmployee(67, new Name("Alpha", "Roberts"), LocalDate.of(2016, 8, 19), LocalDate.of(2001, 2, 14), 30000);
        
        emp2.setID(41);
        emp2.setName(new Name("Jane", "Doe", "Daphne"));
        emp2.getName().setPrefix("Mrs.");
        emp2.setHireDate(LocalDate.of(2015, 10, 11));
        emp2.setBirthDate(LocalDate.of(2002, 12, 24));
        emp2.setTotalHours(40);
        emp2.setHourlyRate(232);
        
        pEmp2.setID(43);
        pEmp2.setName(new Name("Ben", "Person"));
        pEmp2.getName().setSuffix("Jr.");
        pEmp2.setHireDate(LocalDate.of(2015, 11, 11));
        pEmp2.setBirthDate(LocalDate.of(2002, 11, 24));
        pEmp2.setTotalPiecesFinished(98);
        pEmp2.setRatePerPiece(139);
        
        cEmp2.setID(45);
        cEmp2.setName(new Name("The", "Watcher"));
        cEmp2.setHireDate(LocalDate.of(2015, 12, 13));
        cEmp2.setBirthDate(LocalDate.of(3, 12, 27));
        cEmp2.setTotalSales(58943);
        
        bEmp2.setID(52);
        bEmp2.setName(new Name("Wade", "Joyce"));
        bEmp2.getName().setPrefix("Mr.");
        bEmp2.getName().setSuffix("Sr.");
        bEmp2.setHireDate(LocalDate.of(2016, 2, 18));
        bEmp2.setBirthDate(LocalDate.of(2001, 5, 27));
        bEmp2.setTotalSales(58943);
        bEmp2.setBaseSalary(45000);
        
        salary = emp2.computeSalary();
        pSalary = pEmp2.computeSalary();
        cSalary = cEmp2.computeSalary();
        bSalary = bEmp2.computeSalary();
        
        emp.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        
        pEmp.displayInfo();
        pEmp2.displayInfo();
        pEmp3.displayInfo();
        
        cEmp.displayInfo();
        cEmp2.displayInfo();
        cEmp3.displayInfo();
        
        bEmp.displayInfo();
        bEmp2.displayInfo();
        bEmp3.displayInfo();
        
        System.out.println(salary);
        System.out.println(pSalary);
        System.out.println(cSalary);
        System.out.println(bSalary);
    }
    
}

