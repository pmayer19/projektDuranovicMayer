import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        final int portNumber = 4711;
        final String hostName = "localhost";

        try (
                final Socket echoSocket = new Socket(hostName, portNumber);
                final PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                final BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
                final BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        )
        {
            while (true) {
                String serverInput = "";
                int countdown = 11;
                while (countdown != 1) {
                    serverInput = in.readLine();
                    System.out.println(serverInput);
                    countdown--;
                }
                //continueCounter = Integer.parseInt(in.readLine());
                System.out.println("Bitte geben sie den sourceX Wert ein");
                int sourceX = Integer.parseInt(stdIn.readLine());
                System.out.println("Bitte geben sie den sourceY Wert ein");
                int sourceY = Integer.parseInt(stdIn.readLine());
                System.out.println("Bitte geben sie den targetX Wert ein");
                int targetX = Integer.parseInt(stdIn.readLine());
                System.out.println("Bitte geben sie den targetY Wert ein");
                int targetY = Integer.parseInt(stdIn.readLine());
                out.println(sourceX);
                out.println(sourceY);
                out.println(targetX);
                out.println(targetY);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
