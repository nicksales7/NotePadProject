import javax.swing.*;
import java.awt.*;

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

        //Add the file menu
        menuBar.add(fileMenu);

        //Set up edit bar items
        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoItem = new JMenuItem("Undo");

        //Add edit bar items
        editMenu.add(undoItem);

        //Add the edit menu
        menuBar.add(editMenu);


        //Making the menu bar visible
        notepadWindow.setJMenuBar(menuBar);


        //Notepad area
        JTextArea notepad = new JTextArea("");
        notepad.setPreferredSize(new Dimension(1280, 720));
        notepadWindow.add(notepad);

        //Setting the notepadWindow visible
        notepadWindow.setVisible(true);
    }

    public static void Layout() {
    }

}