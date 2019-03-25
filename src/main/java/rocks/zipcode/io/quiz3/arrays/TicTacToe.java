package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = {board[2][value] , board[1][value], board[0][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        if(row[0]==row[1]&&row[1]==row[2]){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        if (column[0] == column[1] && column[1] == column[2]) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        for(int i = 0 ; i < 3 ; i++){
            if(isColumnHomogeneous(i)){
                String[] winningColumn = getColumn(i);
                return winningColumn[0].toString();
            }
            if(isRowHomogenous(i)){
                String[] winningRow = getRow(i);
                return winningRow[0].toString();
            }
        }
        return "X";
    }

    public String[][] getBoard() {
        return this.board;
    }
}
