class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)right-(int)left+1];
        int index=0;
        for(long i=left; i<=right; i++)
        {
            long j=i/n;
            long k=i%n;
            int max=Math.max((int)j,(int)k)+1;
            answer[index]=max;
            index++;
        }
        
        return answer;
    }
}