public abstract class Figure {
    int x;
    int y;
    boolean isBlack;

    public Figure(int x, int y, boolean isBlack) {
        this.x = x;
        this.y = y;
        this.isBlack = isBlack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract boolean moveBlack(int toCol, int toRow, int fromCol, int fromRow);

    public abstract boolean moveWhite(int toCol, int roRow, int fromCol, int fromRow);
}
