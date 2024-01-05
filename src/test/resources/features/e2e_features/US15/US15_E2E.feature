Feature:
  Scenario: Vice Dean, ogrenci olusturebilmelidir.
    Given kullanici  Managementon Schools sayfasina gider_DB
    Then kullanici login butonuna tiklar_DB
    Then kullanici kayitli User Name ve password ile Vise Dean olarak giris yapar_DB
    Then kullanici menu butonuna tiklar_DB
    Then kullanici menu kismindan Student Management i secer_DB
    Given kullanici Choose Advisor Teacher kismindan "Jennet Bahar" secer
    Then kullanici name alanina "Durdu" girer_DB
    And kullanici surname alanina "Kaya" girer_DB
    And kullanici Birth Place alanina "Balkan" girer_DB
    And kullanci Email alanina "email" girer_DB
    And kullanici Phone Number alanina "989-321-7654" girer_DB
    And kullanici Gender alanindan "FEMALE" secenegini secer_DB
    And kullanici Birth Date alanina "2002-09-09" girer_DB
    And kullanici SSN alanina "564-67-8967" girer_DB
    And kullanici User Name alanina "durdukaya" girer_DB
    And kullanici Father Name alanina "Ali" girer_DB
    And kullanici Mother Name alanina "Ayse" girer_DB
    And kullanici Password alanina "Balkan@2002" girer_DB
    And kullanici Submit dugmesine tiklar_DB
    And kullanici Ogrenci olustugunu dogrular_DB
    And Kullanici sayfayi kapatir_DB

  Scenario: Olusturulan Student hesap bilgisini alma testi.
    Given Kayitli Student bilgisinin ID nosu alinir_DB
    And   Student getStudentById icin URL duzenlenir_DB
    And   Student getStudentById icin beklenen veriler duzenlenir_DB
    When  Student getStudentById icin GET Request gonderilir ve Response alinir_DB
    Then  Status kodun 200 oldugu dogrulanir_DB
    Then  Student getStudentById icin gelen Response dogrulanir_DB

  Scenario: Kayitli Student bilgisini dogrulama testi
    Given Database baglantisi kurulur_DB
    And   Student getStudentById icin beklenen veriler duzenlenir_DB
    When Kayitli Student bilgisini almak icin Query gonderilir_DB
    Then Kayitli Student bilgisi dogrulanir_DB
    And  Baglanti kesilir_DB