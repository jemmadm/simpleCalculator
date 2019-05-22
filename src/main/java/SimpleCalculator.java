public class SimpleCalculator {

    double numberInMemory;

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return addition(a, -b);
    }

    public double multiplication(double a, double b) {
        double total = 0;
        double absA = Math.abs(a);
        double absB = Math.abs(b);

        for (int i = 0; i < absB; i++) {
            total += addition(absA, 0);
        }
        if (a < 0 ^ b < 0) {
            total = -total;
        }
        return total;
    }

    public int division(double a, double b) {
        int total = 0;
        int count = 0;
        double absA = Math.abs(a);
        double absB = Math.abs(b);

        while (total < absA) {
            total += addition(absB, 0);
            count++;
        }
        if (a<0 ^ b<0){
            count = -count;
        }
        return count;
    }

    public double addNumberInMemory(double number){
        numberInMemory += number;
        return numberInMemory;
    }

}