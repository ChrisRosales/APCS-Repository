import java.awt.*;
import javax.swing.*;

public class ForLoopsRunner
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("For Loop Graphics");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        
        
        
        Container c = jf.getContentPane();
        JButton nextPix = new JButton("New Picture");
        ForLoopPictures flp = new ForLoopPictures(nextPix);
        jf.add(flp);
        jf.add(nextPix, BorderLayout.SOUTH);
        jf.setVisible(true);
        
        
    }
}