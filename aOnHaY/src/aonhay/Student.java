
package aonhay;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student extends Person {
    Float GPA;
    String Major;

    public Student(Float GPA, String Major, String ID, String fullName, Date dateOfBird) {
        super(ID, fullName, dateOfBird);
        this.GPA = GPA;
        this.Major = Major;
    }

    public Float getGPA() {
        return GPA;
    }

    public void setGPA(Float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }
    public void addStudent() throws ParseException{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ID:");
        String ID = keyboard.nextLine();
        setID(ID);
        System.out.println("Fullname:");
        fullName = keyboard.nextLine();
        setFullName(fullName);
        System.out.println("DateOfBird:");
        String dateOfBirdString = keyboard.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfBird = sdf.parse(dateOfBirdString);
        setDateOfBird(dateOfBird);
        System.out.println();
        System.out.println("GPA:");
        GPA = keyboard.nextFloat();
        setGPA(GPA);
        System.out.println("Major:");
        Major = keyboard.nextLine();
        setMajor(Major);
    }
    public void displayInfor(){
        System.out.println("ID:"+this.getID());
        System.out.println("Fullname:"+this.getFullName());
        System.out.println("DateOfBirth:"+this.getDateOfBird());
        System.out.println("GPA:"+this.getGPA());
        System.out.println("Major:"+this.getMajor());
    }

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
