package ru.ncedu.providokhin.matrix;

public interface IMatrixWorker {
    /**
     * This method prints the matrix to the console
     *
     * @param m - the matrix to be printed
     */

    public void print(double[][] m);

    /**
     * This method compares size two matrices
     * return true when sizes of matrix equals
     *
     * @param m1 - first matrix
     * @param m2 - second matrix
     * @return true if sizes of matrix equals other false
     */
    public boolean haveSameDimension(double[][] m1, double[][] m2);

    /**
     * This method adds  two matrices
     *
     * @param m1 - first matrix
     * @param m2 - second matrix
     * @return result matrix
     */
    public double[][] add(double[][] m1, double[][] m2);

    /**
     * This method subtracts the second matrix from first matrix
     *
     * @param m1 - first matrix
     * @param m2 - second matrix
     * @return result matrix
     */
    public double[][] subtract(double[][] m1, double[][] m2);

    /**
     * This method multiplies  two matrices
     *
     * @param m1 - first matrix
     * @param m2 - second matrix
     * @return result matrix
     */
    public double[][] multiply(double[][] m1, double[][] m2);
    /**
     * This method compares size of columns and size of kines in matrix
     * return true when sizes  equals
     *
     * @param m1 -  matrix
     * @return true if size of columns and size of lines  matrix equals other false
     */
    public boolean checkSquare(double[][] m1);
    /**
     * This method compares size of columns and size of kines in matrix
     * return true when sizes  equals
     *
     * @param m1 -  matrix
     * @return true if size of columns and size of lines  matrix equals other false
     */
    public double calculateDeterminant(double[][] m1);
    /**
     * This recursive method calculate determinant for matrix
     *      * return determinant
     *
     * @param m1 -  matrix
     * @return  determinant
     */
    public double [][] minorMatrix(double[][] m1, int line, int column);
    /**
     * get Minor of matrix
     *
     * @param m1 -  matrix
     * @param line - the line is delete from matrix
     * @param column the column is delete from matrix
     * @return minor of matrix
     */


}
