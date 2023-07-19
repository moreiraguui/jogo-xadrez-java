package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

import java.rmi.server.UID;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}