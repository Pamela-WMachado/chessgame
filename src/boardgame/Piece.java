package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //position = null;
    }

    //metodo protected pois somente classes dentro do mesmo package
    // e subclasses poderão acessar o board
    //não vamos querer que o board seja acessível pela camada de xadrez, ele é de uso interno
    protected Board getBoard() {
        return board;
    }
}
