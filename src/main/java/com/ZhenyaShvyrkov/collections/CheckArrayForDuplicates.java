import com.sun.source.tree.Tree;

import java.util.*;


public class CheckArrayForDuplicates {
    public static void main(String[] args) {
        int array[] = {2, 2, 4,6,8,1,1,1};
        containsDuplicate(array);
    }
    static boolean containsDuplicate(int array[]){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
            boolean adding =  set.add(array[i]);
            if(!adding)
                return true;
        }
        return false;
    }
}
