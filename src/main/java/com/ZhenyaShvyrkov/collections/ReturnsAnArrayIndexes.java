import java.util.Arrays;

public class ReturnsAnArrayIndexes {
    public static void main(String[] args) {
        int array[] = {1, 4, 7, 9, 15, 17};
        int Number = 24;
        int [] indexes = returnIndexes(array, Number);
    }

    static int[] returnIndexes(int[] array, int Number){
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array.length; k++){
                if (array[i] + array[k] == Number){
                    result = new int[]{i, k};
                    System.out.println("array = " + Arrays.toString(array) + ", Number = " + Number);
                    System.out.println("result = [" + i + ", " + k + "]");
                    return result;
                }
            }
        }
        return null;
    }

}
