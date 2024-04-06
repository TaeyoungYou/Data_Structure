import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntegerArray array = new IntegerArray();
        array.add(0,300);
        array.add(0,200);
        array.add(0,100);

        printArray(array);

        array.append(500);
        array.append(600);
        array.remove(3);

        printArray(array);

        array.add(3,250);
        array.add(1,50);
        array.add(0,10);
        array.append(700);
        array.remove(1);
        array.removeItem(600);

        printArray(array);
    }
    public static void printArray(IntegerArray a){
        for(int i=0;i<a.len();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
    }
}
