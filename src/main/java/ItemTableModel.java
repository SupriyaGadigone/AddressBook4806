import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by supriyagadigone on 2019-01-22.
 */
public class ItemTableModel extends AbstractTableModel {
    List itemList;
    AddressBook ab;

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public int getRowCount() {
        return itemList.size();
    }

    public int getColumnCount() {
        return 1;
    }

    public void setValueAt(Object value,
                           int rowIndex, int columnIndex) {
        itemList.set(rowIndex, value);

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex);
    }
}
