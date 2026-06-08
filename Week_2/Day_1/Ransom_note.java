class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(char c : ransomNote.toCharArray()){
            if(magazine.indexOf(c) == -1){
                return false;
            }
            magazine = magazine.replaceFirst(String.valueOf(c), "");
        }
        return true;
    }
}
