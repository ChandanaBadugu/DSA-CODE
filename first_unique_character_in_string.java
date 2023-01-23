class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> store= new HashMap<Character, Integer>();

        for(char c:s.toCharArray()){
             if (store.containsKey(c)) {

                store.put(c, store.get(c) + 1);
            }
            else {
                store.put(c, 1);
            }
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(store.get(s.charAt(i))==1) {
                return i;}
        }
        return -1;

        

        
        
    }
}