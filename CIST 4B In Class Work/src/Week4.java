public class Week4 {
    
    public static int partition(int[] arr, int low, int high) {
        
        // this is crateintg last element the pivot
        int pivot = arr[high]; 
        int i = low - 1; 
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; 
                //create temp variable to swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // this is the final swap to put the pivot into its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; 
    }
}
