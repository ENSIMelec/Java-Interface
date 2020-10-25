import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgrammeThread extends Thread{

	Process prog;
	String cmd;
	long pid;
	public ProgrammeThread(String str) {
		cmd = str;
	}
	
	public void run() {
		//String command = "/bin/bash -c 'sudo /home/pi/RobotPrincipal2018/main "+Main.strat+"'";
		
			System.out.println("Interface : " + cmd);
			/*try {
				prog = Runtime.getRuntime().exec(cmd);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			/*int exitValue;
			try {
				/* Création et lancement de processus qui fait le ping */
				//prog = Runtime.getRuntime().exec(cmd);
				
				/* Lancement du thread de récupération de la sortie standard */
				//new RecuperationSorties(prog.getInputStream()).start();
				
				/* Lancement du thread de récupération de la sortie en erreur */
				//new RecuperationSorties(prog.getErrorStream()).start();
				
				/* On enregistre le code retour */
			/*	exitValue=prog.waitFor();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			
			//pid = prog.
			//prog = new ProcessBuilder(new String[]{"sudo", cmd}).start();
			
		   /* BufferedReader reader = new BufferedReader(new InputStreamReader(prog.getInputStream()));
		    String line = "";
		    try {
				while((line = reader.readLine()) != null) {
				       System.out.print(line + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    try {
				prog.waitFor();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			String[] cmdTab = cmd.split(" ");
			
			ProcessBuilder pb = new ProcessBuilder(cmdTab); 
			pb.directory(new File("/home/pi/robot_asserv_lidar")); 
			
			try {
				prog = pb.start();
				
				BufferedReader reader =
	                    new BufferedReader(new InputStreamReader(prog.getInputStream()));

	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
				
				prog.waitFor();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		    //System.out.println("Interface :  etat waitFor : " + prog.waitFor());
		
	}
	
	public void stopProg() {
		if(prog != null) {
			System.out.println("Interface : Arret du programme");
			prog.destroy();
			if (prog.isAlive()) {
			    prog.destroyForcibly();
			}
		}else {
			System.out.println("Interface : Programme pas lancé");
		}
	}
}
