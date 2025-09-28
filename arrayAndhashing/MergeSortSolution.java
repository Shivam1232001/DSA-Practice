//https://leetcode.com/problems/sort-an-array/description/
    public class MergeSortSolution {

        // Merge Sort recursive function
        public void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                int mid = l + (r - l) / 2;
    
                // Sort left half
                mergeSort(arr, l, mid);
    
                // Sort right half
                mergeSort(arr, mid + 1, r);
    
                // Merge sorted halves
                merge(arr, l, mid, r);
            }
        }
    
        // Merge two sorted subarrays: arr[l..m] and arr[m+1..r]
        public void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
    
            int[] L = new int[n1];
            int[] R = new int[n2];
    
            // Copy data
            for (int i = 0; i < n1; i++) {
                L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[m + 1 + j];
            }
    
            // Merge temp arrays back into arr
            int i = 0, j = 0, k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
                }
            }
    
            // Copy remaining elements
            while (i < n1) {
                arr[k++] = L[i++];
            }
            while (j < n2) {
                arr[k++] = R[j++];
            }
        }
    
        // Public function to sort
        public int[] sortArray(int[] arr) {
            mergeSort(arr, 0, arr.length - 1);
            return arr;
        }
    
        // ---------- Test ----------
        public static void main(String[] args) {
            MergeSortSolution sol = new MergeSortSolution();
    
            int[] arr = {38, 27, 43, 3, 9, 82, 10};
    
            System.out.println("Original Array:");
            printArray(arr);
    
            sol.sortArray(arr);
    
            System.out.println("\nSorted Array:");
            printArray(arr);
        }
    
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    

