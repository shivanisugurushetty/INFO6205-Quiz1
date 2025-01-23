public class BubbleSort {
    /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param a The array to be sorted. It contains elements that implement the Comparable interface.
     *          This allows the method to sort any type of objects that can be compared (e.g., Integers, Strings).
     *
     * Hint: Remember to break the loop if no elements are swapped during a pass.
     *       This optimization ensures the algorithm stops early if the array is already sorted.
     */
    public void sort (Comparable[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    swap(a,j,j+1);
                }
            }
        }


    }
    /**
     * Swaps two elements in the given array.
     *
     * @param a The array in which the elements are to be swapped.
     * @param j The index of the first element to swap.
     * @param i The index of the second element to swap.
     */
    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    }

