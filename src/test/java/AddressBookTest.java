
import addressbook.AddressBook;
import addressbook.BuddyInfo;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by supriyagadigone on 2019-01-08.
 */
public class AddressBookTest extends TestCase {
    private BuddyInfo b = null;
    private AddressBook a = null;

    @Before
    public void setUp() {
        b = new BuddyInfo("Sam", "123");
        a = new AddressBook();
    }


    @Test
    public void testOneSize() {
        a.addBuddy(b);
        assertEquals("Size of address book should be 1.", 1, a.size());
    }

    @Test
    public void testRemoveBuddy() {
        a.removeBuddy(0);
        assertEquals("Size of empty address book should be 0.", 0, a.size());
    }


    @Test
    public void testClear() {
        a.clear();
        assertEquals("Size of empty movie list should be 0.",0, a.size());
    }

}