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

    public static void main(String[] args) {
        BoardServer boardServer = new BoardServer();
        boardServer.fillBoard();
        boardServer.printBoard();
    }
}
