package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.enums.Color;

public class Rook extends ChessPiece {

    private static final String PIECE_ROOK = "R";

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return PIECE_ROOK;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
