@E2Eputdel
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

  Scenario: Admin kullanicisi ile olusturulan Dean hesabini guncelleme
    Given "Admin" yetkisi ile giris yapilir Esi
    And Kayitli olan Dean hesap bilgisinin ID nosu alinir Esi
    And Dean hesabini guncellemek icin URL duzenlenir Esi
    And Dean hesabi guncellemek icin payload duzenlenir Esi
    And Dean hesabi guncellemek icin PUT Request gonderilir ve Reponse alinir Esi
    And Dean hesabi guncellemek icin Status code un 200 oldugu dogrulanir Esi
    And Guncelenen response body dogrulanir Esi

  Scenario: Kayitli bir Dean bilgisini guncellenebilmeli
    Given Database baglantisi kurulur
    And userid si vererek bir Result set olusturulur
    And kullanicinin guncellenmis bilgilerinin oldugu dogrulanir
    And Connection kesilir

  Scenario: Kayitli Dean hesabi silme
    Given "Admin" yetkisi ile giris yapilir Esi
    And Guncellenmis olan Dean hesap bilgisinin ID nosu alinir Esi
    Then Dean delete icin URL duzenlenir Esi
    When Dean delete icin Request gonderilir ve Response alinir Esi
    Then Dean delete islemi icin status code un 200 oldugu dogrulanir Esi

  Scenario: Silinen Dean bilgisinin Db'den silindigi dogrulabilmeli
    Given Database baglantisi kurulur
    When userid si vererek bir query olusturulur
    And kayitli kullanici bilgisinin olmadigi dogrulanmali
    And Connection kesilir