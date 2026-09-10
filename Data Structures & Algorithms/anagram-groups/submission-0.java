    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if(strs.length == 0){
                return new ArrayList<>();
            }
            HashMap<String, List<String>> map = new HashMap<>();
            for(int i = 0; i < strs.length; i++){
                int arr[] = new int[26];
                for(int j = 0; j < strs[i].length(); j++){
                    arr[strs[i].charAt(j) - 'a']++;
                }
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < arr.length; j++){
                    str.append("#");
                    str.append(arr[j]);
                }
                String str2 = str.toString();
                if(!map.containsKey(str2)){
                    map.put(str2, new ArrayList<>());
                }
                map.get(str2).add(strs[i]);
            }
            return new ArrayList<>(map.values());

        }
    }
