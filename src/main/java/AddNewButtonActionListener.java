/**
 * Created by supriyagadigone on 2019-01-22.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class AddNewButtonActionListener extends ListTableActionListener {
    public void actionPerformed(ActionEvent e) {
        //String name = JOptionPane.showInputDialog("Buddy name");
        setDialogue();

        table.revalidate();
    }

    private void setDialogue(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(8, 8, 8, 8);

        JLabel label;

        label = new JLabel("Buddy Name");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label, constraints);

        JTextField buddyNameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(buddyNameField, constraints);

        label = new JLabel("Phone Number");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(label, constraints);

        JTextField phoneNumField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(phoneNumField, constraints);


        Object[] options = {"OK", "CANCEL"};

        int result = JOptionPane.showOptionDialog(null, panel, null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (result == 0) {

            String budName = buddyNameField.getText();

            String phonNum = phoneNumField.getText();

            BuddyInfo b = new BuddyInfo(budName,phonNum);
            ablist.addBuddy(b);
            list.add(budName + "                   " + phonNum);

        }



    }
}