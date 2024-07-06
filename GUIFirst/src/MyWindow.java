import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Java");
        setSize(700, 700);
        setVisible(true);
        setResizable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke newStroke = new BasicStroke(3.0f);
        g2d.setStroke(newStroke);
//
//        drawRulers(g);
//
//        g.drawLine(0,350,700,350);
//        g.drawLine(350,0,350,700);
//        g.drawRect(70,50,80,40);
//        g.setColor(new Color(255, 99, 0));
//        g.fillOval(70,100,80,80);
//        g.drawOval(70,185,80,80);
//        g.fillOval(70,185,80,80);
//        g.setFont(new Font("Java", Font.BOLD, 18));
//        g.drawString("Java",88,75);
//
//        ex.1 -----------------------------------------------------------------------------------------------------------------------------
//
//        g.setColor(new Color(239, 71, 111));
//        g.drawRect(50, 50, 600, 600);
//
//        g.setColor(new Color(6, 214, 160));
//        g.drawOval(150, 150, 400, 400);
//
//        g.setColor(new Color(7, 59, 76));
//        g.drawRect(250, 250, 200, 200);
//
//        g.setColor(new Color(255, 209, 102));
//        g.drawLine(50, 50, 208, 208);
//        g.drawLine(650, 50, 491, 208);
//        g.drawLine(50, 650, 208, 491);
//        g.drawLine(650, 650, 491, 491);
//
//        g.setColor(new Color(17, 138, 178));
//        g.drawLine(250, 350, 150, 350);
//        g.drawLine(550, 350, 450, 350);
//        g.drawLine(350, 150, 350, 250);
//        g.drawLine(350, 550, 350, 450);
//
//
//        ex.2 -----------------------------------------------------------------------------------------------------------------------------
//
//        int y1 = 75;
//        int y2 = 75;
//        for (int i = 0; i < 5; i++) {
//            int x1 = (int) (75 + Math.random() * 575 + 1);
//            int x2 = (int) (75 + Math.random() * 575 + 1);
//            g.drawLine(x1, y1, x2, y2);
//            y1 += 30;
//            y2 += 30;
//        }
//
//        ex3. -----------------------------------------------------------------------------------------------------------------------------
//
//        int width = 134, height = 134;
//        for (int i = 0; i < 7; i++) {
//            int x = (int) (77 + Math.random() * 188);
//            int y = (int) (77 + Math.random() * 188);
//            g.drawOval(x,y,width,height);
//        }
//
//        -----------------------------------------------------------------------------------------------------------------------------

    }

    private void drawRulers(Graphics g) {
        // Draw horizontal ruler
        for (int i = 50; i <= 650; i += 25) {
            g.drawLine(i, 40, i, 50); // Draw ruler line
            g.drawString(String.valueOf(i), i - 10, 60); // Adjust vertical position for numbers
        }

        // Draw vertical ruler
        for (int i = 50; i <= 650; i += 25) {
            g.drawLine(40, i, 50, i); // Draw ruler line
            g.drawString(String.valueOf(i), 20, i + 5); // Draw numbers
        }
    }
}