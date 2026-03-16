class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String str= new String(ch);

            map.putIfAbsent(str,new ArrayList<String>());
            map.get(str).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
    }
}