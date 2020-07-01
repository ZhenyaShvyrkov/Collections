import java.util.Arrays;

public class MyCollection<Integer> {
    private int array[];
    private int size = 0;
    private int capacity = 0;
    private int[] newArray;
    public MyCollection() {}



    public void add(int value){

        if(capacity != 0) {
            newArray = new int[++capacity];
            for (int i = 0; i < capacity-1; i++) {
                newArray[i] = array[i];
                newArray[i] += value;
            }
            array = newArray;
            array[size] = value;
            size++;
        } else {
            array = new int[++capacity];
            array[size] = value;
            size++;
        }

    }

    public void removeByIndex(int index) {
        int passedNum = array[index];
        size--;
        int newArray[] = new int[--capacity];
        if((index == 0 && size == 0) || (index != 0 && size == 0)) System.out.println("Collection is empty");
        else if (index >= 0 && index < capacity+1) {
            for (int i = 0; i < capacity+1; i++){
                if(i < index) newArray[i] = array[i];
                else if (i > index) newArray[i-1] = array[i];
            }
            array = newArray;
        }

        for (int i = 0; i < capacity; i++) {
            array[i] -= passedNum;
        }

    }

    public void removeByValue(int value) {
        int index = 0;
        for (int i = 0; i < capacity; i++){
            if(value == array[i]){
                index = i;
                break;
            }
        }
        removeByIndex(index);
    }

    public int search(int index) {
        return array[index];
    }

    public int valueSearch(int value) {
        int index = 0;
        for (int i = 0; i < capacity; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;

    }

    public int max() {
        int max = array[0];
        newArray = array;
        for (int i = 0; i < capacity; i++) {
            if (max < newArray[i]) max = newArray[i];
        }
        return max;
    }

    public int min() {
        int min = array[0];
        newArray = array;
        for (int i = 0; i < capacity; i++) {
            if (min > newArray[i]) min = newArray[i];
        }
        return min;
    }

    public double average() {
        if (size != 0) {
            double sum = 0;
            for (int i = 0; i < capacity; i++) {
                sum += array[i];
            }
            return sum / size;
        } else return 0;
    }

    public void show(){
        for (int x : array){
            System.out.print(x + " ");
        }
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

