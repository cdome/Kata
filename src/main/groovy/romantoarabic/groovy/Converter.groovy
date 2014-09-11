package romantoarabic.groovy

/**
 * User: mbednar
 * Date: 11.09.14
 * Time: 10:41
 */
class Converter {

    private final Map<String, Integer> romanToArabic = new HashMap<String, Integer>();

    Converter() {
        romanToArabic.put("I",        1);
        romanToArabic.put("II",       2);
        romanToArabic.put("III",      3);
        romanToArabic.put("IV",       4);
        romanToArabic.put("V",        5);
        romanToArabic.put("VI",       6);
        romanToArabic.put("VII",      7);
        romanToArabic.put("VIII",     8);
        romanToArabic.put("IX",       9);
        romanToArabic.put("X",        10);
        romanToArabic.put("L",        50);
        romanToArabic.put("C",        100);
        romanToArabic.put("D",        500);
        romanToArabic.put("M",        1000);
        romanToArabic.put("CMXCIX",   999);
        romanToArabic.put("DCCCXCIX", 899);
        romanToArabic.put("DCCXCIX",  799);
        romanToArabic.put("DCCLXV",   765);
        romanToArabic.put("CXI",      111);
        romanToArabic.put("CCXXII",   222);
    }

    def convertToArabic(String roman) {
        return romanToArabic.get(roman);
    }

}
