package fr.wildcodeschool.roomreservation;

/**
 * Created by bastienwcs on 21/03/18.
 */

public class PersonModel {

    private long id;
    private String firstname;
    private String lastname;

    public PersonModel(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
