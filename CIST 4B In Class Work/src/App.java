public class App {

    public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) { 
        int x = arr[i]; 
        int j = i - 1;

        while (j >= 0 && arr[j] > x) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = x;
    }
}

    
    public static void main(String[] args) {
        int[] arr = {51,2,88,74,73,5,18};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}




    
