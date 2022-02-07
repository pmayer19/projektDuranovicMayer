public class Pawn extends Figure{
    public Pawn(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }


    @Override
    public String toString() {
        if(isBlack == true)
        {
            return "♟";
        }else
        {
            return "♙";
        }
    }

    @Override
    public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
        boolean b = false;

        if (BoardServer.board[fromCol][fromRow] == BoardServer.board[1][0] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][1] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][2] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][3] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][4] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][5] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][6] || BoardServer.board[fromCol][fromRow] == BoardServer.board[1][7]){
            if(toCol == fromCol +2 && toRow == fromRow)
            {
                b = true;
            }
        }
        else if(toCol == fromCol +1 && toRow == fromRow) {
            b = true;
        }
        else if(toCol == fromCol +1 && toRow == fromRow +1 && BoardServer.board[toCol][toRow] != null && BoardServer.board[toCol][toRow].isBlack ==false) {
            b = true;
        }
        else if(toCol == fromCol -1 && toRow == fromRow +1 && BoardServer.board[toCol][toRow] != null && BoardServer.board[toCol][toRow].isBlack ==false) {
            b = true;
        }
        return b;
    }
    @Override
    public boolean moveWhite(int toCol, int toRow, int fromCol, int fromRow) {
        boolean b = false;
        if (BoardServer.board[fromCol][fromRow] == BoardServer.board[6][0] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][1] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][2] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][3] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][4] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][5] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][6] || BoardServer.board[fromCol][fromRow] == BoardServer.board[6][7]){
            if(toCol == fromCol -2 && toRow == fromRow)
            {
                b = true;
            }
        }
        else if(toCol == fromCol -1 && toRow == fromRow)
        {
            b = true;
        }
        else if(toCol == fromCol -1 && toRow == fromRow -1 && BoardServer.board[toCol][toRow] != null && BoardServer.board[toCol][toRow].isBlack ==true)
        {
            b = true;
        }
        else if(toCol == fromCol -1 && toRow == fromRow +1 && BoardServer.board[toCol][toRow] != null && BoardServer.board[toCol][toRow].isBlack ==true)
        {
            b = true;
        }
        return b;
    }
}

