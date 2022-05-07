package strat;

import app.Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class CenterStratPanel extends JPanel{
    JList<String> stratList;
    DefaultListModel<String> stratModel;
    JScrollPane listScrollPane;
    JScrollBar bar;

    public CenterStratPanel() {
        Main.csp = this;
        this.setBackground(Main.background_color);
        this.setForeground(Main.background_color);

        stratModel = new DefaultListModel<String>();
        stratList = new JList<String>(stratModel);
        stratList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        stratList.setBackground(new Color(60, 60, 60));
        stratList.setFont(new Font("Courier", Font.BOLD, 35));
        stratList.setForeground(Main.text_color);



        listScrollPane = new JScrollPane(stratList);
        listScrollPane.setPreferredSize(new Dimension(800, 450));
        bar = listScrollPane.getVerticalScrollBar();
        bar.setPreferredSize(new Dimension(60, 0));

        File folder = new File("C:\\Users\\cleme\\OneDrive\\Documents\\GitHub\\Interface_JAVA\\stratFile");
        //TODO Changer le repertoire
        File[] listFile = folder.listFiles();
        Arrays.sort(listFile);
        for(File file : listFile) {
            stratModel.addElement(file.getName());
        }
        this.add(listScrollPane);


        if(Main.strat != null)
            for(int index=0;index<stratList.getModel().getSize();index++)
                if(stratList.getModel().getElementAt(index).equals(Main.strat)){
                    stratList.setSelectedIndex(index);
                    break;
                }


    }


    public String getStrat() {
        return stratList.getSelectedValue();
    }


}