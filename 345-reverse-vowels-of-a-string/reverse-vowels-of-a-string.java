class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        );

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while(left < right)
        {
            while(left < right && !vowels.contains(chars[left]))
            {
                left++;
            }
            while(left < right && !vowels.contains(chars[right]))
            {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }
}
