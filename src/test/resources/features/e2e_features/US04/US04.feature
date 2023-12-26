@E2Epostdel
Feature: US04 Admin Dean Ekleyebilmeli
  Scenario: Admin Dean Ekleyebilmeli
    Given Kullanıcı Managementonschools adresine gider Esi
    Then Kullanici Login butonuna basar Esi
    Then Username ve password kutularını doldurarak enter tuşuna basar Esi
    Then Açılan sayfadan menu tusuna basar Esi
    Then Dashboard kısmından Dean Management seçilir Esi
    Given Admin add Dean bolumundeki name kismina bir veri girer Esi
    Then Admin add Dean bolumundeki surname kismina bir verir girer Esi
    Then Admin add Dean bolumundeki birth place kismina bir verir girer Esi
    Then Admin add Dean bolumundeki gender kisminda cinsiyeti belirler Esi
    Then Admin add Dean bolumundeki Date of Birth kismina bir verir girer Esi
    Then Admin add Dean bolumundeki phone kismina bir verir girer Esi
    Then Admin add Dean bolumundeki Ssn kismina bir verir girer Esi
    Then Admin add Dean bolumundeki username kismina bir verir girer Esi
    Then Admin add Dean bolumundeki password kismina bir verir girer Esi
    Then Admin add Dean bolumundeki submit butonuna tıklar Esi
    Then Dean eklenebildigini dogrula Esi
    Then sayfayi kapatir Esi

  Scenario: Admin kullanicisi ile olusturulan Dean hesabini dogrulama Testi
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    And GetManagerById icin URL duzenlenir Esi
    When GetManagerById icin beklenen veriler duzenlenir Esi
    Then GetManagerById icin GET Request gonderilir ve Response body alinir Esi
    Then Dean hesabi dogrulamak icin Status code un 200 oldugu dogrulanir Esi
    And GetManagerById icin gelen Response body dogrulanir Esi

    Given Database baglantisi kurulur
    And GetManagerById icin beklenen veriler duzenlenir Esi
    When Deanlerin Name, Gender, Phone Number, SSN, User Name bilgilerini gormek icin query gonderir
    Then Olusturulan dean bilgisinin Name, Gender, Phone Number, SSN, User Name bilgilerinin kayitli oldugu dogrulanir
    And Connection kesilir

  Scenario: Kayitli Dean hesabi silme
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    Then Dean delete icin URL duzenlenir Esi
    When Dean delete icin Request gonderilir ve Response alinir Esi
    Then Dean delete islemi icin status code un 200 oldugu dogrulanir Esi
