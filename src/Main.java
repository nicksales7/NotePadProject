import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Frame();
    }

    public static void Frame() {
        //Setting up the notepadWindow
        JFrame notepadWindow = new JFrame("Notepad");

        //Setting size and what happens when the program is closed
        notepadWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        notepadWindow.setSize(1280, 720);

        //Setting up the File bar
        JMenuBar menuBar = new JMenuBar();

        //Set up file bar items
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem newWindowItem = new JMenuItem("New Window");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem saveAsItem = new JMenuItem("Save As");
        JMenuItem pageSetupItem = new JMenuItem("Page Setup");
        JMenuItem printItem = new JMenuItem("Print");
        JMenuItem exitItem = new JMenuItem("Exit");

        //Add file bar items
        fileMenu.add(newItem);
        fileMenu.add(newWindowItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(pageSetupItem);
        fileMenu.add(printItem);
        fileMenu.add(exitItem);

        //Save item function
        saveItem.addActionListener(e -> {
            // Code to be executed when the "saveItem" is pressed
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(saveItem);
            if (result == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                try (FileWriter writer = new FileWriter(fileToSave)) {
                    writer.write("xd");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


        //Set up edit bar items
        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem redoItem = new JMenuItem("Redo");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        //Add edit bar items
        editMenu.add(undoItem);
        editMenu.add(redoItem);
        editMenu.addSeparator(); //Separation
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        //Making menu items visible
        menuBar.add(fileMenu);
        menuBar.add(editMenu);


        //Notepad area
        JTextArea notepad = new JTextArea("");
        notepad.setPreferredSize(new Dimension(1280, 720));
        notepadWindow.add(notepad);

        //Setting items as visible
        notepadWindow.setVisible(true); //Notepad
        notepadWindow.setJMenuBar(menuBar); //Menu Bar
    }

    public static void Layout() {
    }

}