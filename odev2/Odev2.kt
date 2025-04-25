package com.example.kotlindersleri.odev2

class Odev2 {
    // Birinci resimdeki sorular
    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            /** 1. Dereceyi Fahrenheit'a dönüştürür */
            return celsius * 1.8 + 32
        }

        fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
            /** 2. Dikdörtgenin çevresini hesaplar */
            return 2 * (kenar1 + kenar2)
        }

        fun faktoriyel(sayi: Int): Long {
            /** 3. Sayının faktöriyelini hesaplar */
            if (sayi < 0) return -1 // Negatif sayılar için -1 döndür
            var sonuc: Long = 1
            for (i in 1..sayi) {
                sonuc *= i.toLong()
            }
            return sonuc
        }

        fun aHarfiSay(kelime: String): Int {
            /** 4. Kelimedeki 'a' harfi sayısını bulur (büyük/küçük harf duyarlı) */
            return kelime.lowercase().count { it == 'a' }
        }

        // İkinci resimdeki sorular
        fun icAcilarToplami(kenarSayisi: Int): Int {
            /** 1. Çokgenin iç açılar toplamını hesaplar */
            return (kenarSayisi - 2) * 180
        }

        fun maasHesapla(gunSayisi: Int): Int {
            /** 2. Gün sayısına göre maaş hesaplar */
            val toplamSaat = gunSayisi * 8
            val normalSaat = if (toplamSaat <= 160) toplamSaat else 160
            val mesaiSaat = if (toplamSaat > 160) toplamSaat - 160 else 0
            return normalSaat * 10 + mesaiSaat * 20
        }

        fun kotaUcreti(kotaMiktari: Int): Int {
            /** 3. Kota miktarına göre ücret hesaplar */
            val temelUcret = 100
            val asimMiktari = if (kotaMiktari > 50) kotaMiktari - 50 else 0
            return temelUcret + asimMiktari * 4
        }
    }
}