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

        double [] [] matrix3 = new double[][]{{1}};
        System.out.println(matrixWorker.calculateDeterminant(matrix3));

        double [][] matrix4 = new double[][]{{2,0},{1,1}};
        System.out.println(matrixWorker.calculateDeterminant(matrix4));
        double [] [] matrix5 = new double[][] {{1,2,3},{4,5,6},{7,8,10}};
        System.out.println(matrixWorker.calculateDeterminant(matrix5));
        double [] [] matrix6 = new double[][] {{1,2,3,4},{4,5,6,7},{7,8,10,10},{1,1,1,0}};
        System.out.println(matrixWorker.calculateDeterminant(matrix6));
        double[][] matrix7 = matrixWorker.minorMatrix(matrix6,0,0);
        matrixWorker.print(matrix7);




    }
}
