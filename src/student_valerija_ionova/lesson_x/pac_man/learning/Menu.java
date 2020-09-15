package student_valerija_ionova.lesson_x.pac_man.learning;

import student_dmitrijs_jasvins.lesson_9.day_2.task_12.B;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();

        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open", 'O'));
        file.add(new JMenuItem("Save"));
        file.addSeparator();
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));


        edit.add(new JMenuItem("Cut"));
        JMenuItem copy = edit.add(new JMenuItem("Copy"));
        copy.setEnabled(false); //Нельзя выбрать
        JMenu options = new JMenu("Options");
        edit.add(options);
        options.add("one");
        options.add("two");

        edit.add(new JCheckBoxMenuItem("checkBox"));
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1");
        JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio12");
        buttonGroup.add(radioButtonMenuItem1);
        buttonGroup.add(radioButtonMenuItem2);
        edit.add(radioButtonMenuItem1);
        edit.add(radioButtonMenuItem2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();
    }

}
