package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;

class Slider {

    public static void main (String [] args){

        Frame frame = new Frame();
        JFrame jFrame = frame.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider);
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
        jSlider.setPaintTicks(true);
        jSlider.setSnapToTicks(true);
        jSlider.setPaintLabels(true);
    }

}
