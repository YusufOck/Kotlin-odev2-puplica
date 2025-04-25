package com.example.kotlindersleri.odev2

fun main() {

    println("30C = ${Odev2.celsiusToFahrenheit(30.0)} F")
    println("5x7 dikdörtgenin çevresi: ${Odev2.dikdortgenCevresi(5, 7)}")
    println("5! = ${Odev2.faktoriyel(5)}")
    println("'Ankara' kelimesindeki 'a' sayısı: ${Odev2.aHarfiSay("Ankara")}")
    println("6 kenarlı çokgenin iç açıları toplamı: ${Odev2.icAcilarToplami(6)} derece")
    println("25 günlük maaş: ${Odev2.maasHesapla(25)} ₺")
    println("70 GB kota ücreti: ${Odev2.kotaUcreti(70)} ₺")
}
