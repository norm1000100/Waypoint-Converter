import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UI {

    private File minecraft_folder;
    public void createAndShowGUI() {

        Desktop explorer = Desktop.getDesktop();

        //Create and set up the window.
        JFrame frame = new JFrame("Voxel Map Waypoint Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new GroupLayout(panel);
        // Panel layout and spacing
        panel.setLayout(layout);
        JButton folder_select = new JButton("Select Folder");
        final JLabel label = new JLabel();
        folder_select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option = fileChooser.showOpenDialog(frame);
                if(option == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    label.setText("Folder Selected: " + file.getName());
                }else{
                    label.setText("Open command canceled");
                }
            }
        });

    }
}
