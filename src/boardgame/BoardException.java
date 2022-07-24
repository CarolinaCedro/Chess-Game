package boardgame;

import Chess.ChessException;

public class BoardException extends ChessException {

    private static final long serialVersionUID = 1L;

    public BoardException(String msg) {
        super(msg);
    }
}
