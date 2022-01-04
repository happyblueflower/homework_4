package homework_4;

public class project8_4 {

	public static void main(String[] args) {
		int[][] time = {
                {2,4,3,4,5,8,8},
                {7,3,4,3,3,4,4},
                {3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},
                {3,5,4,3,6,3,8},
                {3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},
                {6,3,5,9,2,7,9}
        };
        int[] employee = new int[8];
        int[] flag = new int[8];
        for (int i = 0;i < 8;i++) {
            for (int j = 0; j < 7; j++) {
                employee[i] += time[i][j];
            }
            flag[i] = i;
        }
        for (int i = 0;i < 7;i++){
            int temp;
            for (int j = 0;j < 7 - i;j++){
                if (employee[j] > employee[j + 1]){
                    temp = employee[j];
                    employee[j] = employee[j + 1];
                    employee[j + 1] = temp;
                    temp = flag[j];
                    flag[j] = flag[j + 1];
                    flag[j + 1] = temp;
                }
            }
        }
        for (int i = 0;i < 8;i++){
            System.out.println("Employee" + flag[i] + "'s total time is " + employee[i]);
        }

	}

}
