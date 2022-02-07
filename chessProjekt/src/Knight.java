public class Knight extends Figure{
    public Knight(int x, int y, boolean isBlack) {
        super(x, y, isBlack);
    }



    @Override
    public String toString() {
        if(isBlack == true)
        {
            return "♞";
        }else
        {
            return "♘";
        }
    }

    @Override
    public boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow) {
        boolean b = false;
        if(toCol + 1 == fromCol && fromRow + 2 == toRow) {
            for (int i = fromCol - 1;i >= toCol;i--) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol == fromCol + 1 && fromRow + 2 == toRow) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 1 == fromCol && toRow + 2 == fromRow) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow - 1; j >= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(fromCol + 1 == toCol && fromRow == toRow + 2) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow - 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 2 == fromCol && fromRow + 1 == toRow) {
            for (int i = fromRow - 1;i >= toRow;i--) {
                for (int j = fromCol + 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(toCol == fromCol + 2 && fromRow + 1 == toRow) {
            for (int i = fromRow + 1; i <= toRow; i++) {
                for (int j = fromCol + 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 2 == fromCol && toRow + 1 == fromRow) {
            for (int i = fromRow - 1; i >= toRow; i++) {
                for (int j = fromCol - 1; j >= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(fromCol + 2 == toCol && fromRow == toRow + 1) {
            for (int i = fromRow + 1; i <= toRow; i++) {
                for (int j = fromCol - 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == false && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        }
        return b;
    }

    @Override
    public boolean moveWhite(int toCol, int toRow, int fromCol, int fromRow) {
        boolean b = false;
        if(toCol + 1 == fromCol && fromRow + 2 == toRow) {
            for (int i = fromCol - 1;i >= toCol;i--) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol == fromCol + 1 && fromRow + 2 == toRow) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow + 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 1 == fromCol && toRow + 2 == fromRow) {
            for (int i = fromCol - 1; i >= toCol; i++) {
                for (int j = fromRow - 1; j >= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(fromCol + 1 == toCol && fromRow == toRow + 2) {
            for (int i = fromCol + 1; i <= toCol; i++) {
                for (int j = fromRow - 1; j <= toRow; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toCol && j==toRow) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 2 == fromCol && fromRow + 1 == toRow) {
            for (int i = fromRow - 1;i >= toRow;i--) {
                for (int j = fromCol + 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(toCol == fromCol + 2 && fromRow + 1 == toRow) {
            for (int i = fromRow + 1; i <= toRow; i++) {
                for (int j = fromCol + 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(toCol + 2 == fromCol && toRow + 1 == fromRow) {
            for (int i = fromRow - 1; i >= toRow; i++) {
                for (int j = fromCol - 1; j >= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        } else if(fromCol + 2 == toCol && fromRow == toRow + 1) {
            for (int i = fromRow + 1; i <= toRow; i++) {
                for (int j = fromCol - 1; j <= toCol; j++) {
                    if(BoardServer.board[toCol][toRow] == null || BoardServer.board[toCol][toRow].isBlack == true && i==toRow && j==toCol) {
                        b = true;
                    }
                }
            }
        }
        return b;
    }
}
