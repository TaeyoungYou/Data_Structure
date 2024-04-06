public class DoubleArray implements DoubleArrayInterface{
    private Double[] doubleArray;
    private int arrayIndex;
    private final static int DEFAULT = 64;

    public DoubleArray(){
        doubleArray = new Double[DEFAULT];
        arrayIndex = 0;
    }
    public DoubleArray(int index){
        doubleArray = new Double[index];
        arrayIndex = 0;
    }

    @Override
    public void add(int i, Double x) {
        if(arrayIndex >= doubleArray.length || i < 0 || i > arrayIndex){
            System.out.println("Index Error");
        }else{
            for(int k = arrayIndex-1;k>=i;k--){
                doubleArray[k+1] = doubleArray[k];
            }
            doubleArray[i] = x;
            arrayIndex++;
        }
    }

    @Override
    public void append(Double x) {
        doubleArray[arrayIndex++]=x;    // 배열의 크기가 넘었는지 확인 필요
    }

    private final static Double NO_INDEX = -1234.5;
    @Override
    public Double remove(int i) {
        if(i < 0 || i > arrayIndex-1){          // isEmpty()
            System.out.println("Index Error");
        }else{
            Double returnValue = doubleArray[i];
            for(int k=i;k<arrayIndex;k++){
                doubleArray[k]=doubleArray[k+1];
            }
            arrayIndex--;
            return returnValue;
        }
        return NO_INDEX;
    }

    @Override
    public boolean removeItem(Double x) {
        for(int i=0;i<arrayIndex;i++){
            if(doubleArray[i].compareTo(x) == 0){
                for(int j=i;j<arrayIndex-1;j++){        // -1을 없애야함, 없는 인덱스가 아니라 null을 마지막 인덱스에 넣어서 삭제 효과가 있음
                    doubleArray[j]=doubleArray[j+1];
                }
                arrayIndex--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Double get(int i) {
        if(i < 0 || i > arrayIndex){
            System.out.println("Index Error");
            return NO_INDEX;
        }else{
            return doubleArray[i];
        }
    }

    @Override
    public void set(int i, Double x) {
        if(i < 0 || i > arrayIndex){
            System.out.println("Index Error");
        }else{
            doubleArray[i] = x;
        }
    }

    private final static int NOT_FOUND = -12345;
    @Override
    public int indexOf(Double x) {
        for(int i=0;i<arrayIndex;i++){
            if(doubleArray[i].compareTo(x) == 0){
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public int len() {
        return arrayIndex;
    }

    @Override
    public boolean isEmpty() {
        return arrayIndex == 0;
    }

    @Override
    public void clear() {
        doubleArray = new Double[doubleArray.length];
        arrayIndex = 0;
    }
}
