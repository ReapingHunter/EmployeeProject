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
public class PieceWorkerEmployee extends Employee {

    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, int totalPieces, float rate) {
        super(id, name, hireDate, birthDate);
        totalPiecesFinished = totalPieces;
        ratePerPiece = rate;
    }

    public PieceWorkerEmployee(int id, Name name, LocalDate hireDate, LocalDate birthDate, float rate) {
        super(id, name, hireDate, birthDate);
        ratePerPiece = rate;
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

    @Override
    public double computeSalary() {
        return this.totalPiecesFinished * this.ratePerPiece + (this.ratePerPiece * 10 * (this.totalPiecesFinished / 100));
    }

    @Override
    public void displayInfo() {
        System.out.println(this + "\nSalary: " + this.computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return String.format(super.toString()
                + "\nTotal Pieces Finished: " + this.totalPiecesFinished
                + "\nRate per Piece: " + this.ratePerPiece);
    }
}
