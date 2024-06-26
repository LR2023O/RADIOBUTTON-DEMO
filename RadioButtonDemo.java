import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class RadioButtonDemo extends JFrame {
    private JRadioButton birdButton;
    private JRadioButton catButton;
    private JRadioButton dogButton;
    private JRadioButton rabbitButton;
    private JRadioButton pigButton;
    private JLabel petImageLabel;

    public RadioButtonDemo() {
        createView();

        setTitle("RadioButtonDemo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(true);
    }

    private void createView() {
    JPanel panel = new JPanel();
    getContentPane().add(panel);

    panel.setLayout(new GridLayout(2, 1));

    JPanel radioPanel = new JPanel();
    panel.add(radioPanel);

    // BoxLayout with vertical orientation 
    radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));

    birdButton = new JRadioButton("Bird");
    catButton = new JRadioButton("Cat");
    dogButton = new JRadioButton("Dog");
    rabbitButton = new JRadioButton("Rabbit");
    pigButton = new JRadioButton("Pig");

    ButtonGroup group = new ButtonGroup();
    group.add(birdButton);
    group.add(catButton);
    group.add(dogButton);
    group.add(rabbitButton);
    group.add(pigButton);

    radioPanel.add(birdButton);
    radioPanel.add(catButton);
    radioPanel.add(dogButton);
    radioPanel.add(rabbitButton);
    radioPanel.add(pigButton);

    radioPanel.add(Box.createVerticalGlue());

    birdButton.addActionListener(new PetButtonListener());
    catButton.addActionListener(new PetButtonListener());
    dogButton.addActionListener(new PetButtonListener());
    rabbitButton.addActionListener(new PetButtonListener());
    pigButton.addActionListener(new PetButtonListener());

    petImageLabel = new JLabel();
    panel.add(petImageLabel);

    //default selection
    pigButton.setSelected(true);
    displayImage("pig.img.jpeg"); // Default image
}

    private void displayImage(String imageName) {
        URL imgURL = getClass().getClassLoader().getResource("images/" + imageName);
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            petImageLabel.setIcon(icon);
        } else {
            System.err.println("Couldn't find file: " + imageName);
        }
    }

    private class PetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton source = (JRadioButton) e.getSource();
            String imageName = "images/";

            if (source == birdButton) {
                imageName = "bird.img.jpeg";
            } else if (source == catButton) {
                imageName = "cat.img.jpeg";
            } else if (source == dogButton) {
                imageName = "dog.img.jpeg";
            } else if (source == rabbitButton) {
                imageName = "rabbit.img.jpeg";
            } else if (source == pigButton) {
                imageName = "pig.img.jpeg";
            }

            displayImage(imageName);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }
}
