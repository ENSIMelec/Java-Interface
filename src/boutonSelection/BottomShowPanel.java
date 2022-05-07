package boutonSelection;

import app.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomShowPanel extends JPanel{

    JButton init_btn;
    JButton vider_btn;
    JButton run_btn;
    public BottomShowPanel() {
        this.setBackground(Main.background_color);
        this.setForeground(Main.background_color);

        vider_btn = new JButton("Ouvrir pinces");
        vider_btn.setForeground(new Color(45, 178, 255));
        vider_btn.setFont(new Font("Courier", Font.BOLD,Main.fontSize));

        init_btn = new JButton("Init nema");
        init_btn.setForeground(new Color(45, 178, 255));
        init_btn.setFont(new Font("Courier", Font.BOLD,Main.fontSize));

        run_btn = new JButton("  Lancer  ");
        run_btn.setForeground(new Color(45, 178, 255));
        run_btn.setFont(new Font("Courier", Font.BOLD, Main.fontSize));

        this.add(init_btn);
        this.add(vider_btn);
        this.add(run_btn);

        run_btn.addActionListener(run);
    }

    ActionListener run = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            System.out.println("je lance le temps + score");
            Main.strat = Main.csp.getStrat();
            Main.frame.runFrame();
        }
    };

}
