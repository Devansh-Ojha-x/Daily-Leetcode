class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
       // int scount[]=new int[26];
        int pcount[]=new int[26];

        int n=s.length();
        int k=p.length();


        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
        }

        for(int i=0;i<=n-k;i++){
            int scount[]=new int[26];

            for(int j=i;j<i+k;j++){
                 scount[s.charAt(j)-'a']++;
                }
                if(Arrays.equals(scount,pcount)){
                    res.add(i);
                }
        }
        return res;
    }
}