import java.util.Scanner;

public class Main {
    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Şifre doğrulama sürekli dönecek
            System.out.println("Şifre girin:");
            String password = scanner.next();

            int uppercaseLetterCount = 0;
            int lowercaseLetterCount = 0;
            int specialCharacterCount = 0;
            int digitCount = 0;
            boolean invalidCharacterFound = false;

            // Şifre karakterlerini kontrol et
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (character >= 65 && character <= 90) uppercaseLetterCount++; // Büyük harf
                else if (character >= 97 && character <= 122) lowercaseLetterCount++; // Küçük harf
                else if (character >= 33 && character <= 47) specialCharacterCount++; // Özel karakter
                else if (character >= 48 && character <= 57) digitCount++; // Rakam
                else invalidCharacterFound = true; // Geçersiz karakter
            }

            // Geçersiz karakter kontrolü
            if (invalidCharacterFound) {
                System.out.println("Şifrede geçersiz karakter var. Lütfen tekrar deneyin.");
                continue; // Döngüyü başa al
            }

            // Şifre kurallarını kontrol et
            if (uppercaseLetterCount == 0) {
                System.out.println("Şifrenizde en az bir büyük harf olmalı.");
                continue; // Döngüyü başa al
            } else if (lowercaseLetterCount == 0) {
                System.out.println("Şifrenizde en az bir küçük harf olmalı.");
                continue; // Döngüyü başa al
            } else if (specialCharacterCount == 0) {
                System.out.println("Şifrenizde en az bir özel karakter (!, /, # , . , & , $ vb.) olmalı.");
                continue; // Döngüyü başa al
            } else if (digitCount == 0) {
                System.out.println("Şifrenizde en az bir rakam olmalı.");
                continue; // Döngüyü başa al
            } else if (password.length() < 8) {
                System.out.println("Şifre uzunluğu en az 8 basamaklı olmalı");
                continue; // Döngüyü başa al
            } else {
                System.out.println("Şifre başarıyla doğrulandı!");
                break; // Şifre doğruysa döngüyü sonlandır
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        checkPassword();
    }
}
