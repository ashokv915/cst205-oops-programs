//No need to declare packages
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator {
    JButton b00,b01,b02,b03,b04,b05,b06,b07,b08,b09,badd,bsub,bmul,bdiv,bequ,bclr;
    JTextField result;
    String s = "";
    String op = "";
    JLabel jlab;

    String txtString;
    String[] splitString;
    int num1,num2,r;

    SimpleCalculator()
    {
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b00 = new JButton("0");
        b00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"0";
                result.setText(replaceString);
            }
        });

        b01 = new JButton("1");
        b01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"1";
                result.setText(replaceString);
            }
        });

        b02 = new JButton("2");
        b02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"2";
                result.setText(replaceString);
            }
        });

        b03 = new JButton("3");
        b03.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"3";
                result.setText(replaceString);
            }
        });

        b04 = new JButton("4");
        b04.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"4";
                result.setText(replaceString);
            }
        });

        b05 = new JButton("5");
        b05.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"5";
                result.setText(replaceString);
            }
        });

        b06 = new JButton("6");
        b06.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"6";
                result.setText(replaceString);
            }
        });

        b07 = new JButton("7");
        b07.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"7";
                result.setText(replaceString);
            }
        });


        b08 = new JButton("8");
        b08.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"8";
                result.setText(replaceString);
            }
        });

        b09 = new JButton("9");
        b09.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String replaceString = result.getText()+"9";
                result.setText(replaceString);
            }
        });


        badd = new JButton("+");
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op = "+";
                String replaceString = result.getText()+"+";
                result.setText(replaceString);
            }
        });

        bsub = new JButton("-");
        bsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op = "-";
                String replaceString = result.getText()+"-";
                result.setText(replaceString);
            }
        });

        bmul = new JButton("X");
        bmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op = "*";
                String replaceString = result.getText()+"X";
                result.setText(replaceString);
            }
        });

        bdiv = new JButton("/");
        bdiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                op = "/";
                String replaceString = result.getText()+"/";
                result.setText(replaceString);
            }
        });

        bclr = new JButton("Clear");
        bclr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                result.setText("");
            }
        });


        bequ = new JButton("=");
        bequ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                switch (op) {
                    case "+":
                        txtString = result.getText();
                        String[] splitString = txtString.split("\\+");
                        int num1 = Integer.parseInt(splitString[0]);
                        int num2 = Integer.parseInt(splitString[1]);
                        int r = num1+num2;
                        jlab.setText(String.valueOf(r));
                        result.setText("");
                        break;
                    case "-":
                        txtString = result.getText();
                        splitString = txtString.split("\\-");
                        num1 = Integer.parseInt(splitString[0]);
                        num2 = Integer.parseInt(splitString[1]);
                        r = num1-num2;
                        jlab.setText(String.valueOf(r));
                        result.setText("");
                        break;
                    case "*":
                        txtString = result.getText();
                        splitString = txtString.split("X");
                        num1 = Integer.parseInt(splitString[0]);
                        num2 = Integer.parseInt(splitString[1]);
                        r = num1*num2;
                        jlab.setText(String.valueOf(r));
                        result.setText("");
                        break;
                    case "/":
                        txtString = result.getText();
                        splitString = txtString.split("\\/");
                        num1 = Integer.parseInt(splitString[0]);
                        num2 = Integer.parseInt(splitString[1]);
                        r = num1/num2;
                        jlab.setText(String.valueOf(r));
                        result.setText("");
                        break;
                    default:
                        break;
                }

            }
        });

        result = new JTextField(16);

        jfrm.add(result);
        jfrm.add(b00);
        jfrm.add(b01);
        jfrm.add(b02);
        jfrm.add(b03);
        jfrm.add(b04);
        jfrm.add(b05);
        jfrm.add(b06);
        jfrm.add(b07);
        jfrm.add(b08);
        jfrm.add(b09);
        jfrm.add(badd);
        jfrm.add(bsub);
        jfrm.add(bmul);
        jfrm.add(bdiv);
        jfrm.add(bclr);
        jfrm.add(bequ);

        jlab = new JLabel();
        jlab.setSize(100,100);
        jlab.setFont(new Font("Serif", Font.PLAIN, 54));
        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new SimpleCalculator();
            }
        });
    }
    

}
