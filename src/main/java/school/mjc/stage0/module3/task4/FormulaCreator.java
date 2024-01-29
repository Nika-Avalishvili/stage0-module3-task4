package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    private double a;
    private double b;

    public double calculateFormula(double a, double b) {

        double result = (9 * a * a - 5 * b + 2 + a - 7) * ((a + b) - (4 * a * b / 2));
        return result;
    }

    public void main(String[] args) {
        // You can test your formula here if needed
        calculateFormula(a,b);
    }
}
