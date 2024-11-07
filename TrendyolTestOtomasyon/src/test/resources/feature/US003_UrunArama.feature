Feature: Trendyol urun arama test

  @Senaryo3 @All
  Scenario: TC01 kullanici urun aratır
    Given kullanici Trendyol sayfasina gider
    Then "araba" kelimesini aratir
    Then sonuclarin "araba" icerdigini test eder
    And sayfayi kapatir

  @Senaryo3 @All
  Scenario: TC02 kullanici urun aratir
    Then kullanici Trendyol sayfasina gider
    Then "kitap" kelimesini aratir
    Then sonuclarin "Kitap" icerdigini test eder
    Then "bilgisayar" kelimesini aratir
    Then sonuclarin "bilgisayar" icerdigini test eder
    And sayfayi kapatir