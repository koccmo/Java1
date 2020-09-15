package student_valerija_ionova.lesson_x.pac_man.learning.lpac_man_without_layout;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

class Figures extends JComponent {
    @ Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Point2D p1 = new Point2D.Double(400, 90);
        Point2D p2 = new Point2D.Double(120, 190);

        Ellipse2D pm = new Ellipse2D.Double(0, 0, 100, 100);
        g2.setPaint(Color.yellow);
        g2.draw(pm);
        g2.fill(pm);

        //Rectangle2D r = new Rectangle2D().Double(500, 200, 250);
    }
}
