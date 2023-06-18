Feature: amazon

  Scenario: TC13 kullanici amazon sayfasina gider

    Given kullanici Amazon anasayfaya gider
    Then amazonda "apple" icin arama yapar
    And arama sonuclarinin Apple icerdigini test eder
    Then sayfayi kapatir

