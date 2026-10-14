class Solution {
    List<String>  l1;
    public List<String> letterCombinations(String digits) {
        l1=new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        solve(map,"",0,digits);
        return l1;
    }
    public void solve(HashMap<Character, String> map,String s,int i,String digits)
    {
          if (i == digits.length()) {
        l1.add(s);
        return;
    }

    String letters = map.get(digits.charAt(i));

    for (int j = 0; j < letters.length(); j++) {
        char ch = letters.charAt(j);

        solve(map, s + ch, i + 1, digits);
    }
    }
}