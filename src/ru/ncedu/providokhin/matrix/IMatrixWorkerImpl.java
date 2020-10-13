package ru.ncedu.providokhin.matrix;

public class IMatrixWorkerImpl implements IMatrixWorker {

    @Override
    //m.length-число строчек в матрице
    public void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) {
        double[][] res = new double[m1.length][m1[0].length];
        if (haveSameDimension(m1, m2)) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    res[i][j] = m1[i][j] + m2[i][j];
                }
            }
        }
        return res;
    }

    @Override
    public double[][] subtract(double[][] m1, double[][] m2) {
        double[][] res = new double[m1.length][m1[0].length];
        if (haveSameDimension(m1, m2)) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    res[i][j] = m1[i][j] - m2[i][j];
                }
            }
        }
        return res;
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2) {
        if (m1[0].length == m2.length) {
            double[][] res = new double[m1.length][m2[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0; k < m1[0].length; k++) {
                        res[i][j] += m1[i][k] * m2[k][j];
                    }

                }

            }
            return res;
        }
        return null;
    }
}
