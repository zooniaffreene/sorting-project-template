public class SelectionSort implements Sorter {

    @Override
    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
    }
}
