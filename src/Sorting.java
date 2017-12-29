public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int array[] = {10, 14, 5, 6, 7, 2, 16, 77, 35, 1};
        sorting.bubbleSort(array);
        sorting.selectionSort(array);
        sorting.mergeSort(array, 0, array.length - 1);
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    private void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                swap(array, i, minIndex);
            }
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int leftArray[] = new int[size1];
        int rightArray[] = new int[size2];

        System.arraycopy(array, left, leftArray, 0, size1);
        for (int j = 0; j < size2; ++j)
            rightArray[j] = array[mid + 1 + j];
        int i = 0, j = 0;

        int k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}