@regression
Feature: Kullanici amazonda urun aratir

  Scenario: Scenario: kullanici arama sonuclari

    Given kullanici "amazonUrl" anasayfaya gider
    When amazonda "iphone 14 pro" icin arama yapar
    And 3 saniye bekler
    Then urun isminin "iphone 14 pro" icerdigini test eder

    And sayfayi kapatir