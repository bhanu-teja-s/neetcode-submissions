class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            string.append(strs.get(i).length() + "#" );
            string.append(strs.get(i));
        }
        String str = string.toString();
        return str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int n = Integer.parseInt(str.substring(i,j));

            int start = j+1;

            list.add(str.substring(start, start+n));
            
            i = start+n-1;
        }
        return list;
    }
}
