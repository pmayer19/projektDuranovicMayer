public class Bishop extends Figure {
    public Bishop(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }


    @Override
    public String toString() {
        if (isBlack == true) {
            return "♝";
        } else {
            return "♗";
        }
    }
    @Override
    public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
        boolean bool = false;
        if (fromRow < toRow && fromCol < toCol) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
//                        fromRow++;
                    }
                    break;
                }
            }
        } else if (fromRow > toRow && fromCol > toCol) {
            for (int i = fromCol - 1; i >= toCol; i--) {
                for (int j = fromRow - 1; j >= toRow; j--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
//                        fromRow--;
                    }
                    break;
                }
            }
        }
        else if(fromRow>toRow && fromCol<toCol) {
            for (int i = fromCol + 1; i <= toCol ; i++) {
                for (int j = fromRow - 1; j>= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
//                        fromRow--;
                    }
                    break;
                }
            }
        } else if(fromRow<toRow && fromCol>toCol) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false) {
                        bool = true;
//                        fromRow++;
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
        if (fromRow < toRow && fromCol < toCol) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
//                        fromRow++;
                    }
                    break;
                }
            }
        } else if (fromRow > toRow && fromCol > toCol) {
            for (int i = fromCol - 1; i >= toCol; i--) {
                for (int j = fromRow - 1; j >= toRow; j--) {
                    if (BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
//                        fromRow--;
                    }
                    break;
                }
            }
        }
        else if(fromRow>toRow && fromCol<toCol) {
            for (int i = fromCol + 1; i <= toCol ; i++) {
                for (int j = fromRow - 1; j>= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
//                        fromRow--;
                    }
                    break;
                }
            }
        } else if(fromRow<toRow && fromCol>toCol) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true) {
                        bool = true;
//                        fromRow++;
                    }
                    break;
                }
            }
        }
        return bool;
    }
}
