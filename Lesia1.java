import java.math.BigDecimal;
import java.util.HashMap;

public class Lesia1 {
    final static double[] price = {186.0, 268.0, 100.0, 110.0, 207.0, 156.0, 140.0, 161.0, 153.0, 185.0, 134.0, 93.0};

    public static void main(String[] args) {
        final HashMap<Double, String> decora = new HashMap<>();
        decora.put(186.0, "Austin");
        decora.put(268.0, "Diva");
        decora.put(93.0, "Enjoy");
        decora.put(110.0, "Evolution");
        decora.put(207.0, "Infinity");
        decora.put(156.0, "Jazz");
        decora.put(140.0, "Loft");
        decora.put(161.0, "Palladium");
        decora.put(153.0, "Polaris");
        decora.put(185.0, "Royal Velvet");
        decora.put(134.0, "Velluto");
        decora.put(100.0, "ENJOY");
        double chek = 1254;
        Metr(chek, price, decora);
        /*System.out.println("підгонка 1");
        Pidgonka(chek, price, decora);
        System.out.println("підгонка 2");
        Pidgonka2(chek, price, decora);
        System.out.println("підгонка 3");
        Pidgonka3(chek, price, decora);*/
        System.out.println("Підбірка по двом тканинам");
        Pidbirka(chek, price, decora);
       // System.out.println("Підбірка по трьом тканинам");
       // Pidbirka1(chek, price, decora);

    }

    public static void Metr(double sum, double[] price, HashMap<Double, String> catalog) {
        for (double v : price) {
            double res = sum / v;
            if (sum % v == 0) {
                System.out.println(res + "      Тканина " + catalog.get(v));
            }
        }
    }

    public static void Pidgonka(double sum, double[] price, HashMap<Double, String> catalog) {
        double vzirec = 40.00;
        double sumNew;
        while (vzirec <= 43) {
            sumNew = sum - vzirec;
            for (double v : price) {
                double res = sumNew / v;
                if (sumNew % v == 0) {
                    System.out.println(res + "       Тканина " + catalog.get(v) + " один взірець ціною:" + vzirec);
                }
            }
            vzirec = vzirec + 1;
        }
    }

    public static void Pidgonka2(double sum, double[] price, HashMap<Double, String> catalog) {
        double vzirec = 40.00;
        double sumNew;
        while (vzirec <= 43) {
            sumNew = sum - vzirec * 2;
            for (double v : price) {
                double res = sumNew / v;
                if (sumNew % v == 0) {
                    System.out.println(res + "        Тканина " + catalog.get(+v) + "  два взірці по " + vzirec);
                }
            }
            vzirec = vzirec + 1;
        }
    }

    public static void Pidgonka3(double sum, double[] price, HashMap<Double, String> catalog) {
        double vzirec = 40.00;
        double sumNew;
        while (vzirec <= 43) {
            sumNew = sum - vzirec * 3;
            for (double v : price) {
                double res = sumNew / v;
                if (sumNew % v == 0) {
                    System.out.println(res + "      Тканина " + catalog.get(v) + " три взірці по :" + vzirec);
                }
            }
            vzirec = vzirec + 1;
        }
    }

    public static void Pidbirka(double sum, double[] price, HashMap<Double, String> catalog) {
        System.out.println("Пробуєм підігнати по двом тканинам");
        for (double v : price) {
            double res = sum / v;
            while (res > 0) {
                double newSum = sum - (int) res * v;
                for (double value : price) {
                    double newRes = newSum / value;
                    if (newSum % value == 0 && newRes >= 1 & res >= 1) {
                        System.out.println((int) res + "     Тканина     " + catalog.get(v) + "      " + (int) newRes + "     Тканина         " + catalog.get(value));
                    }
                }
                res--;
            }
        }
    }

    public static void Pidbirka1(double sum, double[] price, HashMap<Double, String> catalog) {
        System.out.println("Пробуєм підігнати по трьом тканинам");
        for (double v : price) {
            double res = sum / v;
            while (res > 0) {
                double newSum = sum - (int) res * v;
                for (double value : price) {
                    double newRes = newSum / value;
                    while (newRes > 0) {
                        double newSumThree = newSum - (int) newRes * value;
                        for (double num : price) {
                            double newResThree = newSumThree / num;

                            if (newSumThree % num == 0 && (int) res >= 1 && (int) newRes >= 1 && (int) newResThree >= 1) {
                                System.out.println((int) res + "     Тканина     " + catalog.get(v) + "      " + (int) newRes + "     Тканина         " + catalog.get(value) +
                                        "       " + (int) newResThree + "    Тканина  " + catalog.get(num));
                            }
                        }
                        newRes--;
                    }
                }
                res--;
            }
        }
    }
}