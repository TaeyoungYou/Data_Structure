public class ArrayList<E> implements ListInterface<E>{
    private E[] numList;
    private int index;
    private final static int DEFAULT = 64;

    public ArrayList(){
        numList = (E[])new Object[DEFAULT];
        index = 0;
    }

    public ArrayList(int n){
        numList = (E[])new Object[n];
        index = 0;
    }

    @Override
    public void add(int i, E x) {
        if(i < 0 || i > index){
            System.out.println("Error");
        }else{
            for(int k = index-1;k>=i;k--){
                numList[k+1] = numList[k];
            }
            numList[i]=x;
            index++;
        }
    }

    @Override
    public void append(E x) {
        numList[index++]=x;
    }

    @Override
    public E remove(int i) {
        if(isEmpty() || i < 0 || i > index -1){
            System.out.println("Error");
            return null;
        }else{
            E returnValue = numList[i];
            for(int k=i;k<index;k++){
                numList[k]=numList[k+1];
            }
            index--;
            return returnValue;
        }
    }

    @Override
    public boolean removeItem(E x) {
        for(int i=0;i<index;i++){
            if(((Comparable)numList[i]).compareTo(x) == 0){
                for(int j=i;j<index;j++){
                    numList[j]=numList[j+1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int i) {
        return numList[i];
    }

    @Override
    public void set(int i, E x) {
        numList[i] = x;
    }

    @Override
    public int indexOf(E x) {
        for(int i=0;i<index;i++){
            if(((Comparable)numList[i]).compareTo(x) == 0){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int len() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public void clear() {
        numList = (E[]) new Object[numList.length];
        index = 0;
    }
}
