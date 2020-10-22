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

    @Override
    public boolean checkSquare(double[][] m1) {
        for (int i = 0; i < m1.length; i++) {
            if (m1.length != m1[i].length) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double calculateDeterminant(double[][] m1) {
        double result = 0;
        if (checkSquare(m1)) {
            if (m1.length == 1) {
                return m1[0][0];

            }
            if (m1.length == 2) {
                result += m1[0][0] * m1[1][1] - m1[0][1] * m1[1][0];
            } else {
                for (int i = 0; i < m1.length; i++) {
                    //double [][] minor = new double[][];
                    result += Math.pow(-1, i) * m1[0][i] * calculateDeterminant(minorMatrix(m1, 0, i));
                }
            }
        }
        return result;
    }

    @Override
    public double[][] minorMatrix(double[][] m1, int line, int column) {
        double[][] minor = new double[m1.length - 1][m1.length - 1];
        int mi = 0;
        int mj = 0;
        for (int i = 0; i <= minor.length; i++) {
            mj = 0;
            for (int j = 0; j <= minor.length; j++) {
                if (i == line) {
                    mi = 1;
                } else {
                    if (j == column) {
                        mj = 1;
                    } else {
                        minor[i - mi][j - mj] = m1[i][j];
                    }
                }
            }
        }

        return minor;

    }

}
