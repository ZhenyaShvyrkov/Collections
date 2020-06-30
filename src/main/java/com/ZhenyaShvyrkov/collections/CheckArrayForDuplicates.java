import com.sun.source.tree.Tree;

import java.util.*;


public class CheckArrayForDuplicates {
    public static void main(String[] args) {
        int a[] = {2,4,6,2,2,8,1,1,1};
        containsDuplicate(a);
        //hasArrayElementsADuplicates(a);
    }
    static boolean containsDuplicate(int array[]){
        boolean result = false;
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for(int i = 0; i < array.length; i++) {
            int p = Collections.frequency(list, (Integer) array[i]);
            if(p > 1){
                map.put(array[i], p);
                result = true;
            }
        }
        if(map.isEmpty()){
            System.out.println("Array: " + list);
            System.out.println("Result: " + result);
            System.out.println("Дубликатов нет");
            return false;
        }
        else{
            System.out.println("Array: " + list);
            System.out.println("Result: " + result);
            for(Integer key : map.keySet()){
                System.out.println("Число " + key + " повторяется " + map.get(key) + " раза");
            }
            return true;
        }
    }
    static boolean hasArrayElementsADuplicates(int array[]){
        Map<Integer,Integer> map = new HashMap<>();
        int a[] = Arrays.copyOf(array,array.length);
        boolean result = false;
        Arrays.sort(array);
        int count = 0;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i+1]) continue;
            for (int k = 0; k < array.length;k++){
                if(array[i]==array[k]) count++;
            }
            if(count > 1)
            map.put(array[i], count);
            count = 0;
        }
        if(map.isEmpty()){
            System.out.println("Array: " + Arrays.toString(a));
            System.out.println("Result: " + result);
            System.out.println("Дубликатов нет");
            return false;
        }
        else{
            result = true;
            System.out.println("Array: " + Arrays.toString(a));
            System.out.println("Result: " + result);
            for(Integer key : map.keySet()){
                System.out.println("Число " + key + " повторяется " + map.get(key) + " раза");
            }
            return true;
        }
    }
}
