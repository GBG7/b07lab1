public class Driver {
    public static void main(String[] args) {
        // Create zero polynomial
        Polynomial p = new Polynomial();
        System.out.println(p.evaluate(3));  // Should print 0

        // Define two polynomials
        double[] c1 = {6, 0, 0, 5};               // 6 + 5x^3
        Polynomial p1 = new Polynomial(c1);

        double[] c2 = {0, -2, 0, 0, -9};          // -2x - 9x^4
        Polynomial p2 = new Polynomial(c2);

        // Add them
        Polynomial s = p1.add(p2);

        // Evaluate at x = 0.1
        System.out.println("s(0.1) = " + s.evaluate(0.1));

        // Check if x = 1 is a root
        if (s.hasRoot(1)) {
            System.out.println("1 is a root of s");
        } else {
            System.out.println("1 is not a root of s");
        }
    }
}
