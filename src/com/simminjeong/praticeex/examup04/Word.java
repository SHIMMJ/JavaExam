package com.simminjeong.praticeex.examup04;



public class Word {
    
    
    String[] vowel = {"a", "e", "i", "o", "u"};
 

    public static void main(String[] args) {
        
        Word w = new Word("ac");
        System.out.println(w.isNotVowel(0));
    }

    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }
    

    public boolean isNotVowel(int i) {
        for (int idx = 0; idx < vowel.length; idx++) {
            if (letters.substring(i, i + 1).equals(vowel[idx])) {
                return false;
            }
        }
        return true;
//        return "aioueAIOUE".contains(letters.substring(i, i + 1));
    }
    
}