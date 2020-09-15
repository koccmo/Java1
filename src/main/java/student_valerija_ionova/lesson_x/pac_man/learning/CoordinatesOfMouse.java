package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CoordinatesOfMouse {

    static Frame frame = new Frame();
    static JFrame jFrame = frame.getFrame();

    public static void main (String [] args) throws Exception{
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent {
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x: "+xCoord +
                    " y: "+yCoord, 50, 50);
        }
    }



}
