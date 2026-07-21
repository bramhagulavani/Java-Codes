class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowelcount=0;
        int consonant=0;
        String vowel="AEIOUaeiou";

        for(char ch: word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(vowel.indexOf(ch)!=-1){
                    vowelcount++;
                }
                else{
                    consonant++;
                }
            }
        }
        if(vowelcount>=1 && consonant >=1){
            return true;
        }
        return false;
    }
}