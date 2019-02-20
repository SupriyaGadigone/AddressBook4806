import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
public abstract class ListTableActionListener
        implements ActionListener {
    protected JTable table;
    protected List list;
    protected AddressBook ablist;

    public ListTableActionListener(){
        ablist = new AddressBook();
    }

    public AddressBook getAblist() {
        return ablist;
    }

    public void setAblist(AddressBook ablist) {
        this.ablist = ablist;
    }



    public void setList(List list) {
        this.list = list;
    }

    public void setTable(JTable itemTable) {
        this.table = itemTable;
    }
}
