
package aonhay;

import java.util.Date;

public abstract class Person implements IPerson {
    String ID;
    String fullName;
    Date dateOfBird;
    public Person(String ID, String fullName, Date dateOfBird) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateOfBird = dateOfBird;
    }

    public Person() {
        
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
    
    
    public abstract void displayInfor();
}
