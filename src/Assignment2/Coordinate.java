package Assignment2;

/**
 * Created by constantin on 18/06/16.
 */
public class Coordinate {
    private static final char FIRST_LETTER = 'A';
    private static final char FIRST_NUMBER = '1';
    private int col;
    private int row;

    public Coordinate(String point){
        this.row = (int) point.charAt(0) - FIRST_LETTER;
        this.col = (int) point.charAt(1) - FIRST_NUMBER;
    }

    public Coordinate(char row , int col){
        this.row = row - FIRST_LETTER;
        this.col = col - 1;
    }

    public boolean equals(Coordinate coor){
        return this.col == coor.getCol()
                && this.row == coor.getRow();
    }

    public int getCol(){
        return col;
    }

    public int getRow(){
        return row;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            //The same address
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            //Not this class or null pointer
            return false;
        }
        Coordinate coordinate = (Coordinate) o;
        return (coordinate.getCol() == this.getCol()) && (coordinate.getRow() == this.getRow());
    }

    @Override
    public int hashCode() {
        int result = col;
        result = 31 * result + row;
        return result;
    }*/

    @Override
    public String toString(){
        return "Row: " + row + ", Col:" + col;
    }
}