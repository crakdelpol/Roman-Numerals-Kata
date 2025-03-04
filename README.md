# Roman Numerals Kata (Numeri Romani)

## Descrizione
Scrivi una funzione che converte un numero intero positivo `n` nel suo corrispondente **numero romano**.

## Requisiti
- Il programma deve supportare numeri da **1 a 3999**.
- I numeri romani seguono queste regole:
  - `I` = 1, `V` = 5, `X` = 10, `L` = 50, `C` = 100, `D` = 500, `M` = 1000.
  - Le cifre minori davanti a cifre maggiori indicano sottrazione:
    - `IV` = 4 (5 - 1), `IX` = 9 (10 - 1).
    - `XL` = 40 (50 - 10), `XC` = 90 (100 - 10).
    - `CD` = 400 (500 - 100), `CM` = 900 (1000 - 100).
  - I numeri romani sono scritti da sinistra a destra, partendo dalla cifra più grande.

## Esempi
```java
RomanNumerals.convert(1);    // ➝ "I"
RomanNumerals.convert(4);    // ➝ "IV"
RomanNumerals.convert(9);    // ➝ "IX"
RomanNumerals.convert(40);   // ➝ "XL"
RomanNumerals.convert(90);   // ➝ "XC"
RomanNumerals.convert(400);  // ➝ "CD"
RomanNumerals.convert(900);  // ➝ "CM"
RomanNumerals.convert(58);   // ➝ "LVIII"
RomanNumerals.convert(1994); // ➝ "MCMXCIV"
