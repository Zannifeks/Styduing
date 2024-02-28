package lesson19;

public class RubberArray {

    private final int INIT_LIST_SiZE = 3;

    private final float RESIZE_KOEF = 1.5f;

    private int[] data;
    private int lenght;

    public RubberArray() {
        data = new int[INIT_LIST_SiZE];
        lenght = 0;
    }

    public int get(int idx) {
        return data[idx];
    }

    public void add(int value) {
        if (lenght == data.length) {

            int[] newData = new int[(int) (data.length * RESIZE_KOEF)];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[lenght] = value;
        lenght++;
    }

    public void remove(int idx) {
        for (int i = idx; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        lenght--;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < lenght; i++) {
            str += String.valueOf(data[i]);
            if (i < lenght - 1) {
                str += ", ";
            }
        }
        return str + "]";
    }
}
