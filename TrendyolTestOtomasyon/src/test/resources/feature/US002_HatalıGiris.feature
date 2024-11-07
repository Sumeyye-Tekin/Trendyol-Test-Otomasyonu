Feature:Trendyol giris test

  @Senaryo2 @All
  Scenario: TC02 kullanici Trendyol'a giris yapmayı test eder
    Given kullanici Trendyol sayfasina gider
    Then giris yap yazisi uzerine tiklar
    And ilk kutucuga "eposta" adresini yazar
    And goz simgesine tiklar ve sifre gorunurlugunu acar
    And ikinci kutucuga "sifre" sini yazar
    And giris yap a tiklar
    And Hata mesajini gorur
    And sayfayi kapatir

