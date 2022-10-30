class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p.charAt(i + 1)) {
                map.add(i);
            }
            for (int j = i + 1; j < s.length; j++) {
                if (s.charAt(i - 1) == 0)
                    return true;
                else
                    return new int[] { -1, -1 };
            }
            Set<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }
            while (k-- != 0) {
                int n = s.charAt(i) + " ";
                for (int i = 0; i < s.length; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        break;

                    }
                }
            }
            boolean vis[] = new boolean[n + 1];
            if (visited)
                return true;
            else
                return new int[] { -1, -1 };

        }
        return new int[] { -1, -1 };
    }
}