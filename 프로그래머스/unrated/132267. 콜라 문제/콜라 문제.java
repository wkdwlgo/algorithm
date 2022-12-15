class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a)
        {
            int tmp=n/a;
            int div=n%a;
            n=n-(tmp*a)+tmp*b;
            answer+=tmp*b;
        }
        return answer;
    }
}