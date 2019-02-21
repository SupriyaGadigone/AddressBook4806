package addressbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-22.
 */

@SpringBootApplication
//public class AddressBookApplication implements CommandLineRunner{
public class AddressBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookApplication.class, args);
    }

//    @Autowired
//    AddressBookRepository abr;
//
//    @Autowired
//    BuddyInfoRepository bir;
//
//    private static final Logger log = LoggerFactory.getLogger(AddressBookApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(AddressBookApplication.class);
//    }
//
//    @Override
//    public void run(String... arg0) throws Exception {
//        clearData();
//        saveData();
//        showData();
//    }
//
//    @Transactional
//    private void clearData(){
//        abr.deleteAll();
//        bir.deleteAll();
//    }
//
//    @Transactional
//    private void saveData(){
//        saveDataWithApproach1();
//        //saveDataWithApproach2();
//    }
//
//    private void saveDataWithApproach1(){
//        AddressBook a1 = new AddressBook();
//        BuddyInfo b1 = new BuddyInfo("Chloe", "456");
//        BuddyInfo b2 = new BuddyInfo("Kim", "789");
//        a1.addBuddy(b1);
//        a1.addBuddy(b2);
//
//        AddressBook a2 = new AddressBook();
//        BuddyInfo b3 = new BuddyInfo("Chloe", "456");
//        BuddyInfo b4 = new BuddyInfo("Kim", "789");
//        a2.addBuddy(b3);
//        a2.addBuddy(b4);
//
//        abr.save(a1);
//        abr.save(a2);
//    }
//
//
//    @Transactional
//    private void showData(){
//        // fetch all customers
//        log.info("AddressBook found with findAll():");
//        log.info("-------------------------------");
//        for (AddressBook addressBook : abr.findAll()) {
//            log.info(addressBook.toString());
//            //log.info(addressBook.size()+"");
//        }
//
//        // abr.findById(1);
//
//        abr.findById(1);
//
//
//        log.info("");
//    }
//
//    private void saveDataWithApproach2(){
//
//        BuddyInfo b1 = new BuddyInfo("Chloe", "456");
//        BuddyInfo b2 = new BuddyInfo("Kim", "789");
//        BuddyInfo b3 = new BuddyInfo("Chloe", "456");
//        BuddyInfo b4 = new BuddyInfo("Kim", "789");
//
//        bir.save(b1);
//        bir.save(b2);
//        bir.save(b3);
//        bir.save(b4);
//
//        AddressBook a1 = new AddressBook();
//        a1.addBuddy(b1);
//        a1.addBuddy(b2);
//
//        AddressBook a2 = new AddressBook();
//
//        a2.addBuddy(b3);
//        a2.addBuddy(b4);
//
//        abr.save(a1);
//        abr.save(a2);
//    }

}


