@us13E2E
Feature:US13 E2E Testi

  Scenario:TC01 Vice Dean öğretmen oluşturabilmelidir.
    Given kullanici Managementon Schools sayfasina giderSA
    Then  kullanici anasayfadaki login butonuna tiklarSA
    And   kullanici user name ve password ile login olurSA
    And   kullanici Login oldugunu dogrularSA
    But   Menu butonuta tiklarSA
    And   Teacher Management sayfasina giderSA
    Given  Choose Lessons kismindan ders "JavaScript" secilirSA
    Then   Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    Teacher olustugu dogrulanirSA
    And    sayfayi kapatirSA

  Scenario: Kayitli Teacher bilgisini dogrulama testi
    Given Database baglantisi kurulurSA
    And   Teacher getSavedById icin beklenen veriler duzenlenirSA
    When Kayitli Teacher bilgisini almak icin Query gonderilirSA
    Then Kayitli Teacher bilgisi dogrulanirSA
    And  Baglanti kesilirSA

  Scenario: Olusturulan Teacher hesap bilgisini guncelleme testi.
    Given Kayitli Teacher bilgisinin ID nosu alinirSA
    And   Teacher update icin URL duzenlenirSA
    And   Teacher update icin beklenen veriler duzenlenirSA
    When  Teacher update icin PUT Request gonderilir ve Response alinirSA
    Then  Status kodun 200 oldugu dogrulanirSA
    Then  Teacher uptadete icin gelen Response dogrulanir

  Scenario: Olusturulan Teacher Silme
    Given Teacher Delete icin URL duzenlenir
    When  Teacher Delete icin DELETE Request gonderilir ve Response alinir
    Then  Status kodun 200 oldugu dogrulanirSA



