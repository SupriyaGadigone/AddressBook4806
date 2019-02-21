package addressbook;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Referenced Kshamina's code <not my work>
 */
@Controller
public class AddressBookController {

    @Autowired
    BuddyInfoRepository repository;

    @GetMapping("/addressbook")
    public String greetingForm(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "addressbook";
    }

    @PostMapping("/addressbook")
    public String add(@ModelAttribute BuddyInfo buddy, Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        repository.save(buddy);
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "result";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("name") String name, Model model) {
        BuddyInfo b = repository.findByName(name).get(0);
        repository.delete(b);
        model.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "result";
    }


}
