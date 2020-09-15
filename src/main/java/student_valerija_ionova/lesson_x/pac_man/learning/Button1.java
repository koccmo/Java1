package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Button1 {

    JButton addButton (){
        JPanel jPanel = new JPanel();
        //jFrame.add(jPanel);
        JButton jButton = new JButton("Start");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener(){ //Что происходит при нажатии
            @Override
            public void actionPerformed(ActionEvent e){
                jPanel.setBackground(Color.green);
            }
        });
        return jButton;
    }

}
