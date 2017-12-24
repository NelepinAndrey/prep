public class Sorting {
    public static void main(String[] args) {
        int array[] = {10, 14, 5, 6, 7, 2, 16, 77, 35, 1};
        bubbles(array);
        int i;
        for (i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    private static void bubbles(int[] array) {
        int i, j, k;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;

                }
            }
        }
    }
}