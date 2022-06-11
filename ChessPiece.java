package ChessProject;

public abstract class ChessPiece {
    String color;
    boolean check =true;

    public ChessPiece(String color){
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();
    public boolean isValidPosition(int position){
        return position<=7 && position>=0;
    }
    public int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public int getMin(int a, int b) {
        return Math.min(a, b);
    }

}
