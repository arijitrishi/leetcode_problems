class LCPSolution {
    public String longestCommonPrefix(String[] strs) {
   
     if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
            for (int i = 1; i < strs.length; i++) {
                        int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LCPSolution solution = new LCPSolution();
        
        String[] strs = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}