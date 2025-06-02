class PalindromeSolution {
    public boolean isPalindrome(int x) {
   if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
     int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
         return x == reversed || x == reversed / 10;
    }
  public static void main(String[] args) {
	  PalindromeSolution solution = new PalindromeSolution();
        int x = 123;
        boolean result = solution.isPalindrome(x);
        System.out.println("Output: " + result);
    }
}