Feature: Trendyol kategori secim testi

  @Senaryo8 @All
  Scenario: TC01 kullanici tum kategorilerden secim yapar
    Given kullanici Trendyol sayfasina gider
    Then tum kategoriler bolumunden supermarket secenegini secer
    Then acilan bolumden bebek dis fircasi secenegini secer
    Then gelen sonucların "Bebek Diş Fırçası" icerdigini dogrular
    Then tum kategoriler bolumunden kadin secenegini secer
    Then acilan bolumden omuz cantasi secenegini secer
    Then gelen sonucların "Omuz Çantası" icerdigini dogrular
    And sayfayi kapatir