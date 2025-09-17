public class App {
    public static void main(String[] args) {
        int ika = 50;

        // Perusehdot
        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika >= 16) {
                System.out.println("Saat ajaa kevaria");
            }

        } else if (ika >= 18 && ika < 65) {
            System.out.println("Olet aikuinen");
            if (ika == 18) {
                System.out.println("Olet täysiikäinen ja voit ajaa autoa");
            }

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        }

        // Erilliset tarkistukset
        if (ika == 65) {
            System.out.println("Hyviä eläkepäiviä");
        }

        if (ika == 58) {
            System.out.println("Voit mennä varhaiseläkkeelle");
        }

        if (ika == 100) {
            System.out.println("Onnea 100-vuotispäivästä");
        }

        // Tasavuosikymmenet
        if (ika == 20) {
            System.out.println("Onnea 20-vuotispäivästä");
        } else if (ika == 30) {
            System.out.println("Onnea 30-vuotispäivästä!");
        } else if (ika >= 40 && ika <= 50) {
            System.out.println("Hyvää keski-ikää");
        }
    }
}