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
    public boolean moveBlack(int sourceX, int sourceY, int targetX, int targetY) {
        return false;
    }

    @Override
    public boolean moveWhite(int toCol, int roRow, int fromCol, int fromRow) {
        return false;
    }
}
