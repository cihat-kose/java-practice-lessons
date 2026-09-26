# Java Practice Lessons

Bu depo, Java temellerini ve nesne yönelimli programlama kavramlarını küçük
konsol örnekleriyle çalışmak için hazırlanmıştır. Örnekler öğrenme amacıyla
bağımsız tutulur; production uygulaması olarak konumlandırılmamıştır.

## Gereksinimler

- Java 17 veya daha yeni bir JDK
- Maven 3.8 veya daha yeni bir sürüm

Kod UTF-8 ile derlenir ve Java 17 bytecode hedeflenir. Kaynaklarda Java 14 ile
gelen switch expression/switch rule sözdizimi kullanıldığı için Java 17 veya
daha yeni bir JDK gerekir.

## Build

Temiz bir checkout sonrasında depo kökünde:

```bash
mvn clean compile
```

Testleri çalıştırmak için:

```bash
mvn test
```

Şu anda otomatik test sınıfı bulunmadığı için `mvn test` test çalıştırmadan
başarılı olur. Test altyapısı, seçilmiş hesaplama ve domain örnekleri için
JUnit testleri eklendikçe genişletilecektir.

## IntelliJ IDEA

1. `pom.xml` dosyasını IntelliJ IDEA ile açın.
2. Maven projesinin içe aktarılmasını bekleyin.
3. Çalıştırmak istediğiniz sınıfı `src` altında açın.
4. `main` metodunun yanındaki Run düğmesini kullanın.

Kullanıcı girdisi alan örnekler terminal üzerinden interaktif veri bekler.

## Öğrenme akışı

Konular `_01_` ile `_32_` arasında temel Java syntax'ından abstract class
kullanımına doğru ilerler:

- Değişkenler, veri tipleri, type casting ve String metotları
- Koşullar, switch, döngüler ve kullanıcı girdisi
- Diziler, iki boyutlu diziler ve metotlar
- ArrayList, Set, Map ve enum
- Constructor, erişim belirleyicileri ve encapsulation
- Inheritance, polymorphism, interface ve abstract class

Her konu klasörü, ilgili kavramı gösteren bağımsız örnekler içerir. Aynı sınıf
adlarının farklı konu klasörlerinde tekrar edilmesi bu eğitim düzeninin
bilinçli bir sonucudur.
