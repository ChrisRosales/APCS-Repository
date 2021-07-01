
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author silen
 */
public class MatchingFrame extends javax.swing.JFrame implements ActionListener {

    JButton[][] butArray = new JButton[40][40];
    int size = 4;

    public MatchingFrame() {
        initComponents();
        initialize();

    }

    private void initialize() {
//        gamePanel = new JPanel();
//        gamePanel.setBounds(50, 70, 670, 530);
//        gamePanel.setLayout(new GridLayout(size, size));
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                //create a new JButton
                butArray[r][c] = new JButton();
                butArray[r][c].setBackground(new Color(20 + r * 2, 2 * 40 + c, 255 - r * 10));
                butArray[r][c].addActionListener(this);//this mean this frame will now respond to any events that are created when someone clicks the button
                butArray[r][c].setSize(50, 50); //set the size of this to anything
                gamePanel.add(butArray[r][c]);
            }
        }

        validate();//makes everything show up lol
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                for (int r = 0; r < size; r++) 
            for (int c = 0; c < size; c++) {
                if(e.getSource() ==butArray[r][c]) {
                    butArray[r][c].setBackground(Color.red);
                    
                }
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        gamePanel.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        jPanel2.setLayout(new java.awt.GridLayout());

        jPanel3.setLayout(new java.awt.GridLayout());

        jPanel4.setLayout(new java.awt.GridLayout());
        jPanel3.add(jPanel4);

        jPanel2.add(jPanel3);

        jPanel1.add(jPanel2);

        gamePanel.add(jPanel1);

        getContentPane().add(gamePanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatchingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
