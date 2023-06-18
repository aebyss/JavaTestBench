@FunctionalInterface
public interface Integrable {
    double eval(double x);

    public static double integrate(Integrable function, double x1, double x2, int numSlices) {
        if(numSlices < 1) {
            numSlices = 1;
        }
        double delta = (x2 - x1) / numSlices;
        double start = x1 + delta / 2;
        double sum = 0;
        for(int i = 0; i < numSlices; i++) {
            sum += delta * function.eval(start + delta * i);
        }
        return sum;
    }


}
