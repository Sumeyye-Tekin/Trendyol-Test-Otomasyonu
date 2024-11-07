Feature: Trendyol aranan urun sıralama testi

  @Senaryo5 @All
  Scenario: TC01 kullanici arattigi urunu en dusuk fiyata gore siralar
    Given kullanici Trendyol sayfasina gider
    Then kullanici "kedi kumu" kelimesini aratir
    Then siralama kutucugundan en dusuk fiyat secenegini secer
    Then birinci ve onuncu urunun fiyatlarini karsilastirarak siralamayi dogrular
    And sayfayi kapatir

  @Senaryo5 @All
  Scenario: Tc02 kullanici arattigi urunu en cok degerlendirilene gore siralar
    Given kullanici Trendyol sayfasina gider
    Then kullanici "kedi kumu" kelimesini aratir
    Then siralama kutucugundan en cok degerlendirilen secenegini secer
    Then birinci ve onuncu urunun degerlendirme sayisini karsilastirarak siralamayi dogrular
    And sayfayi kapatir