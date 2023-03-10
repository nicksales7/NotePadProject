import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Frame {
    public static JFrame notepadWindow;

    public static void createFrame() {
        //Setting up the notepadWindow
        notepadWindow = new JFrame("Notepad");

        //Setting size and what happens when the program is closed
        notepadWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        notepadWindow.setSize(1280, 720);

        menuBar();


        //Notepad area
        JTextArea notepad = new JTextArea();
        notepadWindow.add(notepad);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(notepad);
        notepadWindow.add(scrollPane);


        //Setting items as visible
        notepadWindow.setVisible(true); //Notepad
    }

    public static void menuBar() {
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
            fileChooser.showSaveDialog(saveItem);
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

        notepadWindow.setJMenuBar(menuBar); //Menu Bar
    }

}
