public class MethodExercise {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        int result = multiply(5, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + result);
    }
}