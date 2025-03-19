Java ile Şifre Doğrulama Uygulaması

--Genel Bakış--

Bu Java programı, kullanıcıdan şifre alarak belirli güvenlik kurallarına uyup uymadığını kontrol eder. Kullanıcıdan alınan şifre aşağıdaki kurallara göre doğrulanır:

-En az bir büyük harf içermeli.

-En az bir küçük harf içermeli.

-En az bir özel karakter içermeli (örneğin: !, /, # , . , & , $ vb.).

-En az bir rakam içermeli.

-En az 8 karakter uzunluğunda olmalı.

-Geçersiz karakter içermemeli.

Şifre bu kriterlere uymuyorsa kullanıcıya hatalar belirtilerek yeni bir şifre girmesi istenir.

--Fonksiyonlar--

1. checkPassword()

Bu metod, kullanıcıdan şifre alır ve yukarıdaki kurallar doğrultusunda kontrol eder. Eğer şifre kurallara uygunsa başarı mesajı verir, değilse kullanıcıya hangi kuralları ihlal ettiğini bildirerek tekrar şifre girmesini ister.

2. main(String[] args)

Programın çalışmasını başlatan ana metottur. checkPassword() fonksiyonunu çağırarak şifre doğrulama sürecini başlatır.

--Nasıl Çalışır?--

Program sizden şifre girmenizi isteyecektir. Geçerli bir şifre girene kadar şifre istemeye devam edecektir.

--Notlar--

Programda ASCII karakter kodları kullanılarak karakter türleri kontrol edilmiştir.

Scanner nesnesi kullanılarak kullanıcıdan giriş alınmaktadır.

while(true) döngüsü ile sürekli giriş alınır, ancak geçerli bir şifre girildiğinde döngü sonlanır.

--Lisans--

Bu proje MIT lisansı ile lisanslanmıştır. Dilediğiniz gibi kullanabilir ve geliştirebilirsiniz.

--Yazar--

Murat Can Sevük
