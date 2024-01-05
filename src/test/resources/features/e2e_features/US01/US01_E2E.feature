Feature: US01 Aday öğrenciler sisteme kayıt olabilmelidir.
#ui kismi
  Scenario: Web sitesine yeni bir kullanıcı kaydi yapma
    Given Kullanici web sitesine girer
    When Kullanici register e tiklar
    And Name kutusuna "Selim" girer
    And SurName kutusuna "Karahan" girer
    And BirthPlace kutusuna "Ankara" girer
    And PhoneNumber kutusuna "137-547-8765" girer
    And Gender secenegini girer
    And DateOfBirth kutusuna "12121996" girer
    And SSN kutusuna SSNno girer
    And UserName kutusuna "  .011Merlin" girer
    And Password kutusuna sifre girer
    And Register butonuna tiklar
    Then Kaydin yapildigi dogrulanir
    And Kullanici sayfayi kapatir_SK

    #API- Register ile oluşturulan guest user kayit listesi doğrulanır
  Scenario: Admin Guest User List bilgilerini doğrular
    Given "Admin" yetkisi ile giris yapilir_SK
    And Kayitli Guest User icin URL duzenlenir_SK
    When Kayitli Guest User icin GET Request gonderilir ve response alinir_SK
    Then GetAll icin Status kodun 200 oldugu dogrulanir_SK

   #DATABASE
  Scenario: Kayitli Guest User bilgisini dogrulama testi
    Given Database baglantisi kurulur_SK
    When Aday ogrenci bilgisini almak icin Query gonderilir_SK
    Then Aday ogrenci icin dogrulama yapar_SK
    And Baglanti kesilir_SK

  #DELETE-guest_user kaydi silinir
  Scenario: Kayitli Guest_User hesabini silme
    Given "Admin" yetkisi ile giris yapilir_SK
    And Guest User kaydi DELETE islemi icin URL duzenlenir
    When Guest User kaydi silme islemi icin DELETE Request gonderilir ve Response alinir
    Then DELETE icin Status kodun 200 oldugu dogrulanir_SK


