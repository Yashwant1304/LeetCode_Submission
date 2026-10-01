class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] rArray = ransomNote.toCharArray();
        char[] mArray = magazine.toCharArray();

       boolean[] used = new boolean[mArray.length];
        for (int i = 0; i< rArray.length; i++){

            boolean found = false;

                for (int j = 0 ; j < mArray.length; j++){

                       if(rArray[i] == mArray[j] && !used[j]){

                        used[j] = true ;
                        found= true;
                        break;
                       }

                }

            if(!found){
                return false;
            }
        }

       return true;
                
    }
}