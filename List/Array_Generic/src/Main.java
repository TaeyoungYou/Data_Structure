public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0,300);
        list.add(0,200);
        list.add(0,100);
        printAll(list);

        list.append(500);
        list.append(600);
        printAll(list);

        list.remove(3);
        printAll(list);

        list.add(3,250);
        list.add(1,50);
        list.add(0,10);
        printAll(list);

        list.append(700);
        printAll(list);

        list.remove(1);
        list.removeItem(600);
        printAll(list);
    }
    public static void printAll(ArrayList x){
        for(int i=0;i<x.len();i++){
            System.out.print(x.get(i)+" ");
        }
        System.out.println();
    }
}
