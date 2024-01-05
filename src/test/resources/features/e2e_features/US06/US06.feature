@E2EKI06
  Feature: US06
    Scenario: Dean Vice Dean ekleyebilmeli
      Given Kullanıcı Managementonschools adresine giderKI
      Then Kullanici Login butonuna basarKI
      Then Kullanici Login butonuna basarKI
      And Kullanici username ve password girerKI
      And DeanName kutusuna "Ahmet" girerKI
      And DeanSurName kutusuna "Agayev" girerKI
      And DeanBirthPlace kutusuna "Baku" girerKI
      And DeanGender "MALE" secenegini girerKI
      And DeanDateOfBirth kutusuna "05021996" girerKI
      And DeanPhone kutusuna "524-965-2004" girerKI
      And DeanSSN kutusuna "545-85-2004" girerKI
      And DeanUserName kutusuna "AhmetBaka" girerKI
      And DeanPassword kutusuna sifre girerKI
      * 1 saniye beklerKI
      Then Submit butonuna tiklanirKI
      Then Vice Dean islemi basariyla tamamlanirKI
      And Sayfa kapanirKI

    Scenario: Olusturlan Vice Dean hesap bilgisini alma testi
      Given "Dean" yetkisi ile giris yapilirKI
      Then Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
      And Vice Dean GetManagerById icin URL duzenlenirKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlenirKI
      When Vice Dean GetManagerById icin GET Request gonderilir ve Response alinirKI
      Then Status code un 200 oldugu dogrulanirKI
      And Vice Dean GetManagerById icin gelen Response body dogrulanirKI

    Scenario: Kayitli Vice Dean bilgisi dogrulanirKI
      Given Database baglantisi kurulurKI
      And Vice Dean GetManagerById icin beklenen veriler duzenlenirKI
      When Kayitli Vice Dean almak icni Query gonderilirKI
      Then Kayitli Vice Dean bilgisi dogrulanirKI
      And Baglanti kesilirKI

    Scenario: Olusturulan Vice Dean hesap bilgisini silme
      Given "Dean" yetkisi ile giris yapilirKI
      And Kayitli Vice Dean hesab bilgisinin ID nosu alinirKI
      Then Vice Dean delete icin URL duzenlenirKI
      When Vice Dean delete icin Request gonderilir ve Response alinirKI
      Then Status code un 200 oldugu dogrulanirKI



