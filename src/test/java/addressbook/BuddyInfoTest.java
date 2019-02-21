package addressbook;

import addressbook.BuddyInfo;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by supriyagadigone on 2019-01-08.
 */
public class BuddyInfoTest extends TestCase {
    private BuddyInfo b1 = null;
    private BuddyInfo b2 = null;

    @org.junit.Before
    public void setUp() {
        b1 = new BuddyInfo("Sam", "123");
        b2 = new BuddyInfo("John", "456");
    }

    @Test
    public void testGetName() {
        assertEquals("Name should be Sam", "Sam", b1.getName());
    }

    @Test
    public void testGetNumber() {
        assertEquals("Number should be 456", "456", b2.getPhoneNumber());
    }

}