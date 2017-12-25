public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int array[] = {10, 14, 5, 6, 7, 2, 16, 77, 35, 1};
        sorting.bubbleSort(array);
        sorting.selection(array);
        for (int anArray : array) System.out.println(anArray);
    }

    private void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
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

    private void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i])
                    swap(array, i, j);
            }
        }
    }
}