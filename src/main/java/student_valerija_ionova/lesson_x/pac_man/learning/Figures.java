package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

class Figures extends JComponent {
        @ Override
        protected void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            Font font = new Font("Arial", Font.BOLD, 20);
            g2.setFont(font);
            g2.drawString("Find Pac-Man!", 20, 20);

            Point2D p1 = new Point2D.Double(120, 120);
            Point2D p2 = new Point2D.Double(120, 190);
            Line2D l1 = new Line2D.Double(p1, p2);
            g2.draw(l1);

            Line2D l2 = new Line2D.Double(200, 70, 250,90);
            g2.draw(l2);

            Ellipse2D el = new Ellipse2D.Double(250, 120, 380, 150);
            g2.setPaint(Color.red);
            //g2.fill(el);
            g2.draw(el);

            Ellipse2D pm = new Ellipse2D.Double(120, 220, 100, 100);
            g2.setPaint(Color.yellow);
            //g2.fill(el);
            g2.draw(pm);
            g2.fill(pm);
        }
    }


