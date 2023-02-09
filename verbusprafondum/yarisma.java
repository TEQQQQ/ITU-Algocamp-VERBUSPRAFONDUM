import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class yarisma {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String news = "";
        int size = 3;
        String[] texts = new String[size];
        for (int j = 0; j < size; j++) {
            String degisken = read.next();
            texts[j] = degisken;

        }

        for (int x = 0; x < size; x++) {
            int length = 0;
            int length2 = 0;

            char[] ch = new char[texts[x].length()];

            if (texts[x].length() % 2 == 1) {
                length = texts[x].length() / 2 + 1;
                length2 = texts[x].length() / 2;
            } else {
                length = texts[x].length() / 2;
                length2 = texts[x].length() / 2;
            }

            char[] yeni_dizi = new char[length];

            char[] yeni_dizi2 = new char[length2];

            for (int i = 0; i < texts[x].length(); i++) {

                ch[i] = texts[x].charAt(i);
            }

            for (int i = 0; i < length; i++) {

                yeni_dizi[i] = ch[i];

            }
            for (int i = 0; i < length2; i++) {

                yeni_dizi2[i] = ch[length + i];

            }

            for (int i = 0; i < length; i++) {
                news += yeni_dizi[i];
            }
            news += ",";
            for (int i = 0; i < length2; i++) {
                news += yeni_dizi2[i];
            }
            news += ",";

        }

        String[] array = null;
        String[] array2 = null;
        array = news.split(",");
        array2 = news.split(",");

        int sayac = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array2[j])) {
                    if (i != j) {
                        sayac += 1;
                    } else {

                    }

                }
            }

        }

        System.out.println(sayac);

    }
}
