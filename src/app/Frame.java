package app;

import action.BottomActionPanel;
import action.CenterActionPanel;
import action.TopActionPanel;
import app.Main;
import boutonSelection.BottomShowPanel;
import boutonSelection.CenterShowPanel;
import boutonSelection.TopShowPanel;
import home.BottomHomePanel;
import home.CenterHomePanel;
import home.TopHomePanel;
import strat.BottomStratPanel;
import strat.CenterStratPanel;
import strat.TopStratPanel;
import temps_points.BottomRunPanel;
import temps_points.CenterRunPanel;
import temps_points.TopRunPanel;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{

    public Frame(){
        super("Interface");
        this.setSize(1024, 600);
        this.setBackground(Main.background_color);
        this.setForeground(Main.background_color);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //TODO sup commentaire

        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame();
        this.setVisible(true);
    }

    public void homeFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterHomePanel(), BorderLayout.CENTER);
        this.add(new TopHomePanel(), BorderLayout.NORTH);
        this.add(new BottomHomePanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

    public void stratFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterStratPanel(), BorderLayout.CENTER);
        this.add(new TopStratPanel(), BorderLayout.NORTH);
        this.add(new BottomStratPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

    public void selectionFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterStratPanel(), BorderLayout.CENTER);
        this.add(new TopStratPanel(), BorderLayout.NORTH);
        this.add(new BottomStratPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

    public void actionFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterActionPanel(), BorderLayout.CENTER);
        this.add(new TopActionPanel(), BorderLayout.NORTH);
        this.add(new BottomActionPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

   /* public void bobbyFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterBobbyPanel(), BorderLayout.CENTER);
        this.add(new TopBobbyPanel(), BorderLayout.NORTH);
        this.add(new BottomBobbyPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }*/

    public void showFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new CenterShowPanel(), BorderLayout.CENTER);
        this.add(new TopShowPanel(), BorderLayout.NORTH);
        this.add(new BottomShowPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

    public void runFrame() {
        this.getContentPane().removeAll();
        this.setLayout(new BorderLayout());
        this.add(new TopRunPanel(), BorderLayout.NORTH);
        this.add(new CenterRunPanel(), BorderLayout.CENTER);
        this.add(new BottomRunPanel(), BorderLayout.SOUTH);
        this.revalidate();
        this.repaint();
    }

}