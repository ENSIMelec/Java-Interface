package thread;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class ComClient extends Thread {
        private static int PORT = 4445;
        private Socket clientSocket;

        public BufferedReader in;
        public PrintWriter out;

        public InputStream is;
        public OutputStream os;

        public void run() {
            startConnection();

            // Gestion des commandes
            System.out.println("Waiting for the server");
            out.flush();

            String cmd = "Salut";
            System.out.println(cmd);
            sendMessage(cmd);
            out.flush();
            try {
                System.out.println(readMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }

            stopConnection();
        }

        public void startConnection(){
            try{
                System.out.println("Starting the client.");
                clientSocket = new Socket("localhost", PORT);
                clientSocket.setSoTimeout(1000 * 10);

                is = clientSocket.getInputStream();
                os = clientSocket.getOutputStream();

                in = new BufferedReader(new InputStreamReader(is));
                out = new PrintWriter(os, true);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void stopConnection() {
            System.out.println("Stopping the server and all communication.");

            try {
                is.close();
                os.close();

                in.close();
                out.close();

                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void sendMessage(String message){
            out.println(message);
        }

        public String readMessage() throws IOException {
            int red = -1;
            byte[] buffer = new byte[1024];
            byte[] redData;
            StringBuilder clientData = new StringBuilder();
            String redDataText;
            while((red = is.read(buffer))> -1){
                redData = new byte[red];
                System.arraycopy(buffer, 0, redData, 0, red);
                redDataText = new String(redData, "UTF-8");
                //System.out.println(redDataText);
                clientData.append(redDataText);
            }
            return clientData.toString();
            //return is.readAllBytes().toString();
        }


}
