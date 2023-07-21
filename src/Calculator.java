public class Calculator {

    public int mul(int a, int b) {
        Multiplication mul = new Multiplication();
        int res = mul.mul(a, b);
        return res;
    }

    // Inner-Class Addition
    public class Addition {
        public int add(int i, int j) {
            return i + j;
        }
    }
    //Inner-Clas Subtraction

    public class Subtraction {

        public int sub(int i, int j) {
            return i - j;
        }
    }

    // Inner-Class Multiplication
    private class Multiplication {

        public int mul(int i, int j) {
            return i * j;
        }
    }

    // Inner-Class Division
    public class Division {

        public String div(int i, int j) {
            if (j == 0) {
                System.out.println("False");
                return "";
            } else {
                int result = i / j;
                return String.valueOf(result);
            }
        }
    }
}
