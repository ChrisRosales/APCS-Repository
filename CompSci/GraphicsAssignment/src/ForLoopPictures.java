
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ForLoopPictures extends JPanel implements ActionListener {

    private int counter;
    private int pixNum;

    public ForLoopPictures(JButton button) {
        counter = 1;
        pixNum = 1;
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        counter++;
        pixNum = counter % 12;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (pixNum) {
            case 1:
                redPyramid(g);
                break;
            case 2:
                gradientLines(g);
                break;
            case 3:
                lineArt(g);
                break;
            case 4:
                circles(g);
                break;
            case 5:
                diagonal(g);
                break;
            case 6:
                Sinusoidal(g);
                break;
            case 7:
                Clock(g);
                break;
            case 8:
                CircleArt(g);
                break;
        }
    }

    public void redPyramid(Graphics g) {
        int x = 0, y = 0, wid = 500, hei = 500;
        int red = 0;
        int i = 0;
        while (i < 10) {
            Color c = new Color(red, 0, 0);
            g.setColor(c);
            g.fillRect(x, y, wid, hei);
            x += 25;
            y += 25;
            wid -= 50;
            hei -= 50;
            red += 25;
            i++;
        }
    }

    public void gradientLines(Graphics g) {
        int x1 = 0, y1 = 0, x2 = 500, y2 = 500;
        int blue = 0;
        int i = 0;
        while (i < 250) {
            Color c = new Color(0, 0, blue);
            g.setColor(c);
            g.drawLine(x1, y1, x2, y2);
            x1++;
            x2--;
            blue++;
            i++;
        }
        while (i <= 500) {
            Color c = new Color(0, 0, blue);
            g.setColor(c);
            g.drawLine(x1, y1, x2, y2);
            x1++;
            x2--;
            blue--;
            i++;
        }
    }

    public void lineArt(Graphics g) {
        Color c = new Color(0, 0, 0);
        g.setColor(c);
        g.fillRect(0, 0, 500, 500);

        //section 1
        c = new Color(255, 255, 0);
        g.setColor(c);
        int x1 = 0, y1 = 250, x2 = 250, y2 = 0;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            x2 += 25;
            y1 -= 25;
            y2 += 25;
        }
        //section 2
        x1 = 0;
        y1 = 250;
        x2 = 250;
        y2 = 500;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 += 25;
            x2 += 25;
            y2 -= 25;
        }
        //section 3
        c = new Color(255, 0, 255);
        g.setColor(c);
        x1 = 0;
        y1 = 0;
        x2 = 250;
        y2 = 250;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 25;
            y1 += 25;
            x2 -= 25;
            y2 += 25;
        }
        //section 4
        x1 = 500;
        y1 = 0;
        x2 = 250;
        y2 = 250;
        for (int i = 0; i < 11; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 25;
            y1 += 25;
            x2 += 25;
            y2 += 25;
        }
    }

    public void circles(Graphics g) {
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Color c = new Color(255, 0, 0);//red
                g.setColor(c);
            } else {
                Color c = new Color(0, 0, 255);//blue
                g.setColor(c);
            }
            g.fillOval(x, y, 100, 100);
            x += 44;
            y += 44;
        }
    }

    public void diagonal(Graphics g) {
        Color c = new Color(255, 255, 0);
        g.setColor(c);
        g.fillRect(50, 50, 400, 400);
        int x1 = 50, y1 = 100, x2 = 100, y2 = 50;
        c = new Color(255, 0, 0);
        g.setColor(c);
        for (int i = 0; i < 8; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 50;
            x2 += 50;

        }
        x1 = 100;
        y1 = 450;
        x2 = 450;
        y2 = 100;
        for (int i = 0; i < 7; i++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 50;
            y2 += 50;
        }
    }

    public void Sinusoidal(Graphics g) {
        Color c = new Color(0, 0, 0);
        g.setColor(c);
        for (int i = 0; i < 50; i++) {
            int x = 10 * i;
            int y = (int) (250 - (250 / pi()) * (Math.sin(pi() * 2 * i / 25)));
            g.fillOval(x, y, 5, 5);
        }
    }
    public void Clock(Graphics g) {
        int time = 3;
        int i = 0;
        while (i < 360){
            int degrees = i;
            int x = 250 + (int)(125 * Math.cos(toRadians(degrees)));
            int y = 250 + (int)(125 * Math.sin(toRadians(degrees)));
            if (i % 5 == 0) {
                g.drawString(String.valueOf(time), x - 2, y + 5);
                time++;
                if(time == 13)
                    time = 1;
            } else {
                g.fillOval(x,y, 5, 5);
            }
            i +=6;
        }
    }
    
    public void CircleArt(Graphics g) {
        int n = 0;
        int radOuterCircles = 50;
        int radFromCenter = 150;
        int xCenter = 250;
        int yCenter = 250;
        while (n < 36) {
            double i = toRadians(10 * n);
            int x = (int) ((xCenter) + (radFromCenter) * Math.cos(i) - (radOuterCircles));
            int y = (int) ((yCenter) - (radFromCenter) * Math.sin(i) - (radOuterCircles));
            g.drawOval(x, y, 2 * radOuterCircles, 2 * radOuterCircles);
            n++;
        }
    }

    public double pi() {
        return 3.1415926535897932384626433;
    }

    public double toRadians(int degrees) {
       return (double) (degrees/180.0 * pi());
    }
    public int toDegrees(double radians) {
        return (int) (radians * pi() / 180.0);
    }
}
