package student_valerija_ionova.lesson_x.pac_man.learning.pac_man_game;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import java.awt.geom.Point2D;


class Figures extends JComponent {
    @ Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        Point2D p1 = new Point2D.Double(120, 120);
        Point2D p2 = new Point2D.Double(120, 190);

        /*Ellipse2D el = new Ellipse2D.Double(250, 120, 380, 150);
        g2.setPaint(Color.red);
        //g2.fill(el);
        g2.draw(el);*/

        Ellipse2D pm = new Ellipse2D.Double(700, 200, 100, 100);
        g2.setPaint(Color.yellow);
        //g2.fill(el);
        g2.draw(pm);
        g2.fill(pm);

        //Rectangle2D r = new Rectangle2D().Double(500, 200, 250);
    }
}
