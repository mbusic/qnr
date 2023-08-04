package org.example.realLifeExample;

public class RealLifeExample {

    public static void main(String[] args) {

        BinaryCalculator calculator = new BinaryCalculator();

        // Napunimo kalkulator operandima, i onda mu kažemo "calculate", s tim da u pozivu
        // metode calculate pošaljemo operaciju koju treba izvršiti.
        calculator.setOperandA(10);
        calculator.setOperandB(20);
        System.out.println(calculator.calculate(new Operation() {
            @Override public double calculate(double operandA, double operandB) {
                return operandA + operandB;
            }
        }));

        // Može i ovako, s nekoliko redaka više:
        calculator.setOperandA(-5);
        calculator.setOperandB(11);
        Operation ourAnonymousOperation = new Operation() {
            @Override public double calculate(double operandA, double operandB) {
                return operandA / operandB;
            }
        };
        System.out.println(calculator.calculate(ourAnonymousOperation));
    }
}
