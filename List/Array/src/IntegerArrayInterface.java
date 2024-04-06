public interface IntegerArrayInterface {
    public void add(int i, Integer x);      // i번째 자리에 원소 x 삽입
    public void append(Integer x);          // 맨 뒤에 원소 추가
    public Integer remove(int i);           // i번째 원소 삭제
    public boolean removeItem(Integer x);   // 원소 x 삭제
    public Integer get(int i);              // i번째 원소 반환
    public void set(int i, Integer x);      // i번째 원소 x로 대체
    public int indexOf(Integer x);          // x원소 인덱스 반환
    public int len();                       // 총 원소 개수
    public boolean isEmpty();               // 비었는지 확인
    public void clear();                    // 비우기
}
