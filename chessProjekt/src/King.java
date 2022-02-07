public class King extends Figure{

    public King(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }

    @Override
    public String toString() {
        if(isBlack == true)
        {
            return "♚";
        }else {
            return "♔";
        }
    }

    @Override
    public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if (toRow == fromRow + 1 && toCol == fromCol + 1) {
            if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                bool = true;
            }
        } else if (toRow == fromRow - 1 && toCol == fromCol - 1) {
            if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                bool = true;
            }
        } else if(fromRow == toRow + 1 && toCol == fromCol + 1) {
            if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                bool = true;
            }
        } else if(fromRow == toRow - 1 && toCol == fromCol - 1) {
            if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                bool = true;
            }
        } else if(fromRow == toRow) {
            //horizontal
            if(fromCol == toCol - 1) {
                //nach rechts
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                    bool = true;
                }
            } else if (fromCol == toCol + 1){
                //nach links
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                    bool = true;
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow == toRow - 1) {
                //nach unten
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                    bool = true;
                }
            } else if(fromRow == toRow + 1){
                //nach oben
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                    bool = true;
                }
            }
        }
        return bool;
    }

    @Override
    public boolean moveWhite(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if (toRow == fromRow + 1 && toCol == fromCol + 1) {
            if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                bool = true;
            }
        } else if (toRow == fromRow - 1 && toCol == fromCol - 1) {
            if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                bool = true;
            }
        } else if(fromRow == toRow + 1 && toCol == fromCol + 1) {
            if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                bool = true;
            }
        } else if(fromRow == toRow - 1 && toCol == fromCol - 1) {
            if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                bool = true;
            }
        } else if(fromRow == toRow) {
            //horizontal
            if(fromCol == toCol - 1) {
                //nach rechts
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                    bool = true;
                }
            } else if (fromCol == toCol + 1){
                //nach links
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                    bool = true;
                }
            }
        } else if(fromCol == toCol) {
            //vertikal
            if(fromRow == toRow - 1) {
                //nach unten
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                    bool = true;
                }
            } else if(fromRow == toRow + 1){
                //nach oben
                if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                    bool = true;
                }
            }
        }
        return bool;
    }
}
