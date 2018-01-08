public class Sorting {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int array[] = {1, 4, 23, 10, 13, 9, 15, 20, 25, 2, 20, 19, 30};
        sorting.bubbleSort(array);
        sorting.selectionSort(array);
        sorting.mergeSort(array, 0, array.length - 1);
        sorting.insertion(array);
        sorting.quickSort(array, 0, array.length - 1);
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

    private void insertion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(array, j - 1, j);
                j--;
            }
        }
    }


    private void quick(int[] array, int mid, int left, int right) {
        while (left < right) {
            while (array[left] < array[mid])
                left++;
            while (array[right] > array[mid])
                right--;
            if (array[left] > array[right]) {
                swap(array, left, right);
            }
        }
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            quick(array, mid, left, right);
            if (left < mid)
                quickSort(array, left, mid);
            if (mid < right)
                quickSort(array, mid + 1, right);
        }
    }
}




