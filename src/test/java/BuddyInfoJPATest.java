

import addressbook.BuddyInfo;
import junit.framework.TestCase;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-15.
 */
public class BuddyInfoJPATest  extends TestCase {
    private static BuddyInfo b1;
    private static BuddyInfo b2;

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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();

        // Creating a new transaction
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Persisting the buddyinfo entity objects
        em.persist(b1);
        em.persist(b2);

        tx.commit();

        // Querying the contents of the database using JPQL query
        Query q = em.createQuery("SELECT b FROM BuddyInfo b");

        @SuppressWarnings("unchecked")
        List<BuddyInfo> results = q.getResultList();

        System.out.println("");
        System.out.println("List of addressbook.BuddyInfo\n----------------");
        for(BuddyInfo b: results){
            System.out.println(b.getName() + " id: " + b.getId());
        }

        if(results.get(0).getId() == 1) {
            assertEquals("Sam", results.get(0).getName());
            assertEquals("123", results.get(0).getPhoneNumber());
        }
        if(results.get(0).getId() == 2) {
            assertEquals("John", results.get(0).getName());
            assertEquals("456", results.get(0).getPhoneNumber());
        }

        // Closing connection
        em.close();
        emf.close();

    }


}