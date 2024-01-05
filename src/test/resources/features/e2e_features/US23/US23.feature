@E2EKI23

Feature: US23
  Scenario: Admin Vice Dean ekleyebilmeli
    Given Kullanıcı Managementonschools adresine giderKI
    Then Kullanici Login butonuna basarKI
    Then Kullanici Login butonuna basarKI
    And Kullanici Username ve Password girerKI
    And Admin sayfasinda Menu butonuna tiklarKI
    Then Vice Dean secilirKI
    And DeanName kutusuna "Ahmet" girerKI
    And DeanSurName kutusuna "Agayev" girerKI
    And DeanBirthPlace kutusuna "Baku" girerKI
    And DeanGender "MALE" secenegini girerKI
    And DeanDateOfBirth kutusuna "05021996" girerKI
    And DeanPhone kutusuna "524-965-2026" girerKI
    And DeanSSN kutusuna "545-85-2026" girerKI
    And DeanUserName kutusuna "AhmetGanja" girerKI
    And DeanPassword kutusuna sifre girerKI
    * 1 saniye beklerKI
    And Sayfa kapanirKI

  Scenario:Admin kullanicisinin Vice Dean hesap bilgisini alma testi
    Given Kayitli Vice Dean hesap bilgisinin ID nosu alindiKI
    And Vice Dean GetManagerById icin URL duzenlendiKI
    And Vice Dean GetManagerById icin beklenen veriler duzenlendiKI
    When Vice Dean GetManagerById icin GET Request gonderilir ve Response alindiKI
    Then Status code un 200 oldugu dogrulandiKI
    And Vice Dean GetManagerById icin gelen Response body dogrulandiKI

  Scenario: Admin kullanici olusturulan Vice Dean silme
    Given "Admin" yetkisi ile giris yapildiKI
    And Kayitli Vice Dean hesap bilgisinin ID nosu alindiKI
    Then Vice Dean silme icin URL duzenlenirKI
    When Vice Dean Delete icin Request gonderilir ve Response alindiKI
    Then Status code un 200 oldugu dogrulandiKI
