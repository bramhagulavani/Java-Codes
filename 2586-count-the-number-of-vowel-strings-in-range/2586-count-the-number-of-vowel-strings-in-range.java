class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int vowelStringCount = 0;
        for (int index = left; index <= right; index++){
            String currentWord = words[index];
            if (isVowel(currentWord.charAt(0))){
                if (isVowel(currentWord.charAt(currentWord.length() - 1))){
                    vowelStringCount++;
                }
            }
        }
        return vowelStringCount;
    }
    private boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}