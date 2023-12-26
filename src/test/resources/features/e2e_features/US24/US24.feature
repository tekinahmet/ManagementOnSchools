Feature: US24
  Background: Managementon Schools sayfasinda Admin olarak login olup Teacher Management sayfasina gidilir
    Given kullanici Managementon Schools sayfasina giderSA
    Then  kullanici anasayfadaki login butonuna tiklarSA
    And   kullanici user name ve password ile Admin olarak login olurSA
    And   kullanici Login oldugunu dogrularSA
    But   Menu butonuta tiklarSA
    And   Admin olarak Teacher Management sayfasina giderSA
  @us13
  Scenario:TC01 Vice Dean öğretmen oluşturabilmelidir.
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    Teacher olustugu dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC02 "Name"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Name bos birakilir ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC03 "Surname"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Surname bos birakilir , Name,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC04 "Birth Place"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Birth Place bos birakilir , Name,Surname,E-mail,Phone Number,Date of Birth,SSN,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC05 "E-mail"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   E-mail bos birakilir , Name,Surname,Birth Place,Phone Number,Date of Birth,SSN,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC06 "Phone Number"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Phone Number bos birakilir , Name,Surname,Birth Place,E-mail,Date of Birth,SSN,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC07 "Gender"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Name ,Surname ,Birth Place ,E-mail ,Phone Number ,Date of Birth ,SSN ,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    And    Submit butonuna tiklanirSA
    And    Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC08 "Date of Birth"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Date of Birth bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,SSN,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC09 "SSN"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   SSN bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,User Name,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC010 "User Name"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   User Name bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,Password girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Required" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC11 "Password"  kismi bos birakilarak öğretmen oluşturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Enter your password" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC12 SSN 3. ve 5. rakamdan sonra "-" içermediginde teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   SSN bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,User Name,Password girilirSA
    And    3. ve 5. rakamdan sonra '-' içermeyen bir SSN girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    SSN 3. ve 5. rakamdan sonra '-' içermedigi dogrulanirSA
    And    "Minimum 11 character (XXX-XX-XXXX)" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC13 SSN 8 rakam oldugunda teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   SSN bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,User Name,Password girilirSA
    And    8 rakamdan olusan bir SSN girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "Minimum 11 character (XXX-XX-XXXX)" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC14 SSN 10 rakam oldugunda teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   SSN bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,User Name,Password girilirSA
    And    10 rakamdan olusan bir SSN girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC15 Password 7 karakterden oldugunda teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA
    And    7 karakterden olusan bir password girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "At least 8 characters" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC16 Password büyük harf icermediginde teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA
    And    "Buyuk harf" icermeyen bir password girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "One uppercase character" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC17 Password kucuk harf icermediginde teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA
    And    "Kucuk harf" icermeyen bir password girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "One lowercase character" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA
  @us13
  Scenario:TC18 Password karakter icermediginde teacher olusturulamamalidir
    Given  Choose Lessons kismindan ders "Java" secilirSA
    Then   Password bos birakilir, Name,Surname,Birth Place,E-mail,Phone Number,Date of Birth,SSN,User Name girilirSA
    And    "Rakam" icermeyen bir password girilir
    And    is Advisor Teacher secenegi secilirSA
    Then   Cinsiyet secilirSA
    And    Submit butonuna tiklanirSA
    And    "One number" yazisi gorulerek Teacher olusmadigi dogrulanirSA
    And    sayfayi kapatirSA







