import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo
{
    SwingDemo()
    {
        //Jframe container
        JFrame jfrm = new JFrame("Simple Swing Application");

        //set size of the frame
        jfrm.setSize(275,100);

        //Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a text based label
        JLabel jlab = new JLabel("Swing means powerful UI");


        JButton jbtnAlpha = new JButton("Alpha");
        jbtnAlpha.setSize(100,50);
        jbtnAlpha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha pressed");
            }
        });

        //Add the lable to the content pane
        jfrm.add(jlab);

        jfrm.add(jbtnAlpha);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new SwingDemo();
            }
        });
    }
}