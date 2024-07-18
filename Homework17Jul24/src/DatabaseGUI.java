import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class DatabaseGUI extends JFrame implements ActionListener {
    private JTextArea textArea = new JTextArea(20, 50);
    private JTextField idField = new JTextField(10);
    private JTextField nameField = new JTextField(10);
    private JTextField surnameField = new JTextField(10);
    private JTextField payField = new JTextField(10);
    private JButton retrieveButton = new JButton("Retrieve Data");
    private JButton deleteButton = new JButton("Delete Data");
    private JButton updateButton = new JButton("Update Data");
    private  JLabel idLabel = new JLabel("ID");
    private  JLabel nameLabel = new JLabel("Name");
    private  JLabel surnameLabel = new JLabel("Surname");
    private  JLabel payLabel = new JLabel("Pay");
    private ConnectionDB connectionDB;
    private JScrollPane textAre = new JScrollPane(textArea);

    public DatabaseGUI() {
        connectionDB = new ConnectionDB();

        setTitle("Database GUI");
        setSize(800, 800);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(textAre);
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(surnameLabel);
        add(surnameField);
        add(payLabel);
        add(payField);
        add(retrieveButton);
        add(deleteButton);
        add(updateButton);

        retrieveButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == retrieveButton) {
            try {
                retrieveData();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == deleteButton) {
            try {
                deleteData();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } else if (e.getSource() == updateButton) {
            try {
                updateData();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private void retrieveData() throws SQLException {
        String data = connectionDB.retrieveData();
        textArea.setText(data);
    }

    private void deleteData() throws SQLException {
        String id = idField.getText();
        connectionDB.delete(id);
        textArea.setText("Deleted data with ID: " + id);
    }

    private void updateData() throws SQLException {
        String id = idField.getText();
        String name = nameField.getText();
        String surname = surnameField.getText();
        String pay = payField.getText();
        connectionDB.update(id, name, surname, pay);
        textArea.setText("Updated data with ID: " + id);
    }
}