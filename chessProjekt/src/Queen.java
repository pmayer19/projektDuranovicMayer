public class Queen extends Figure{
    public Queen(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }


    @Override
    public String toString() {
        if(isBlack == true)
        {
            return "♛";
        }else
        {
            return "♕";
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
                for (int i = fromRow + 1; i <= toRow; ++i) {
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
        else if (fromRow < toRow && fromCol < toCol  && toRow - fromRow == toCol - fromCol) {
            for (int i = fromCol +1  ; i <= toCol; i++) {
                for (int j = fromRow +1 ;j <= toRow; j++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
                        //fromRow++;
                    }
                    break;
                }
            }
        } else if (fromRow > toRow && fromCol > toCol && fromRow - toRow == fromCol - toCol) {
            for (int i = fromCol - 1; i >= toCol; i--) {
                for (int j = fromRow - 1; j >= toRow; j--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
                        //fromRow--;
                    }
                    break;
                }
            }
        }
        else if(fromRow > toRow && fromCol < toCol && fromRow - toRow == toCol - fromCol) {
            for (int i = fromCol + 1; i <= toCol ; i++) {
                for (int j = fromRow - 1; j>= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
                        //fromRow--;
                    }
                    break;
                }
            }
        } else if(fromRow < toRow && fromCol > toCol && toRow - fromRow == toCol - fromCol) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
                        //fromRow++;
                    }
                    break;
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
                for (int i = fromRow + 1; i <= toRow; ++i) {
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
        else if (fromRow < toRow && fromCol < toCol  && toRow - fromRow == toCol - fromCol) {
            for (int i = fromCol +1  ; i <= toCol; i++) {
                for (int j = fromRow +1 ;j <= toRow; j++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                        //fromRow++;
                    }
                    break;
                }
            }
        } else if (fromRow > toRow && fromCol > toCol && fromRow - toRow == fromCol - toCol) {
            for (int i = fromCol - 1; i >= toCol; i--) {
                for (int j = fromRow - 1; j >= toRow; j--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                        //fromRow--;
                    }
                    break;
                }
            }
        }
        else if(fromRow > toRow && fromCol < toCol && fromRow - toRow == toCol - fromCol) {
            for (int i = fromCol + 1; i <= toCol ; i++) {
                for (int j = fromRow - 1; j>= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                        //fromRow--;
                    }
                    break;
                }
            }
        } else if(fromRow < toRow && fromCol > toCol && toRow - fromRow == toCol - fromCol) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
                        //fromRow++;
                    }
                    break;
                }
            }
        }
        return bool;
    }
}
