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
public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, int totalPieces, float rate) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        totalPiecesFinished = totalPieces;
        ratePerPiece = rate;
    }

    public PieceWorkerEmployee(int id, String name, LocalDate hireDate, LocalDate birthDate, float rate) {
        empID = id;
        empName = name;
        empDateHired = hireDate;
        empBirthDate = birthDate;
        ratePerPiece = rate;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        double salary;
        salary = this.totalPiecesFinished * this.ratePerPiece + (this.ratePerPiece * 10 * (this.totalPiecesFinished / 100));
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
                + "\nID: " + this.empID
                + "\nName: " + this.empName
                + "\nDate Hired: " + convert().format(this.empDateHired)
                + "\nDate of Birth: " + convert().format(this.empBirthDate)
                + "\nTotal Pieces Finished: " + this.totalPiecesFinished
                + "\nRate per Piece: " + format(this.ratePerPiece)
                + "\nSalary: " + format(this.computeSalary()) + "\n");
    }
}
