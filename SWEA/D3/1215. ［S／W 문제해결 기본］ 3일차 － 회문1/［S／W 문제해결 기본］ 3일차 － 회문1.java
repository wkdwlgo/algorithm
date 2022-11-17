/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.lang.*;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb= new StringBuilder();
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
			int count=0;
			int len=Integer.parseInt(br.readLine());
			char arr[][]=new char[8][8];
			for(int i=0; i<8; ++i) {
				String line = br.readLine();
				for(int j=0; j<8; ++j) {
					arr[i][j]=line.charAt(j);
					// 2-1. 가로 탐색
					if(j>len-2) {
						if(checkPalindrome(Arrays.copyOfRange(arr[i], j-len+1, j+1)))//배열 복사 
                        {
							++count;
						}
					}
				}
				// 2-2. 세로 탐색
				if(i>len-2) {
					char[] tmp = new char[len];
					for(int j=0; j<8; ++j) {
						int t = 0;
						for(int c=i-len+1; c<i+1; ++c) {
							tmp[t++]=arr[c][j];
						}
						if(checkPalindrome(tmp)) {
							++count;
						}
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
		public static boolean checkPalindrome(char[] tmp) {
			// 3-1. 회문 길이가 2인 경우
			if(tmp.length==2) {
				if(tmp[0]==tmp[1]) {
					return true;
				}
				return false;
			}
			int half = tmp.length/2;
			// 3-2. 길이의 중간을 기준으로 회문인지 아닌지 판단
			for(int c=0; c<half; ++c) {
				if(tmp[c]!=tmp[tmp.length-1-c]) {
					return false;
				}
			}
			return true;
		}

	}
