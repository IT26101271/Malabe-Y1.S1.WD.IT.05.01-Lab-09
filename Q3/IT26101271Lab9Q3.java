public class IT26101271Lab9Q3 {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int square(int n) {
        return multiply(n, n);
    }

    public static void main(String[] args) {
        // (3*4 + 5*7)^2
        int r1 = square(add(multiply(3, 4), multiply(5, 7)));

        // (4+7)^2 + (8+3)^2
        int r2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)²      : " + r1);
        System.out.println("Result of (4 + 7)² + (8 + 3)²   : " + r2);
    }
}