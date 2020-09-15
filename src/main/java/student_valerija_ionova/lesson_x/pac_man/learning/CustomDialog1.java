package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomDialog1 {

    static Frame frame = new Frame();
    static JFrame jFrame = frame.getFrame();
    static JPanel jPanel = new JPanel();


    public static void main (String [] args){
        jFrame.add(jPanel);
        JButton jButton = new JButton("new dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });



    }

    static class MyDialog extends  JDialog{
        public MyDialog(){
            super (jFrame, "title", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("button"), BorderLayout.SOUTH);
            setBounds(500, 500, 250, 150);


        }
    }
}
