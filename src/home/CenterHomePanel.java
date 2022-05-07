package home;

import app.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CenterHomePanel extends JPanel{

    JButton strat_btn;
    JButton action_btn;
    JButton kiroulpa_btn;


    public CenterHomePanel() {
        this.setBackground(Main.background_color);
        this.setForeground(Main.background_color);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));


        strat_btn = new JButton("Strategie");
        strat_btn.setForeground(new Color(45, 178, 255));
        strat_btn.setFont(new Font("Courier", Font.BOLD, Main.fontSize));
        strat_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        strat_btn.setMargin(new Insets(20, 10, 20, 10));

        action_btn = new JButton(" Action ");
        action_btn.setForeground(new Color(45, 178, 255));
        action_btn.setFont(new Font("Courier", Font.BOLD, Main.fontSize));
        action_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        action_btn.setMargin(new Insets(20, 20, 20, 20));

        kiroulpa_btn = new JButton("Kiroulpa");
        kiroulpa_btn.setForeground(new Color(45, 178, 255));
        kiroulpa_btn.setFont(new Font("Courier", Font.BOLD, Main.fontSize));
        kiroulpa_btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        kiroulpa_btn.setMargin(new Insets(20, 20, 20, 20));

        strat_btn.addActionListener(strat);
        action_btn.addActionListener(action);
        kiroulpa_btn.addActionListener(kiroulpa);

        this.add(Box.createRigidArea(new Dimension(0, 40)));
        this.add(strat_btn);
        this.add(Box.createRigidArea(new Dimension(0, 50)));
        this.add(action_btn);
        this.add(Box.createRigidArea(new Dimension(0, 50)));
        this.add(kiroulpa_btn);
    }


    ActionListener strat = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je rentre dans le fichier strat ! ");
            Main.frame.stratFrame();
        }
    };


    ActionListener action = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            System.out.println("Je rentre dans file action !");
            Main.frame.actionFrame();
        }
    };

    ActionListener kiroulpa = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            System.out.println("je rentre dans le dossier kiroulpa !");

        }
    };
}
