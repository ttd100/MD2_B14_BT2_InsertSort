import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {
    static int[] list = {9,8,7,6,5,4,3,2,1,0};
    public static void insertionSort(int[] array){
        int pos , x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]){
                array[pos] = array[pos -1];
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}