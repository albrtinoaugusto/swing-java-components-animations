
package aam.start;

import aam.gui.Main;

/**
 *
 * @author Albertino Augusto */

public class Start {
    
    
    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            System.out.println("Error: " + ex);
        }
 

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }
}
