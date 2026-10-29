package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingQuiz extends JFrame {
    public static void main(String[] args) {
        SwingQuiz Sq = new SwingQuiz();
    }
    public SwingQuiz() {
        setTitle("SwingQuizApp");
        JButton m =  new JButton("Next");
        add(m);
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Question();
                dispose();
            }
        };
        m.addActionListener(a);
        setLayout(new FlowLayout());
        setSize(300,400);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}