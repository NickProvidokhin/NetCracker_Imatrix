package ru.ncedu.providokhin.matrix;

public class Main {
    public static void main(String[] args) {
        double[][] matrix = new double[][] {{1,1,1},{1,1,1}};
        IMatrixWorkerImpl matrixWorker = new IMatrixWorkerImpl();
        matrixWorker.print(matrix);

        System.out.println();

        double[][] matrix2 = new double[][] {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(matrixWorker.haveSameDimension(matrix,matrix2));
        System.out.println();

        double [][] resOfSum = matrixWorker.add(matrix,matrix2);
        matrixWorker.print(resOfSum);
        System.out.println();
        double [][] resOfSubtr = matrixWorker.subtract(matrix,matrix2);
        matrixWorker.print(resOfSubtr);
        System.out.println();
        double [][] resOfMult = matrixWorker.multiply(matrix, matrix2);
        //System.out.println(r);
        matrixWorker.print(resOfMult);



    }
}
