package latModul5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileCopyWithReplaceGUI extends JFrame {
    private JButton copyButton, saveButton;
    private JFileChooser fileChooser;
    private JTextArea sourceTextArea, destinationTextArea;

    public FileCopyWithReplaceGUI() {
        setTitle("File Copy with Space Replace");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        sourceTextArea = new JTextArea(10, 40);
        destinationTextArea = new JTextArea(10, 40);
        copyButton = new JButton("Copy");
        saveButton = new JButton("Save As");

        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);

        copyButton.addActionListener(e -> {
            int returnVal = fileChooser.showOpenDialog(FileCopyWithReplaceGUI.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    String originalContent = content.toString();
                    sourceTextArea.setText(originalContent);
                    // Replace spaces with underscores and set the result to the destination text area
                    String modifiedContent = originalContent.replace(' ', '_');
                    destinationTextArea.setText(modifiedContent);
                    JOptionPane.showMessageDialog(FileCopyWithReplaceGUI.this, "File loaded and modified successfully.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(FileCopyWithReplaceGUI.this, "Error reading file: " + ex.getMessage());
                }
            }
        });

        saveButton.addActionListener(e -> {
            int returnVal = fileChooser.showSaveDialog(FileCopyWithReplaceGUI.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    String content = destinationTextArea.getText();
                    writer.write(content);
                    JOptionPane.showMessageDialog(FileCopyWithReplaceGUI.this, "File saved successfully.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(FileCopyWithReplaceGUI.this, "Error writing file: " + ex.getMessage());
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(new JScrollPane(sourceTextArea));
        panel.add(new JScrollPane(destinationTextArea));
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(copyButton);
        buttonPanel.add(saveButton);
        
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileCopyWithReplaceGUI().setVisible(true);
        });
    }
}
