package homework_4;
import java.util.Scanner;
public class project8_8 {

	public static void main(String[] args) {
		final int inf = 999999999;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number points: ");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][4];

        for(int i = 0; i < points.length; ++i){
            java.util.Arrays.fill(points[i], inf);
        }

        System.out.print("Enter " + numberOfPoints + " points:");
        for(int i = 0; i < numberOfPoints; ++i){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);

        for(int i = 0; i < points.length - 1; ++i){
            for(int j = i+1; j < points.length; ++j){
                double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);

                if(distance < points[i][2]){
                    points[i][2] = distance;
                    points[i][3] = j;
                }
                if(distance < points[j][2]){
                    points[j][2] = distance;
                    points[j][3] = i;
                }

                if(shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        for(int i = 1; i < points.length; ++i){
            if(points[i][2] == shortestDistance){
                System.out.println("The closest two points are (" + points[i][0] + "," + points[i][1] + ")" + " and (" + points[(int)points[i][3]][0] + "," + points[(int)points[i][3]][1] + ")" + "");
            }
        }
        System.out.println("Their diatance is " + shortestDistance);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2-x1) + (y2 - y1) * (y2 - y1));

	}

}
