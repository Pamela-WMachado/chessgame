package boardgame;

public class Board {
    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
    public Integer getRows() {
        return rows;
    }
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns += columns;
    }

    public Piece piece(Integer row, Integer column) {
        return pieces[row][column];
    }
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    //novo método que insere uma peça em uma posição
    //pega a matriz de peças do tabuleiro que já foi instanciada no construtor
    // e atribui a sua position a piece recebida como argumento
    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
