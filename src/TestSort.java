public class TestSort {
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Wrong!" + " The right item is: " + expected[i]);
            }
        }
    }

    public static void main(String[] args) {
        testSort();
    }
}
