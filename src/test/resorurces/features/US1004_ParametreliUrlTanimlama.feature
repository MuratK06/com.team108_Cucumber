@regression @pr1
Feature: US1004 kullanici parametre olarak girdigi Url e gider

  Scenario: TC8 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    And 3 saniye bekler
    Then "amazonUrl" sayfasina gittigini test eder
    And sayfayi kapatir

  Scenario: TC9 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "wiseUrl" anasayfaya gider
    And 3 saniye bekler
    Then "wiseUrl" sayfasina gittigini test eder
    And sayfayi kapatir