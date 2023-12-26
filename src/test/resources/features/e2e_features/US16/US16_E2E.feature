@vicedean @e2eTestleriUS16
Feature:US16 Vicedean mesajlari görebilmelidir.(E2E)

  Scenario : US16 Vice Dean in Mesaji Görebilmesi(API)
    Given Mesaj eklemek icin Post request hazirligi yapilir
    And Gonderilecek mesaj bilgileri hazirlanir
    When Mesaj eklemek icin Post request gonderilir
    Then Mesaj bolumlerini dogrulama: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

  Scenario Outline : TC01 Vice Dean mesajlari görme (UI)
    Given Vice Dean, "schoolUrl" sayfasina gider
    When Login butonuna tiklar
    Then Menü butonuna tiklar
    And Contact Get All secenegini tiklar
    And Olusturulan mesaj bilgilerini görüntüler.


    Examples:
      | name    | email             | subject | message   | date       |
      | mustafa | mustafa@gmail.com | ders    | ders basi | 2023-11-07 |


