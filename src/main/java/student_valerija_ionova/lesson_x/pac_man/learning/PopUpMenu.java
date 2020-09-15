package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;

class PopUpMenu {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();

        jFrame.add(jPanel);

        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(new JMenuItem("One"));
        jPopupMenu.add(new JMenuItem("Two"));
        jPopupMenu.add(new JMenuItem("Three"));
        jPanel.setComponentPopupMenu(jPopupMenu);


    }
}
