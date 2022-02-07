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
        return false;
    }

    @Override
    public boolean moveWhite(int toCol, int toRow, int fromCol, int fromRow) {
        return false;
    }

}
