package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ab")
    private List<BuddyInfo> buddyInfoObjects = new ArrayList<BuddyInfo>();

    public AddressBook(){

    }

    public AddressBook(List<BuddyInfo> buddyInfoObjects) {
        this.buddyInfoObjects = buddyInfoObjects;
    }

    public void addBuddy(BuddyInfo b) {
        if (b != null) {
            buddyInfoObjects.add(b);
        }
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < buddyInfoObjects.size()) {
            buddyInfoObjects.remove(index);
        }
    }

    public int size()
    {
        return buddyInfoObjects.size();
    }

    public void clear()
    {
        buddyInfoObjects.clear();
    }

    public List<BuddyInfo> getBuddyInfoObjects() {
        return buddyInfoObjects;
    }

    public void setBuddyInfoObjects(List<BuddyInfo> buddyInfoObjects) {
        this.buddyInfoObjects = buddyInfoObjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
