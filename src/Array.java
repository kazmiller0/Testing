import java.util.concurrent.ThreadLocalRandom;

public class Array {
    private int[] arr;
    private int size;

    public Array() {
        arr = new int[20];
    }

    public void extend() {
        int[] newArr = new int[size * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    public int randomAccess() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, size - 1);
        return arr[randomIndex];
    }

    public void insertItem(int item, int index) {
        if (size == arr.length) {
            extend();
        }

        if (size != 0) {
            for (int i = size - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = item;
        } else {
            arr[0] = item;
        }
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int traverse() {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public int find(int target) {
        for (int i = 0; i < size; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Array arr = new Array();
        for (int i = 0; i < 20; i++) {
            arr.insertItem(i, i);
        }
        arr.insertItem(1, 0);
        arr.remove(0);
        System.out.println(arr.randomAccess());
        System.out.println(arr.traverse());
        System.out.println(arr.find(14));
    }
}
