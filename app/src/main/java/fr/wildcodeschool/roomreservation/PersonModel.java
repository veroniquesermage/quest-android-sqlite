package fr.wildcodeschool.roomreservation;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by bastienwcs on 21/03/18.
 */

public class PersonModel implements Parcelable {

    private String firstname;
    private String lastname;
    private String address;
    private String language;

    public PersonModel(String firstname, String lastname, String address, String language) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.language = language;
    }

    protected PersonModel(Parcel in) {
        firstname = in.readString();
        lastname = in.readString();
        address = in.readString();
        language = in.readString();
    }

    public static final Creator<PersonModel> CREATOR = new Creator<PersonModel>() {
        @Override
        public PersonModel createFromParcel(Parcel in) {
            return new PersonModel(in);
        }

        @Override
        public PersonModel[] newArray(int size) {
            return new PersonModel[size];
        }
    };

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstname);
        parcel.writeString(lastname);
        parcel.writeString(address);
        parcel.writeString(language);
    }
}
