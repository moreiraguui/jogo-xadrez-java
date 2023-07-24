package chess;

import boardgame.Position;
import chess.exception.ChessException;

public class ChessPosition {

    private static final char INIT_POSITION_ROW = 'a';
    private static final char FINAL_POSITION_ROW = 'h';

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < INIT_POSITION_ROW || column > FINAL_POSITION_ROW || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return  new Position(8 - row, column - INIT_POSITION_ROW);
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)(INIT_POSITION_ROW - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}