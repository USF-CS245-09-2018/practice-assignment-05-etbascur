public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length;i++) { // i= 1 because we assume initially that left of i is sorted
            int temp = a[i]; //copy of index at i to be compared
            int k = i - 1;  //value being compared (previous index) initially it will be a[0] (i-1)
            while (k>=0 && a[k] > temp){ //copies the lesser values towards the front of the array (to a lower index)
                a[k+1] = a[k]; //swaps the indexes
                --k;
            }
            a[k+1] = temp; //moves on to the next index to compare
        }

    }
}
