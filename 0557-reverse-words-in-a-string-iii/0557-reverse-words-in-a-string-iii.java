class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        for (int i = 0; i < word.length; i++) {
            char[] arr = word[i].toCharArray();
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
                word[i] = new String(arr);
            }
        }
        return String.join(" ", word);
    }
}