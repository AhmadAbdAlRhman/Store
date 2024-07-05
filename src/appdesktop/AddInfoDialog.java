package appdesktop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInfoDialog extends JDialog {
    private JTextField nameField;
    private JTextField infoField;
    private JButton addButton;

    public AddInfoDialog(Frame parent) {
        super(parent, "Add Information", true);
        setLayout(new GridLayout(3, 2));
        setSize(300, 150);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel infoLabel = new JLabel("Info:");
        infoField = new JTextField();
        addButton = new JButton("Add");

        add(nameLabel);
        add(nameField);
        add(infoLabel);
        add(infoField);
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the add button click event
                String name = nameField.getText();
                String info = infoField.getText();
                JOptionPane.showMessageDialog(parent, "Name: " + name + "\nInfo: " + info);
                // Close the dialog
                setVisible(false);
                dispose();
            }
        });

        setLocationRelativeTo(parent);
    }
}
