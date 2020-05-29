package aam.gui;

import aam.apis.Animation;
import javax.swing.JFrame;
import services.DateTime;

/**
 *
 * @author Albertino Augusto
 */
public class Main extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    public Main()
    {
        initComponents();
        new DateTime().setTimeToThis(timeLabel);
        animate();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        timeLabel = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        topBar = new javax.swing.JLabel();
        loveLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        bg3 = new javax.swing.JLabel();
        bg2 = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animation Example");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        timeLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("00:00:50");
        timeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(timeLabel);
        timeLabel.setBounds(20, 8, 150, 20);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                minimizeMouseReleased(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(941, 8, 20, 20);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                closeMouseReleased(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(970, 8, 20, 20);

        topBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aam/images/top.png"))); // NOI18N
        topBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                topBarMouseDragged(evt);
            }
        });
        topBar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                topBarMousePressed(evt);
            }
        });
        getContentPane().add(topBar);
        topBar.setBounds(2, 2, 996, 36);

        loveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aam/images/love.png"))); // NOI18N
        loveLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(loveLabel);
        loveLabel.setBounds(2, 434, 996, 80);

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 600);

        bg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aam/images/bg3.png"))); // NOI18N
        getContentPane().add(bg3);
        bg3.setBounds(0, 0, 1000, 600);

        bg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aam/images/bg2.png"))); // NOI18N
        getContentPane().add(bg2);
        bg2.setBounds(-1000, 0, 1000, 600);

        bg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aam/images/bg1.png"))); // NOI18N
        getContentPane().add(bg1);
        bg1.setBounds(-2000, 0, 1000, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_closeMouseReleased
    {//GEN-HEADEREND:event_closeMouseReleased
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseReleased

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_minimizeMouseReleased
    {//GEN-HEADEREND:event_minimizeMouseReleased
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void topBarMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_topBarMouseDragged
    {//GEN-HEADEREND:event_topBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_topBarMouseDragged

    private void topBarMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_topBarMousePressed
    {//GEN-HEADEREND:event_topBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topBarMousePressed

    private void animate()
    {
        new Thread() {
            @Override
            public void run()
            {
                int timeRun = 0;

                try
                {
                    Animation animation = new Animation();
                    int count = 0;
                    while (timeRun == 0)
                    {
                        
                        if (count == 0)
                        {
                            animation.animateJlabelToRight(0, 1000, 10, 8, bg3);
                            animation.animateJlabelToRight(-1000, 0, 10, 8, bg2);
                            animation.animateJlabelToRight(-2000, -1000, 10, 8, bg1);
                            count = 1;
                        }
                                
                        Thread.sleep(3000); 
                        if (count == 1)
                        {        
                            animation.animateJlabelToRight(1000, 2000, 10, 8, bg3);
                            animation.animateJlabelToRight(0, 1000, 10, 8, bg2);
                            animation.animateJlabelToRight(-1000, 0, 10, 8, bg1);
                            count = 2;
                        }
                        
                        Thread.sleep(3000);
                        if (count == 2)
                        { 
                            animation.animateJlabelToLeft(0, -1000, 10, 8, bg1);
                            animation.animateJlabelToLeft(1000, 0, 10, 8, bg2);
                            animation.animateJlabelToLeft(2000, 1000, 10, 8, bg3);
                            count = 3;
                        }
                        
                        
                        Thread.sleep(3000);
                        if (count == 3)
                        { 
                            animation.animateJlabelToLeft(-1000, -2000, 10, 8, bg1);
                            animation.animateJlabelToLeft(0, -1000, 10, 8, bg2);
                            animation.animateJlabelToLeft(1000, 0, 10, 8, bg3);
                            count = 0;
                        }
                    }
                }
                catch (InterruptedException e)
                {
                    System.out.println("Error: " + e);
                }
            }
        }.start();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg3;
    private javax.swing.JLabel close;
    private javax.swing.JLabel loveLabel;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel topBar;
    // End of variables declaration//GEN-END:variables
}
