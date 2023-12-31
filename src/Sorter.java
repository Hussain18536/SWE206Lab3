public class Sorter {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public void sort(int[] array){
        insertionSort(array);
    }
    public void sort1(int[] array){
        selectionSort(array);
    }

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 6;
        array[1] = 18;
        array[2] = 2;
        array[3] = 7;
        array[4] = 29;

        for (int i = 0; i < array.length;i++)
            System.out.println(array[i]);

        selectionSort(array);

        for (int i = 0; i < array.length;i++)
            System.out.println(array[i]);








    }


}
