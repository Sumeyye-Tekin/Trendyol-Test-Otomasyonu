Feature: Trendyol sepet testi

  @Senaryo7 @All
  Scenario: TC01 kuallanici sepete urun ekler ve sepetten ürün siler
    Given kullanici Trendyol sayfasina gider
    Then kullanici "kedi kumu" kelimesini aratir
    Then ilk siradaki urunu sepete ekler
    Then urun sayisini 2 arttirir
    Then sepete tiklanarak eklenen urunler kontrol eder
    Then urun sayisi 1 azaltir
    Then sepetteki urunleri kaldirir
    Then urunlerin sepetten kaldirildigini dogrular
    And sayfayi kapatir