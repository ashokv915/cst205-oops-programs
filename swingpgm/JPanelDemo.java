import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo {
    JPanelDemo()
    {
        JFrame jfrm = new JFrame("JPanel Demo");

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(500,500);

        jfrm.setLayout(new GridLayout(3,1));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();

        p4.setBackground(Color.PINK);
        p5.setBackground(Color.BLACK);
        p6.setBackground(Color.BLUE);

        p1.setLayout(new GridLayout(1,3));

        p1.setBackground(Color.RED);
        p2.setBackground(Color.YELLOW);
        p3.setBackground(Color.GREEN);

        p1.add(p4);
        p1.add(p5);
        p1.add(p6);

        jfrm.add(p1);


        jfrm.add(p2);
        jfrm.add(p3);



        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        new JPanelDemo();
      }
}
