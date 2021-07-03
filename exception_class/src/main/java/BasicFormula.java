public class BasicFormula {

    public static void main(String[] args) {
        divideNumbers(5, 0);
        System.out.println("program continued");

        int test = 5 / 0;
        System.out.println("this will not print");
    }

    public static int divideNumbers(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException error) {
            System.out.println("this is an exception");
            return 0;
        }
    }
}
