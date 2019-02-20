package addressbook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {

    List<BuddyInfo> findByName(String name);
}

