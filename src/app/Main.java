package app;

import action.CenterActionPanel;
import temps_points.BottomRunPanel;
import temps_points.CenterRunPanel;
import temps_points.TopRunPanel;
import thread.ComClient;
import thread.ProgrammeThread;

import java.awt.*;
import java.io.IOException;

import javax.swing.JFrame;

public class Main {
    public static strat.CenterStratPanel csp;
    public static CenterActionPanel cap;
    //public static CenterBobbyPanel cbp;
    public static TopRunPanel trp;
    public static CenterRunPanel crp;
    public static BottomRunPanel brp;
    public static Frame frame;
    public static String strat = null;
    public static Color background_color = new Color(42, 42, 42);
    public static Color text_color = new Color(223, 223, 223);
    public static Color title_color = new Color(45, 178, 255);
    public static int fontSize = 45;

    public static void main(String[] args) throws IOException {
        try{
            System.out.println("Saluuuuuuuuuuuuuuuuuuuuuuuuuuuuuuut");
            frame = new Frame();
            System.out.println("bwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwa");
            frame.getContentPane().setBackground(background_color);
            GraphicsDevice d = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            d.setFullScreenWindow(frame);

            // Création du serveur FTP avec choix du port
            ComClient client = new ComClient();
            client.start();

            System.out.println("Holla");
        }catch(HeadlessException e){
            System.out.println(e.getMessage());
        }

    }
}
