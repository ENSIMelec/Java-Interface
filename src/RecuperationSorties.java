
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RecuperationSorties extends Thread {  

	/**  Le flux à rediriger  */
	private InputStream flux;

	/**
	 * <b>Constructeur de RecuperationSorties</b>
	 * @param flux
	 *  Le flux à rediriger
	 */
	public RecuperationSorties(InputStream flux){
		this.flux = flux;
	}
	
	@Override
	public void run(){
		try {    
			InputStreamReader reader = new InputStreamReader(flux);
			BufferedReader br = new BufferedReader(reader);
			String ligne=null;
			while ( (ligne = br.readLine()) != null){
				System.out.println(ligne);
			}
		}
		catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
} 