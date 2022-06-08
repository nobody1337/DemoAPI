package Demo.Funktionale_Interfaces_und_Lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LamdasVsVererbung {
    public static void main(String[] args) {



        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Action performed listener 1");
            }
        };

        ActionListener listener2 =
                evt -> System.out.println("Action performed listener 2");

        //Test-GUI mit einem Action Button
        JFrame frame = new JFrame();
        frame.setBounds(0,0,300,300);
        JPanel panel = new JPanel();
        JButton btn = new JButton("Action");
        btn.addActionListener(listener);
        btn.addActionListener(listener2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(btn);
        frame.setVisible(true);

    }

}
