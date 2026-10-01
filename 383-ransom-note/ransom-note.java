class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {


        HashMap<Character, Integer>  count = new HashMap<>();

        char[] rArray = ransomNote.toCharArray();
        char[] mArray = magazine.toCharArray();

        for (char mag : mArray){
            count.put((mag), count.getOrDefault(mag, 0) + 1);
        }

        for (char ran : rArray){
            
            if (count.containsKey(ran) && count.get(ran) > 0){
                count.put(ran, count.get(ran)-1);
            }else{
                return false;
            }




        
        }
   return true;


                
    }
}