class Solution {
    public long[] sumOfThree(long num) {
         if (num % 3 == 0) {
            long midd = num / 3;
            return new long[] {midd - 1, midd, midd + 1};
        }
        return new long[]{};
    }
}