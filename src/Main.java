public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Addition
        Calculator.Addition addition = cal.new Addition();
        int result = addition.add(5, 5);
        System.out.println("result = " + result);

        // Subtraction
        Calculator.Subtraction subtraction = cal.new Subtraction();
        int result2 = subtraction.sub(100, 20);
        System.out.println("result2 = " + result2);

        // Division
        Calculator.Division division = cal.new Division();
        int result3 = Integer.parseInt(division.div(100, 2));
        System.out.println("result3 = " + result3);

        // private Multiplication
        int res = cal.mul(5, 5);
        System.out.println("res = " + res);
    }
}
