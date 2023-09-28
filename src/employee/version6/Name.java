/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;


/**
 *
 * @author Marlex
 */
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private String prefix;
    
    public Name() {
        firstName = "";
        lastName = "";
        suffix = "";
        middleName = "";
        prefix = "";
    }
    
    public Name(String fname, String lname){
        firstName = fname;
        lastName = lname;
        suffix = "";
        middleName = "";
        prefix = "";
    }
    
    public Name(String fname, String lname, String mname){
        firstName = fname;
        lastName = lname;
        middleName = mname;
        suffix = "";
        prefix = "";
    }
    
    public Name(String fname, String lname, String suff, String mname){
        firstName = fname;
        lastName = lname;
        suffix = suff;
        middleName = mname;
        prefix = "";
    }
    
    public Name(String fname, String lname, String suff, String mname, String pref){
        firstName = fname;
        lastName = lname;
        suffix = suff;
        middleName = mname;
        prefix = pref;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public void displayInfo() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return String.format(this.prefix + " " + this.firstName + " " + this.middleName + " " + this.lastName + " " + this.suffix);
    }
    
}
