package addressbook;

import javax.persistence.*;

@Entity
public class BuddyInfo {

    private String name;
    private String phoneNumber;

    @ManyToOne
    private AddressBook ab;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    public BuddyInfo(){

    }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
