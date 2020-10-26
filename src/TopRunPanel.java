import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TopRunPanel extends JPanel{
	
	JLabel temps_lbl;
	//JButton stop_btn;
	JButton retour_btn;
	public TopRunPanel() {
		Main.trp = this;
		this.setBackground(Main.background_color);
		this.setForeground(Main.background_color);
		this.setLayout(new BorderLayout());
		
		temps_lbl = new JLabel("100 seconds");
		temps_lbl.setForeground(new Color(45, 178, 255));
		temps_lbl.setFont(new Font("Courier", Font.BOLD,45));
		temps_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*stop_btn = new JButton("STOP");
		stop_btn.setForeground(new Color(45, 178, 255));
		stop_btn.setFont(new Font("Courier", Font.BOLD,Main.fontSize));
		stop_btn.setHorizontalAlignment(SwingConstants.RIGHT);
		stop_btn.setMargin(new Insets(10, 10, 10, 10));
		
		stop_btn.addActionListener(stop);*/
		
		this.add(Box.createRigidArea(new Dimension(175, 0)), BorderLayout.WEST);
		//this.add(stop_btn, BorderLayout.EAST);
		this.add(temps_lbl, BorderLayout.CENTER);
		
		
		retour_btn = new JButton("Retour");
		retour_btn.setForeground(new Color(45, 178, 255));
		retour_btn.setFont(new Font("Courier", Font.BOLD, Main.fontSize));
		retour_btn.setMargin(new Insets(10, 10, 10, 10));
		
		
		retour_btn.addActionListener(retour);
		
		this.add(retour_btn, BorderLayout.WEST);
		
		this.add(Box.createRigidArea(new Dimension(250, 0)), BorderLayout.EAST);
	}
	
	public void setTemps(int tps) {
		//System.out.println("Interface trp : " + tps + " seconds !!!!");
		tps = 100 - tps;
		if(tps>0) {
			temps_lbl.setText("" + tps + " seconds");
		}else {
			temps_lbl.setText("0 seconds");
		}
	}
	
	/*ActionListener stop = new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
			   Main.crp.stopProg();
			   Main.frame.showFrame();
		   }
	};*/
	
	ActionListener retour = new ActionListener(){
		   public void actionPerformed(ActionEvent e) {
			   Main.frame.showFrame();
		   }
	};
}
