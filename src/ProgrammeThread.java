import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
			String[] cmdTab = cmd.split(" ");
			
			ProcessBuilder pb = new ProcessBuilder(cmdTab).inheritIO(); 
			pb.directory(new File("/home/pi/robot_asserv_lidar")); 
			
			
			try {
				prog = pb.start();
				
				
				BufferedReader reader =
	                    new BufferedReader(new InputStreamReader(prog.getInputStream()));

	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            
	            //prog.destroyForcibly();
			
			} catch (IOException e) {
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


