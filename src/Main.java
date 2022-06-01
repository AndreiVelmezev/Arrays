import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Task1
        int[] arrays1 = new int[3];
        arrays1[0] = 1;
        arrays1[1] = 2;
        arrays1[2] = 3;

        double[] arrays2 = {1.57, 7.654, 9.986};

        int[] arrays3 = {100, 200, 300};
        System.out.println(" ");

        //Task2
        System.out.println("------Task2");
        for (int i = 0; i < arrays1.length - 1; i++) {
            System.out.print(arrays1[i] + ", ");
        }
        System.out.println(arrays1[arrays1.length - 1]);

        for (int i = 0; i < arrays2.length - 1; i++) {
            System.out.print(arrays2[i] + ", ");
        }
        System.out.println(arrays2[arrays2.length - 1]);

        for (int i = 0; i < arrays3.length - 1; i++) {
            System.out.print(arrays3[i] + ", ");
        }
        System.out.println(arrays3[arrays3.length - 1]);


        //Task3
        System.out.println("------Task3");
        for (int i = arrays1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrays1[i] + ", ");
            } else {
                System.out.println(arrays1[i]);
            }
        }

        for (int i = arrays2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrays2[i] + ", ");
            } else {
                System.out.println(arrays2[i]);
            }
        }
        for (int i = arrays3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrays3[i] + ", ");
            } else {
                System.out.println(arrays3[i]);
            }
        }

        //Task4
        System.out.println("Task4");
        for (int i = 0; i < arrays1.length; i++) {
            if (arrays1[i] % 2 == 1) {
                arrays1[i] += 1;
            }
            if (i != arrays1.length - 1) {
                System.out.print(arrays1[i] + ", ");
            } else
                System.out.println(arrays1[i]);


        }
    }
}







