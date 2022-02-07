public class Rook extends Figure{
    public Rook(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }

    @Override
    public String toString() {
        if(isBlack == true)
        {
            return "♜";
        }else
        {
            return "♖";
        }
    }

    public boolean figureBetween(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if(fromRow == toRow) {
            //horizontal
            if(fromCol < toCol) {
                //nach rechts
                for (int i = fromCol + 1; i < toCol; i++) { //+1
                    if (BoardServer.board[i][toRow] != null) {
                        bool = true;
                    }
                }
            } else {
                //nach links
                for (int i = fromCol - 1; i > toCol; i--) { //-1
                    if (BoardServer.board[i][toRow] != null) {
                        bool = true;
                    }
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow < toRow) {
                //nach unten
                for (int i = fromRow + 1; i < toRow; i++) { //+1
                    if (BoardServer.board[toCol][i] != null) {
                        bool = true;
                    }
                }
            } else {
                //nach oben
                for (int i = fromRow - 1; i > toRow; i--) { //-1
                    if (BoardServer.board[toCol][i] != null) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }

    @Override
    public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if(fromRow == toRow) {
            //horizontal
            if(fromCol < toCol) {
                //nach rechts
                for (int i = fromCol + 1; i < toCol; i++) { //+1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == false && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            } else {
                //nach links
                for (int i = fromCol - 1; i >= toCol; i--) { //-1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == false && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow < toRow) {
                //nach unten
                for (int i = fromRow + 1; i <= toRow; i++) { //+1
                    if (BoardServer.board[toCol][i] == null || BoardServer.board[toCol][i].isBlack == false && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            } else {
                //nach oben
                for (int i = fromRow - 1; i >= toRow; i--) { //-1
                    if (BoardServer.board[toCol][i] == null || BoardServer.board[toCol][i].isBlack == false && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }

    @Override
    public boolean moveWhite(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if(fromRow == toRow) {
            //horizontal
            if(fromCol < toCol) {
                //nach rechts
                for (int i = fromCol + 1; i <= toCol; i++) { //+1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == true && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            } else {
                //nach links
                for (int i = fromCol - 1; i >= toCol; i--) { //-1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == true && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow < toRow) {
                //nach unten
                for (int i = fromRow + 1; i <= toRow; i++) { //+1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == true  && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            } else {
                //nach oben
                for (int i = fromRow - 1; i >= toRow; i--) { //-1
                    if (BoardServer.board[i][toRow] == null || BoardServer.board[i][toRow].isBlack == true && figureBetween(toCol, toRow, fromCol, fromRow) == false) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }
}