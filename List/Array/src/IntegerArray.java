public class IntegerArray implements IntegerArrayInterface{
    private Integer[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;
    public IntegerArray(){
        item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }
    public IntegerArray(int n){
        item = new Integer[n];
        numItems = 0;
    }

    @Override
    public void add(int i, Integer x) {
        if(numItems >= item.length || i < 0 || i > numItems){
            System.out.println("Error");
        }else{
            for(int k = numItems-1;k>=i;k--){
                item[k+1] = item[k];
            }
            item[i]=x;
            numItems++;
        }
    }

    @Override
    public void append(Integer x) {
        if(numItems >= item.length){
            System.out.println("Error");
        }else{
            item[numItems++]=x;
        }
    }

    @Override
    public Integer remove(int i) {
        if(isEmpty()||i < 0 || i > numItems -1 ){
            return null;
        }else{
            Integer tmp = item[i];
            for(int k=i;k<numItems;k++){
                item[k]=item[k+1];
            }
            numItems--;
            return tmp;
        }
    }

    @Override
    public boolean removeItem(Integer x) {
        int k = 0;
        while(k < numItems && item[k].compareTo(x) != 0){
            k++;
        }
        if(k==numItems)
            return false;
        else{
            for(int i=k;i<numItems;i++){
                item[i]=item[i+1];
            }
            numItems--;
            return true;
        }
    }

    @Override
    public Integer get(int i) {
        return item[i];
    }

    @Override
    public void set(int i, Integer x) {
        item[i] = x;
    }

    private final int NOT_FOUND = -12345;
    @Override
    public int indexOf(Integer x) {
        for(int i = 0;i<numItems;i++){
            if(item[i].compareTo(x) == 0){
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public int len() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        if(numItems == 0)
            return true;
        return false;
    }

    @Override
    public void clear() {
        item = new Integer[item.length];
        numItems=0;
    }
}
