class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {



        if(ransomNote.length()> magazine.length()){
            return false;
        }


        int[] count = new int[26];


           for (char m : magazine.toCharArray()){
                 count[m-'a']++;

           }

           for (char n : ransomNote.toCharArray()){
                if (count[n-'a'] > 0 ){
                    count[n-'a']--;
                }else {
                    return false;
                }

           }


                return true;
    }
}