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

}
