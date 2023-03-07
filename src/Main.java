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

        //Setting up the File fileMenu bar
        JMenuBar fileBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");


        //------>Start of fileMenu items for the file bar<------
        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);

        JMenuItem newWindowItem = new JMenuItem("New Window");
        fileMenu.add(newWindowItem);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);

        JMenuItem saveAsItem = new JMenuItem("Save As");
        fileMenu.add(saveAsItem);

        JMenuItem pageSetupItem = new JMenuItem("Page Setup");
        fileMenu.add(pageSetupItem);

        JMenuItem printItem = new JMenuItem("Print");
        fileMenu.add(printItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        //------>End of fileMenu items for the file bar<------


        //Making all the menu bars visible
        fileBar.add(fileMenu);
        notepadWindow.setJMenuBar(fileBar);


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