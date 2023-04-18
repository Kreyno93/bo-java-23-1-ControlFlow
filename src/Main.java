public class Main {
    public static void main(String[] args) {

        forLoopExample();

        forLoopExampleWithArray();

    }

    public static void forLoopExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void forLoopExampleWithArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
