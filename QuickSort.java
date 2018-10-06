public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {

        quicksort(arr, 0, arr.length - 1);
    }

    public void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int k = high;

        if (low < high) {
            while (i < k) {
                while ((i <= k) && arr[i] <= arr[pivot]) {
                    ++i;
                }
                while ((k >= i) && arr[k] > arr[pivot]) {
                    --k;
                }
                if (i < k) {
                    swap(i, k, arr);
                }
            }
            swap(k, pivot, arr);
            return k;
        }
        return -1;
    }
}