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

        //Task2
        System.out.println(arrays1[0] + ", " + arrays1[1] + ", " + arrays1[2]);
        System.out.println(arrays2[0] + ", " + arrays2[1] + ", " + arrays2[2]);
        System.out.println(arrays3[0] + ", " + arrays3[1] + ", " + arrays3[2]);

        //Task3
        System.out.println(arrays1[2] + ", " + arrays1[1] + ", " + arrays1[0]);
        System.out.println(arrays2[2] + ", " + arrays2[1] + ", " + arrays2[0]);
        System.out.println(arrays3[2] + ", " + arrays3[1] + ", " + arrays3[0]);

        //Task4
        System.out.println("Task4");
        for (int i = 0; i < arrays1.length; i++) {
            if (arrays1[i] % 2 == 0) {
                arrays1[0] = arrays1[0] + 1;
                System.out.println(i);
            } else if (arrays1[i]%2==0) {
                arrays1[1]=arrays1[1]+1;
                System.out.println(i);
            } else if (arrays1[i]%2==0) {
                arrays1[2]=arrays1[2]+1;
                System.out.println(i);

            }
        }


    }
}







