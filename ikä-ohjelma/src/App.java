public class App {
    public static void main(String[] args) {
        int ika = 20;

        // Tulostusehdot
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

        // Tasavuosikymmenet (erillinen tarkistus)
        if (ika == 20) {
            System.out.println("Onnea 20-vuotispäivästä");
        } else if (ika == 30) {
            System.out.println("Onnea 30-vuotispäivästä!");
        }
    }
}