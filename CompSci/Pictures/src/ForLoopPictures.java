
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
        pixNum = counter % 3;
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

    }

}