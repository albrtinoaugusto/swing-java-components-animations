package aam.apis;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Albertino Augusto
 */
public class Animation {

    // Animar JLabel
    public void animateJlabelToUp(final int start, final int stop, final int delay, final int increment, final JLabel jLabel)
    {
        if (jLabel.getY() == start)
        {
            (new Thread() {
                @Override
                public void run()
                {
                    while (jLabel.getY() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jLabel.setLocation(jLabel.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jLabel.setLocation(jLabel.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJlabelToDown(final int start, final int stop, final int delay, final int increment, final JLabel jLabel)
    {
        if (jLabel.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jLabel.getY() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jLabel.setLocation(jLabel.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jLabel.setLocation(jLabel.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJlabelToLeft(final int start, final int stop, final int delay, final int increment, final JLabel jLabel)
    {
        if (jLabel.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jLabel.getX() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jLabel.setLocation(i, jLabel.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jLabel.setLocation(stop, jLabel.getY());
                }
            }).start();
        }
    }

    public void animateJlabelToRight(final int start, final int stop, final int delay, final int increment, final JLabel jLabel)
    {
        if (jLabel.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jLabel.getX() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jLabel.setLocation(i, jLabel.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jLabel.setLocation(stop, jLabel.getY());
                }
            }).start();
        }
    }

    // Animar JTextField
    public void animateJTextFieldToUp(final int start, final int stop, final int delay, final int increment, final JTextField jTextField)
    {
        if (jTextField.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jTextField.getY() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jTextField.setLocation(jTextField.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jTextField.setLocation(jTextField.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJTextFieldToDown(final int start, final int stop, final int delay, final int increment, final JTextField jTextField)
    {
        if (jTextField.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jTextField.getY() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jTextField.setLocation(jTextField.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jTextField.setLocation(jTextField.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJTextFieldToLeft(final int start, final int stop, final int delay, final int increment, final JTextField jTextField)
    {
        if (jTextField.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jTextField.getX() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jTextField.setLocation(i, jTextField.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jTextField.setLocation(stop, jTextField.getY());
                }
            }).start();
        }
    }

    public void animateJTextFieldToRight(final int start, final int stop, final int delay, final int increment, final JTextField jTextField)
    {
        if (jTextField.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jTextField.getX() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jTextField.setLocation(i, jTextField.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jTextField.setLocation(stop, jTextField.getY());
                }
            }).start();
        }
    }

    // Animar JButton
    public void animateJButtonToUp(final int start, final int stop, final int delay, final int increment, final JButton jButton)
    {
        if (jButton.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jButton.getY() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jButton.setLocation(jButton.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jButton.setLocation(jButton.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJButtonToDown(final int start, final int stop, final int delay, final int increment, final JButton jButton)
    {
        if (jButton.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jButton.getY() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jButton.setLocation(jButton.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jButton.setLocation(jButton.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJButtonToLeft(final int start, final int stop, final int delay, final int increment, final JButton jButton)
    {
        if (jButton.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jButton.getX() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jButton.setLocation(i, jButton.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jButton.setLocation(stop, jButton.getY());
                }
            }).start();
        }
    }

    public void animateJButtonToRight(final int start, final int stop, final int delay, final int increment, final JButton jButton)
    {
        if (jButton.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jButton.getX() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jButton.setLocation(i, jButton.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jButton.setLocation(stop, jButton.getY());
                }
            }).start();
        }
    }

    //Animar JPasswordField
    public void animateJPasswordFieldToUp(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField)
    {
        if (jPasswordField.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jPasswordField.getY() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jPasswordField.setLocation(jPasswordField.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jPasswordField.setLocation(jPasswordField.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJPasswordFieldToDown(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField)
    {
        if (jPasswordField.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jPasswordField.getY() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jPasswordField.setLocation(jPasswordField.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jPasswordField.setLocation(jPasswordField.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJPasswordFieldToLeft(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField)
    {
        if (jPasswordField.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jPasswordField.getX() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jPasswordField.setLocation(i, jPasswordField.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jPasswordField.setLocation(stop, jPasswordField.getY());
                }
            }).start();
        }
    }

    public void animateJPasswordFieldToRight(final int start, final int stop, final int delay, final int increment, final JPasswordField jPasswordField)
    {
        if (jPasswordField.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jPasswordField.getX() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jPasswordField.setLocation(i, jPasswordField.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jPasswordField.setLocation(stop, jPasswordField.getY());
                }
            }).start();
        }
    }

    //Animar JTextArea
    public void animateJTextAreaToUp(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane)
    {
        if (jScrollPane.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jScrollPane.getY() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jScrollPane.setLocation(jScrollPane.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jScrollPane.setLocation(jScrollPane.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJTextAreaToDown(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane)
    {
        if (jScrollPane.getY() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jScrollPane.getY() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jScrollPane.setLocation(jScrollPane.getX(), i);
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jScrollPane.setLocation(jScrollPane.getX(), stop);
                }
            }).start();
        }
    }

    public void animateJTextAreaToLeft(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane)
    {
        if (jScrollPane.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jScrollPane.getX() > stop)
                    {
                        for (int i = start; i >= stop; i -= increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jScrollPane.setLocation(i, jScrollPane.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jScrollPane.setLocation(stop, jScrollPane.getY());
                }
            }).start();
        }
    }

    public void animateJTextAreaToRight(final int start, final int stop, final int delay, final int increment, final JScrollPane jScrollPane)
    {
        if (jScrollPane.getX() == start)
        {
            (new Thread() {
                public void run()
                {
                    while (jScrollPane.getX() <= start)
                    {
                        for (int i = start; i <= stop; i += increment)
                        {
                            try
                            {
                                Thread.sleep(delay);
                                jScrollPane.setLocation(i, jScrollPane.getY());
                            }
                            catch (InterruptedException e)
                            {
                                System.out.println("Error Thread Interrupted: " + e);
                            }
                        }
                    }
                    jScrollPane.setLocation(stop, jScrollPane.getY());
                }
            }).start();
        }
    }
}
