import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {

    JLabel jlab;

    EventDemo()
    {
        //Create a new JFrame container
        JFrame jfrm = new JFrame("An event Example");

        //Flowlayout
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220,90);

        //Terminate the program 
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

        JTextField jtf = new JTextField("enter", 7);
        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String txt = jtf.getText();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    
                    e1.printStackTrace();
                }
                jlab.setText(txt);
            }
        });


        //Add action to Alpha button
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                jlab.setText("Alpha was pressed");
            }
        });

        //Add action to Beta button
        jbtnBeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                jlab.setText("Beta was pressed");
            }
        });


        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        jfrm.add(jtf);

        jlab = new JLabel("Press a button");

        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new EventDemo();
            }
        });
    }
    
}
