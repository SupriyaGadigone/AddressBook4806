package addressbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
@SpringBootApplication
public class BuddyInfoApplication {

    private static final Logger log = LoggerFactory.getLogger(BuddyInfoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BuddyInfoApplication.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a couple of buddies
            repository.save(new BuddyInfo("Jack", "123"));
            repository.save(new BuddyInfo("Chloe", "456"));
            repository.save(new BuddyInfo("Kim", "789"));
            repository.save(new BuddyInfo("David", "101"));
            repository.save(new BuddyInfo("Michelle", "1233"));

            // fetch all customers
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo b : repository.findAll()) {
                log.info(b.toString());
            }
            log.info("");

            // fetch an individual absb.BuddyInfo by ID
            repository.findById(1)
                    .ifPresent(customer -> {
                        log.info("absb.BuddyInfo found with findById(1):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

//            // fetch buddies by last name
            log.info("Customer found with findByName('Bauer'):");
            log.info("--------------------------------------------");
            log.info(repository.findByName("Bauer").toString());


            log.info("");
        };
    }

}
