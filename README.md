Class RadioButtonDemo:
Extends JFrame: Represents the main window of the application.
Components:
JRadioButton: Allows selection of different animals (birdButton, catButton, dogButton, rabbitButton, pigButton).
JLabel (petImageLabel): Displays the selected animal's image.
Methods:
createView(): Sets up the GUI components.
displayImage(String imageName): Loads and displays an image based on the selected animal.
PetButtonListener: Implements ActionListener to handle radio button clicks and update the displayed image accordingly.
Main Method (main):
Initializes the RadioButtonDemo class and makes the GUI visible.
createView() Method:
Panel Setup:

Creates a JPanel (panel) to hold all components.
Sets a GridLayout to organize components vertically.
Radio Panel Setup (radioPanel):

Creates a JPanel (radioPanel) within panel.
Uses BoxLayout with Y_AXIS orientation to arrange radio buttons vertically.
Radio Buttons Setup:

Creates JRadioButton instances for animals (birdButton, catButton, etc.).
Groups them using ButtonGroup (group) to ensure mutual exclusivity.
Action Listeners:

Associates each radio button with PetButtonListener to respond to selection changes.
Updates the displayed image (petImageLabel) based on the selected animal.
Default Selection:

Sets pigButton as the default selection.
Displays the corresponding default image (pig.img.jpeg).
displayImage(String imageName) Method:
Image Loading:
Constructs a URL path for the image using getClass().getClassLoader().getResource().
Checks if the image exists (imgURL != null).
Loads and sets the image as an ImageIcon for petImageLabel.
Prints an error message if the image file is not found.
PetButtonListener Class:
Action Handling:
Implements ActionListener to respond to radio button clicks (actionPerformed method).
Determines which radio button triggered the action (source).
Updates imageName based on the selected animal.
Calls displayImage(imageName) to update the displayed image.
Note:
Adjustments such as layout changes (GridLayout, BoxLayout), default selections, and error handling (System.err.println) enhance usability and reliability.
