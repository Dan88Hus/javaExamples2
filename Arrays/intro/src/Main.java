import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0]= 45 ;
        // array also are object
//        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]); // 6

        int[] my3rdway = new int[10];
        for (int i = 0; i < my3rdway.length; i++) {
            my3rdway[i] = i * 10;
//            System.out.println(my3rdway[i]);
        }
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("typed values are: "+ myIntegers[i]);
        }

    }

    //    we only define type while creating method, not at the calling method getIntegers(NOT HERE)
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
