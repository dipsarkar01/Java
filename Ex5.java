public class Ex5 {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 20;

        // Arithmetic Operators
        System.out.println("a + b + c = " + a + "+" + b + "+" + c + "=" + (a + b + c));
        System.out.println("c - a - b = " + c + "-" + a + "-" + b + "=" + (c - a - b));

        // Relational Operator
        System.out.println("a > b ? " + (a > b));

        // Logical Operator
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));

        // Assignment Operator
        a += 5;
        System.out.println("a after += 5 : " + a);

        // Increment/Decrement
        a++;
        System.out.println("a++ " + a);
        b--;
        System.out.println("b-- " + b);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}