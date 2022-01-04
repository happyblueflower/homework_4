package homework_4;
import java.util.Scanner;
public class project8_6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] a = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        double[][] b = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }
        double[][] c = new double[3][3];
        c = multiplyMatrix(a, b);
        System.out.println("The multiplication of the matrices is ");
        System.out.printf("%.1f %.1f %.1f\t \t%.1f %.1f %.1f\t \t%.1f %.1f %.1f\n", a[0][0], a[0][1], a[0][2], b[0][0], b[0][1], b[0][2], c[0][0], c[0][1], c[0][2]);
        System.out.printf("%.1f %.1f %.1f\t*\t%.1f %.1f %.1f\t=\t%.1f %.1f %.1f\n", a[1][0], a[1][1], a[1][2], b[1][0], b[1][1], b[1][2], c[1][0], c[1][1], c[1][2]);
        System.out.printf("%.1f %.1f %.1f\t \t%.1f %.1f %.1f\t \t%.1f %.1f %.1f\n", a[2][0], a[2][1], a[2][2], b[2][0], b[2][1], b[2][2], c[2][0], c[2][1], c[2][2]);
    }
    public static double[][] multiplyMatrix(double[][] a,double[][] b) {
        if (a[0].length != b.length) {
            System.out.println("第一个矩阵的列不等于第二个矩阵的行！无法进行矩阵相乘运算！");
            return null;
        } else {
            double[][] c = new double[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++)
                    for (int t = 0; t < a[0].length; t++) {
                        c[i][j] += a[i][t] * b[t][j];
                    }
                System.out.println();
            }
            return c;
        }
	}

}
