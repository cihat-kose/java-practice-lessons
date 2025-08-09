package _12_SwitchCase;

import java.util.Scanner;

/**
 * Görev: (Switch Case ile)
 * Kullanıcıdan bir harf alın ve bu harfin Türk alfabesine göre sesli mi yoksa sessiz mi olduğunu belirleyin.
 * - Sesli harfler: a, e, ı, i, o, ö, u, ü
 * - Diğer tüm harfler: sessiz harf
 * Not: Geçersiz karakterler kontrol edilmemiştir.
 *
 * Türk alfabesindeki bir harfin sesli mi sessiz mi olduğunu
 * {@code switch} ifadesiyle belirler.
 */
public class _03_VowelChecker {
    public static void main(String[] args) {
        try (Scanner tarayici = new Scanner(System.in)) {
            System.out.print("Bir harf girin: ");
            char harf = tarayici.next().toLowerCase().charAt(0);

            switch (harf) {
                case 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü' ->
                        System.out.println("Sesli harf");
                default ->
                        System.out.println("Sessiz harf");
            }
        }
    }
}
