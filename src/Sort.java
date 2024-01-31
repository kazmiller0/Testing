public class Sort {
    public static void sort(String[] item) {
        String smallest = "";
        String temp = "";
        for (int i = 0; i < item.length; i++) {
            smallest = item[i];
            for (int j = i + 1; j < item.length; j++) {
                if (item[j].compareTo(item[i]) < 0) {
                    temp = item[i];
                    item[i] = item[j];
                    item[j] = temp;
                }
            }
        }
    }
}
