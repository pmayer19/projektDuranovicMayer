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

       @Override
       public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
           boolean bool = false;
           if(fromRow == toRow) {
               //horizontal
               if(fromCol < toCol) {
                   //nach rechts
                   for (int i = fromCol + 1; i <= toCol; i++) {
                       if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false ) {
                           bool = true;
                       }
                   }
               } else {
                   //nach links
                   for (int i = fromCol - 1; i >= toCol; i--) {
                       if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                           bool = true;
                       }
                   }
               }
           } else if(fromCol == toCol) {
               //vertikal
               if(fromRow < toRow) {
                   //nach unten
                   for (int i = fromRow + 1; i <= toRow; i++) {
                       if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                           bool = true;
                       }
                   }
               } else {
                   //nach oben
                   for (int i = fromRow - 1; i >= toRow; i--) {
                       if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
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
                for (int i = fromCol + 1; i <= toCol; i++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true ) {
                        bool = true;
                    }
                }
            } else {
                //nach links
                for (int i = fromCol - 1; i >= toCol; i--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                    }
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow < toRow) {
                //nach unten
                for (int i = fromRow + 1; i <= toRow; i++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                    }
                }
            } else {
                //nach oben
                for (int i = fromRow - 1; i >= toRow; i--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }
}
