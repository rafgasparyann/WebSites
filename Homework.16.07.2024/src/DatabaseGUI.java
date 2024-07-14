import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class DatabaseGUI extends JFrame implements ActionListener {
    private JTextArea textArea = new JTextArea(20, 50);
    private JTextField idField = new JTextField(10);
    private JButton retrieveButton = new JButton("Retrieve Data");
    private JButton deleteButton = new JButton("Delete Data");
    private ConnectionDB connectionDB;

    public DatabaseGUI() {
        connectionDB = new ConnectionDB();

        setTitle("Database GUI");
        setSize(800, 800);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JScrollPane(textArea));
        add(idField);
        add(retrieveButton);
        add(deleteButton);

        retrieveButton.addActionListener(this);
        deleteButton.addActionListener(this);

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
}
