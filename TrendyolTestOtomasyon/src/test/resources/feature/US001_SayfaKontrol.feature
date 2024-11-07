Feature: Trendyol sayfa kontrolleri

  @Senaryo1 @All
  Scenario: TC01 kullanici sitenin kontrollerini yapar
    Given kullanici Trendyol sayfasina gider
    Then sayfanin başliginin "Trendyol" icerdigini dogrular
    Then sayfanin URL sinin "trendyol" icerdigini dogrular
    Then sayfada Trendyol logosunun gozuktugunu dogrular
    And sayfayi kapatir
