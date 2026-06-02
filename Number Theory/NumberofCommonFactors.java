class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i = Math.max(a,b); i > 0; i--){
            if(a % i==0 && b % i==0){
                count++;
            }
        }
        return count;
    }
}
