import java.text.DecimalFormat;
import java.util.*;

public class GeldAutomat {


    public static void main(String[] args) {
        try {
            if (args.length != 2)
                throw new Exception("FEHLER!");
            if (args[0].equals("Euro")) {
                System.out.println("Euro-Waherung:");
                double[] munzen = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
                geldWechsel(Double.parseDouble(args[1]), munzen);

            } else if (args[0].equals("Alternative")) {
                System.out.println("Alternative wurde als Währung aushewählt");
                double[] munzen = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
                geldWechsel(Double.parseDouble(args[1]), munzen);
            } else
                throw new Exception("Geben Sie eine richtige Waherung!!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Es muss wie folgt aussehen: \n{Euro/Alternative} {Geldbetrag}.");
            System.exit(1);
        }
    }

    public static void geldWechsel(double geldBetrag, double[] munzen) {
        List<Double> list = new ArrayList<Double>();
        int i = 0;
        while (geldBetrag != 0) {
            if (i == munzen.length) break;
            if (geldBetrag - munzen[i] >= 0) {
                list.add(munzen[i]);
                geldBetrag = geldBetrag - munzen[i];
            } else {
                i++;
            }
        }

        for (int counter = 0; counter < list.size(); counter++) {
            int count = 1;
            for (int d = 1; d < list.size(); d++) {
                if (list.get(counter).equals(list.get(d))) {
                    count++;
                } else {
                    String euro = "€";
                    System.out.print(count + "x" + list.get(counter) + "Euro, " );
                    break;
                }
                counter = d;
            }
        }


    }
}