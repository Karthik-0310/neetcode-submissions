class Solution {

    public String encode(List<String> strs) {
        

        String str = "";

        for(int i=0; i< strs.size(); i++){
            str += strs.get(i).length() + "#" + strs.get(i);
        }
        return str;
    }

    public List<String> decode(String str) {
        
        int i = 0;
        List<String> decoded_strs = new ArrayList<>();


        while(i < str.length()){
            int j = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, j));

            String substring = str.substring(j+1, j+1+len);

            decoded_strs.add(substring);

            i = j + 1 + len;
        }

       return decoded_strs; 
        
    }
}
