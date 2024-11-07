Feature: Trendyol coklu urun arama test

  @Senaryo4 @All
  Scenario Outline: TC01 kullanici urun aramayı test eder
    Given kullanici Trendyola giris yapar
    Then kullanici "<arananKelime>" aratir
    Then sonucların "<dogrulananKelime>" icerdigini dogrular
    And sayfadan cikar
    Examples:
      | arananKelime | dogrulananKelime |
      | araba        | araba            |
      | kitap        | Kitap            |
      | kedi kumu    | kedi kumu        |



