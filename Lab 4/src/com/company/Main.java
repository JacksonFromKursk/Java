// Main.java

package com.company;

import java.awt.*;
import javax.swing.*;


class Main extends JFrame {
    int CSKAScore  = 0;
    int SpaScore = 0;

    JButton btn1 = new JButton("CSKA Moscow");
    JButton btn2 = new JButton("Spartak Moskow");

    JLabel text1 = new JLabel("Result: 0 X 0");
    JLabel text2 = new JLabel("Last Scorer: N/A");
    Label  text3 = new Label("Winner: N/A");

    void printResults()
    {
        text1.setText(String.format("Result: %d X %d", CSKAScore, SpaScore));

        if (CSKAScore > SpaScore) text3.setText("Winner: CSKA Moskow");
        else {
            if (CSKAScore == SpaScore) text3.setText("Winner: DRAW");
            else text3.setText("Winner: Spartak Moscow");}
    }

    public Main() {
        super("prc 4");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(300, 300);
        setLayout(new FlowLayout());

        add(btn1);
        add(btn2);

        add(text1);
        add(text2);
        add(text3);

        btn1.addActionListener(ae -> {
            CSKAScore++;
            text2.setText("Last Scorer: CSKA Moskow");

            printResults();
        });

        btn2.addActionListener(ae-> {
            SpaScore++;
            text2.setText("Last Scorer: Spartak Moskow");

            printResults();
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
