package models;

/**
 * Person Object Model.
 */
public class Person {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Unique Identifier.
     */
    Integer Id;

    /**
     * First Name.
     */
    String FirstName;
    
    /**
     * Last Name.
     */
    String LastName;
}
