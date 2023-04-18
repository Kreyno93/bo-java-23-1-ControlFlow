public class Main {
    public static void main(String[] args) {

        whileExample();

        whileWithArray();
    }

    public static void whileExample() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void whileWithArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
}
