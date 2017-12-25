public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int array[] = {10, 14, 5, 6, 7, 2, 16, 77, 35, 1};
        sorting.bubbleSort(array);
        int i;
        for (i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    private void bubbleSort(int[] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}