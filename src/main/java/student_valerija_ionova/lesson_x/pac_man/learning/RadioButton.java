package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import javax.swing.border.Border;

class RadioButton {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.add(new JCheckBox("check box label"));
        JRadioButton jRadioButton1 = new JRadioButton("one");
        JRadioButton jRadioButton2 = new JRadioButton("two");
        jRadioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        Border border = BorderFactory.createEtchedBorder();
        
        JComboBox<String> comboBox = new JComboBox();
        comboBox.addItem("one");
        comboBox.addItem("two");
        comboBox.addItem("three");
        jPanel.add(comboBox);

        Border border1 = BorderFactory.createTitledBorder(border, "title");
        jPanel.setBorder(border1);
        jPanel.setBorder(border1);
    }

}
