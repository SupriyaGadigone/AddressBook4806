import javax.swing.*;
import java.awt.*;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
public class MainFrame extends JFrame {
    public void init() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));

        //AddressBook a = new AddressBook();

        setVisible(true);
        setState(Frame.NORMAL);
        show();
    }


}