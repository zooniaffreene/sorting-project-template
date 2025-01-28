import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10, 1, 100);

        System.out.println("Randomly generated array: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        TestSuite.run(randomArray, 10000); 
    }


    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; 
        }

        return array;
    }
}
