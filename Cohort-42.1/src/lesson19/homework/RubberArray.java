package lesson19.homework;

public class RubberArray {
    private final int INIT_LIST_SiZE = 10;
    private final float ExTEND_INDEX = 1.5f;
    private int[] data;
    private int lenght;

    public RubberArray() {
        data = new int[INIT_LIST_SiZE];
        lenght = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    private void extendArrayIfNeed() {
        if (lenght == data.length) {

            int[] newData = new int[(int) (data.length * ExTEND_INDEX)];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

    }
    public void add(int value) {
        extendArrayIfNeed();
        data[lenght] = value;
        lenght++;
    }

    public void add(int value, int idx) {
        extendArrayIfNeed();
        for (int i =lenght; i != idx; i--) {
            data[i] = data[i - 1];
        }
        data[idx] = value;
        lenght++;
    }

    public void remove(int idx) {
        //move elements right to left from idx
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        lenght--;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        for (int i = 0; i < lenght; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < lenght; i++) {
            str.append(data[i]);
            if (i < lenght - 1) {
                str.append(", ");
            }
        }
        return str.append("]").toString();
    }
}
