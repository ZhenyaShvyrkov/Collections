import com.sun.source.tree.Tree;

import java.util.*;


public class CheckArrayForDuplicates {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,1,1};
        containsDuplicate(a);

    }
    static boolean containsDuplicate(int array[]){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for (int k = 0; k<array.length; k++ ){
                if(array[i] == array[k]) counter++;
            }
            if(counter > 1){
                System.out.println("Array: " + Arrays.toString(array));
                System.out.println("Result: " + true);
                System.out.println("Число " + array[i] + " повторяется " + counter + " раза");
                return true;
            }
            counter = 0;
        }
        return false;
    }
}
