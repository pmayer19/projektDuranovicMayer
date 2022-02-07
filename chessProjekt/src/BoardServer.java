import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BoardServer {
    public static Figure[][] board = new Figure[8][8];

    public void fillBoard()
    {
        //Black upperBoard:
        board[0][0] = new Rook(2,0,true);
        board[0][1] = new Knight(0,1,true);
        board[0][2] = new Bishop(0,2,true);
        board[0][3] = new Queen(0,3,true);
        board[0][4] = new King(0,4,true);
        board[0][5] = new Bishop(0,5,true);
        board[0][6] = new Knight(0,6,true);
        board[0][7] = new Rook(0,7,true);

        board[1][0] = new Pawn(1,0,true);
        board[1][1] = new Pawn(1,1,true);
        board[1][2] = new Pawn(1,2,true);
        board[1][3] = new Pawn(1,3,true);
        board[1][4] = new Pawn(1,4,true);
        board[1][5] = new Pawn(1,5,true);
        board[1][6] = new Pawn(1,6,true);
        board[1][7] = new Pawn(1,7,true);

        //White downBoard:
        board[6][0] = new Pawn(6,0,false);
        board[6][1] = new Pawn(6,1,false);
        board[6][2] = new Pawn(6,2,false);
        board[6][3] = new Pawn(6,3,false);
        board[6][4] = new Pawn(6,4,false);
        board[6][5] = new Pawn(6,5,false);
        board[6][6] = new Pawn(6,6,false);
        board[6][7] = new Pawn(6,7,false);

        board[7][0] = new Rook(7,0,false);
        board[7][1] = new Knight(7,1,false);
        board[7][2] = new Bishop(7,2,false);
        board[7][3] = new Queen(7,3,false);
        board[7][4] = new King(7,4,false);
        board[7][5] = new Bishop(7,5,false);
        board[7][6] = new Knight(7,6,false);
        board[7][7] = new Rook(7,7,false);
    }

    public void printBoard() {

        int countdown = 8;
        for (int i = 0; i < board.length; i++) {
            System.out.println("");
            System.out.print(countdown--);
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == null) {
                    System.out.print("  \u2009-  \u2009|");
                }
                else
                {
                    System.out.print("  " + board[i][j] + "  |");
                }

            }
        }
        System.out.println("");
        System.out.println("   a      b      c     d      e     f      g      h");
    }

    public static void main(String[] args) throws IOException {
        BoardServer boardServer = new BoardServer();
        boardServer.fillBoard();
        Scanner sc = new Scanner(System.in);
        final int portNumber = 4711;

        try (
                final ServerSocket serverSocket = new ServerSocket(portNumber);
                final Socket clientSocket = serverSocket.accept(); // blocks until client has connected
                final PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // println, auto-flush
                final BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        )
        {
            int eing = 0;
            do {

                boardServer.printBoard();
                System.out.println("Bitte geben sie den sourceX Wert ein");
                int sourceX = Integer.parseInt(sc.nextLine());
                System.out.println("Bitte geben sie den sourceY Wert ein");
                int sourceY = Integer.parseInt(sc.nextLine());
                System.out.println("Bitte geben sie den targetX Wert ein");
                int targetX = Integer.parseInt(sc.nextLine());
                System.out.println("Bitte geben sie den targetY Wert ein");
                int targetY = Integer.parseInt(sc.nextLine());


                int countdown = 8;
                for (int i = 0; i < board.length; i++) {
                    out.println("");
                    out.print(countdown--);
                    for (int j = 0; j < board.length; j++) {
                        if (board[i][j] == null) {
                            out.print("  \u2009-  \u2009|");
                        }
                        else
                        {
                            out.print("  " + board[i][j] + "  |");
                        }

                    }
                }
                out.println("");
                out.println("   a      b      c     d      e     f      g      h");
                //out.println(eing);
                int cSourceX = Integer.parseInt(in.readLine());
                int cSourceY = Integer.parseInt(in.readLine());
                int cTargetX = Integer.parseInt(in.readLine());
                int cTargetY = Integer.parseInt(in.readLine());

                boardServer.printBoard();
                System.out.println("0...Weitermachen");
                System.out.println("1...Spiel abbrechen");
                eing = Integer.parseInt(sc.nextLine());

            }while(eing !=1);

        }


    }
}
