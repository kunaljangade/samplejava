package scrap;

import java.util.Scanner;

public class MatrixMultiplication {

    private static int[][] MatA, MatB, MatC, Matric;
    private static int numberOfColumns, numberOfRows;

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        enterDim();
        MatA = new int[numberOfRows][numberOfColumns];
        //Matric = MatA;
        insertData(MatA);
        //MatA = Matric;

        System.out.println("Matrix A: ");
        print(MatA);

        enterDim();
        MatB = new int[numberOfRows][numberOfColumns];
        //Matric = MatB;
        insertData(MatB);
        //MatA = Matric;


        System.out.println("Matrix B: ");
        print(MatB);

        MatC = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < MatC.length; i++)
            for (int j = 0; j < MatC.length; j++)
                MatC[i][j] = 0;// (int) Math.random()

        multiply(MatA, MatB);
        System.out.println("Multiplied Matrix");

        print(MatC);









        /*------------------------------------------------------------------------------------------/
/*
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];
        Scanner scan = new Scanner(System.in);
        int row, col;


        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B.length; j++) {
                A[i][j] = 2;// (int) Math.random();
                B[i][j] = 3;// (int) Math.random();
            }

        System.out.println("Matrix A:");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B:");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMultiplied:");

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }*/


    }

    private static void multiply(int[][] matA, int[][] matB) {

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matB.length; j++) {
                for (int k = 0; k < matB.length; k++) {
                    MatC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
    }

    public static void enterDim() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number of columns for S to proceed: ");
        numberOfColumns = scan.nextInt();

        System.out.println("Enter the Number of rows for First proceed: ");
        numberOfRows = scan.nextInt();

    }

    public static void insertData(int[][] mat) {

        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random() * 1001);
            }
    }

    public static void print(int[][] MatA) {
        for (int i = 0; i < MatA.length; i++) {
            for (int j = 0; j < MatA.length; j++) {
                System.out.print(MatA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
