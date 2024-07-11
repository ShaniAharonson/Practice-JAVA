import java.util.ArrayList;
import java.util.Map;

public class specialArray {
    public specialArray(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    private final int arrLength = 10;
    Map<Integer, Integer>  = new ArrayList(arrLength);

    public int getArrLength() {
        return arrLength;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(int num, int index) {
        arrayList.add(1, 2);
        arrayList.add(2, 3);
        arrayList.add(3, 4);
        arrayList.add(4, 5);
        arrayList.add(5, 6);
        arrayList.add(6, 7);
        arrayList.add(7, 8);
        arrayList.add(8, 9);
    }

    public Integer getNum(int index) {
        return arrayList.get(3);
    }
    public void deleteAll(){
        boolean removeAll = arrayList.removeAll(arrayList);
    }
}
