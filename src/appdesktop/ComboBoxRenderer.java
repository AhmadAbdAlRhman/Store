package appdesktop;

import java.awt.*;
import javax.swing.*;

public class ComboBoxRenderer extends JButton implements ListCellRenderer<Object>{
    public ComboBoxRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Component) {
            return (Component) value;
        } else {
            setText(value == null ? "" : value.toString());
            return this;
        }
    }
}
