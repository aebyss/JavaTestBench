public class NumIntegrationTest {

    public static void main(String[] args) {
        integrationOutput(x -> x * x, 1, 5, "f(x) = x * x");
        integrationOutput(x -> Math.sin(x) + 1, 0, Math.PI, "f(x)=sin(x)+1");
        integrationOutput(x -> Math.pow(x, 3), 0, 5, "f(x) = x^3");
    }

    public static String integrationTest(Integrable fct, double x1, double x2) {
        String output = "";
        for(int i = 1; i < 7; i++) {
            int nSlices = (int) Math.pow(10, i);
            double result = Integrable.integrate(fct, x1, x2, nSlices);
            output = output + " for " + String.format("%10d", nSlices) + " slices: " + String.format("%.8f", result) + "\n";
        }
        return output;
    }

    public static void integrationOutput(Integrable function, double x1, double x2, String fun_test) {
        System.out.println("Approximated integral of " + fun_test + " from " + x1 + " to " + x2);
        System.out.println(integrationTest(function, x1, x2));
    }

}
