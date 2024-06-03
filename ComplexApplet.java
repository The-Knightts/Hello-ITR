import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ComplexApplet extends Applet implements ActionListener {
    private TextField inputField;
    private TextArea outputArea;
    private Button processButton;
    private CheckboxGroup optionsGroup;
    private Checkbox option1, option2, option3;

    public void init() {
        setLayout(new BorderLayout());

        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());

        Label inputLabel = new Label("Input:");
        inputField = new TextField(20);
        topPanel.add(inputLabel);
        topPanel.add(inputField);

        processButton = new Button("Process");
        processButton.addActionListener(this);
        topPanel.add(processButton);

        add(topPanel, BorderLayout.NORTH);

        outputArea = new TextArea(10, 40);
        outputArea.setEditable(false);
        add(outputArea, BorderLayout.CENTER);

        Panel optionsPanel = new Panel();
        optionsPanel.setLayout(new GridLayout(3, 1));
        optionsPanel.add(new Label("Options:"));

        optionsGroup = new CheckboxGroup();
        option1 = new Checkbox("Option 1", optionsGroup, false);
        option2 = new Checkbox("Option 2", optionsGroup, false);
        option3 = new Checkbox("Option 3", optionsGroup, false);

        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);

        add(optionsPanel, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == processButton) {
            String input = inputField.getText();
            String result = processInput(input);
            outputArea.append("Processed: " + result + "\n");
        }
    }

    private String processInput(String input) {
        // Complex processing logic goes here
        // This is just a placeholder
        return "Processed: " + input;
    }
}
