class Solution {
    public char nonRepeatingChar(String s) {
        // code here
      Map<Character,Integer> sp=new HashMap();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sp.put(ch,sp.getOrDefault(ch,0)+1);
            
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(sp.get(ch)==1){
                return ch;
            }
        }
        return '$';
        
    }
}
