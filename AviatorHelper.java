public class AviatorHelper {
    public static void main(String[] args) {
        calc(1.8, 1.5);

    }

    public static void calc(double coef, double zarobitok) {
        double stavka = 1;
        double suma = 1;

        while (suma < 550) {
            if (stavka * coef > suma + stavka + zarobitok) {
                suma += stavka;

                System.out.println(stavka + "  загальні витрати  " + suma);
            }else{
                stavka+=0.01;
            }

        }
    }
}
