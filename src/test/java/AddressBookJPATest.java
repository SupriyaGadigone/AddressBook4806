import addressbook.AddressBook;
import addressbook.BuddyInfo;
import junit.framework.TestCase;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-15.
 */
public class AddressBookJPATest  extends TestCase {
    private static BuddyInfo b1;
    private static BuddyInfo b2;
    private static AddressBook a;

    @Test
    public void testBuddy(){

        b1 = new BuddyInfo();
        b1.setId(1);
        b1.setName("Sam");
        b1.setPhoneNumber("123");

        b2 = new BuddyInfo();
        b2.setId(2);
        b2.setName("John");
        b2.setPhoneNumber("456");

        a = new AddressBook();
        a.setId(1);
        a.addBuddy(b1);
        a.addBuddy(b2);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the buddyinfo entity objects
        em.persist(b1);
        em.persist(b2);
        em.persist(a);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT a FROM AddressBook a");
        Query q2 = em.createQuery("SELECT ab FROM BuddyInfo ab");

        @SuppressWarnings("unchecked")
        List<AddressBook> addressBookList = q.getResultList();
        List<BuddyInfo> buddyInfoList = q2.getResultList();

        System.out.println("");
        System.out.println("List of addressbook.AddressBook\n----------------");

        //Print out information in addressbook.AddressBook
        for (AddressBook ab : addressBookList) {
            //ab.printAddressBook();
            System.out.println( " (id=" + ab.getId() + ")");
        }

        System.out.println("");
        System.out.println("List of addressbook.BuddyInfo\n----------------");
        //Print out information mapped by ab - addressbook identifier
        for (BuddyInfo bi : buddyInfoList) {
            System.out.println(bi.getName() + " (id=" + bi.getId() + ")");
        }

        if(buddyInfoList.get(0).getId() == 1) {
            assertEquals("Sam", buddyInfoList.get(0).getName());
            assertEquals("123", buddyInfoList.get(0).getPhoneNumber());
        }
        if(buddyInfoList.get(0).getId() == 2) {
            assertEquals("John", buddyInfoList.get(0).getName());
            assertEquals("456", buddyInfoList.get(0).getPhoneNumber());
        }

        // Closing connection
        em.close();
        emf.close();

    }


}
