Feature: Trendyol sipariş ozeti goruntuleme testi

  @Senaryo9 @All
    Scenario: TC01 kullanici sepet sayfasında siparis ozetini goruntuler
    Given kullanici Trendyol sayfasina gider
    Then "oje" kelimesini aratir
    Then ilk siradaki urunu sepete ekler
    Then kullanici "kedi kumu" kelimesini aratir
    Then ilk siradaki urunu sepete ekler
    Then sepete tiklanarak eklenen urunler kontrol eder
    Then siparis ozetinin gorundugunu dogrular
    Then sepetteki urunlerin fiyatını toplar
    Then toplamın siparis ozetiyle ayni oldugunu dogrular
    And sayfayi kapatir