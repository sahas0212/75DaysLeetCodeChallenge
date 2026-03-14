class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
         return false;
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);
        int n=s.length();
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
             char ch=s.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++)
        {
            char ch=t.charAt(i);
            if(!hash.containsKey(ch) || hash.get(ch)==0)
             return false;
        
        hash.put(ch,hash.get(ch)-1);
    }
    return true;
    }
}