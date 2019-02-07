
package quick_sort;


public class Quick_sort {

    
    public static void main(String[] args) {

        Integer base_array[] = {4, 2, 8, 1, 3, 7, 6, 5};

        for (Integer i : base_array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        qsort(base_array, 0, base_array.length - 1);

        for (Integer i : base_array) {
            System.out.print(i + " ");
        }
        System.out.println();
        

    }

    public static void qsort(Integer[] array, int begin, int end) {
        
        System.out.println("Глубина рекурсии: " + begin + ", " + end);

        Integer pivot = array[begin + (end - begin)/2];
        Integer left = begin, right = end;
        
        do {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        } while (left <= right);
        
        if (right > begin) {
            qsort(array, begin, right);
        }
        
        if (left < end) {
            qsort(array, left, end);
        }
    }

    public static void swap(Integer[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
