public class Main {
    public static void main(String[] args) {
        DoubleArray array = new DoubleArray();
        array.add(0,3.14);
        array.add(0,2.14);
        array.add(0,1.14);

        printArray(array);

        array.append(5.14);
        array.append(6.14);
        array.remove(3);

        printArray(array);

        array.add(3,2.54);
        array.add(1,0.5);
        array.add(0,0.1);
        array.append(7.14);
        array.remove(1);
        array.removeItem(6.14);

        printArray(array);
    }
    public static void printArray(DoubleArray a){
        for(int i=0;i<a.len();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
    }
}
