public class Main {
    public static void main(String[] args) {

        // CASTING //
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        // whereas manual casting you use paranthesis
        int age = 55;
        double exactAge = (double) age;

        // ARITHMATIC OPERATORS //
        int x = 1;
        int y = 2;

        // Addition
        int z = x + y; // 2

        // Subtraction
        int w = x - y; // 0

        // Division
        int v = x / y; // 1

        // Multiplication
        int u = x * y; // 1

        // Modulus - returns remainder
        int t = x % y; // 0

        // Indcrement and Decrement
        x++; // 2
        y--; // 0

        System.out.println(exactAge + z + w + v + u + t);

        // The COMPARITIVE OPERATORS are the same as in python
        // (==, !=, >, <, <=, >=)

        // LOGICAL OPERATORS (&&, ||, !)
        // which mean (and, or, not)

        // Java has a huge number of ASSIGNMENT OPERATORS
        // Most are similar to most languages (+=, -=, *=, /=, %=) EXCEPT
        // BITWISE OPERATORS:
        // OR
        int lemon = 5;
        lemon |= 3;
        System.out.println(lemon);

        // AND
        int potato = 7;
        potato &= 3;
        System.out.println(potato);

        // Binary Shift left
        int grammar = 8;
        grammar <<= 3;
        System.out.println(grammar);

        // and right
        grammar >>= 3;
        System.out.println(grammar);

        /*
         * These all deal with the binary form of that interger / value
         * for example the OR Assignment Operator looks at the binary
         * code of that value and compares it with the binary
         * code of the other operand and if in each column if either value is 1
         * a 1 is stored in that column it does this for each column. Eg:
         * 
         * Bitwise OR Operation of 5 and 7
         * 0101
         * | 0111
         * ________
         * 0111 = 7 (In decimal)
         */
    }
}