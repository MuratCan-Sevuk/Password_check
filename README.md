

# Şifre Doğrulama Programı

Bu Java programı, kullanıcıdan alınan şifrenin belirli güvenlik kurallarına uygun olup olmadığını kontrol eder. Şifre, belirli kriterleri sağlamıyorsa kullanıcıya hata mesajı gösterilir ve yeniden giriş yapılması istenir. Tüm kurallar sağlandığında şifre doğrulandı olarak kabul edilir.

## 📋 **Özellikler**

Bu program aşağıdaki şifre güvenlik kriterlerini kontrol eder:

1. **Büyük Harf**: Şifre en az bir büyük harf içermelidir (A-Z).
2. **Küçük Harf**: Şifre en az bir küçük harf içermelidir (a-z).
3. **Özel Karakter**: Şifre en az bir özel karakter içermelidir (örneğin, `!`, `@`, `#`, `$`, vb.).
4. **Rakam**: Şifre en az bir rakam içermelidir (0-9).
5. **Uzunluk**: Şifrenin uzunluğu en az 8 karakter olmalıdır.
6. **Geçersiz Karakter**: Şifrede geçersiz karakterler (harfler ve rakamlar dışında) olmamalıdır.

Program, şifreyi giren kullanıcıya sürekli olarak şifreyi doğrulamak için sorular sorar ve verilen şifreyi yukarıdaki kurallara göre kontrol eder. Eğer şifre geçerli değilse, kullanıcıya uygun hata mesajı verilir ve yeniden şifre girilmesi istenir. Şifre kuralları sağlandığında, kullanıcıya "Şifre başarıyla doğrulandı!" mesajı verilir ve program sonlanır.

4. Kullanıcıdan şifre girmesi istenecektir. Program, şifrenin geçerli olup olmadığını kontrol eder ve geçerli bir şifre girilene kadar devam eder.


## ⚙️ **Kullanılan Teknolojiler**

* Java (JDK 8+)


