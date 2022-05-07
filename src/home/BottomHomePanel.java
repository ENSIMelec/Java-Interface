package home;

import app.Main;
import strat.CenterStratPanel;

import javax.swing.*;

public class BottomHomePanel extends JPanel {

    public BottomHomePanel(){

        JLabel stratLabel = new JLabel(Main.strat);
        this.add(stratLabel);

    }


}
