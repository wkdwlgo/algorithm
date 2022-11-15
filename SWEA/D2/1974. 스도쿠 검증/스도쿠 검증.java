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
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T;
		T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			boolean check=true;
			boolean check_Arr1[]=new boolean[10];
			boolean check_Arr2[]=new boolean[10];
			boolean check_Arr3[]=new boolean[10];
			int sudoku[][]=new int [9][9];
			sb.append("#").append(test_case).append(" ");
			for(int i=0; i<9; i++)
			{
				StringTokenizer st=new StringTokenizer(br.readLine());
				for(int j=0; j<9; j++)
				{
					sudoku[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<9; j++)
				{
					if(check_Arr1[sudoku[i][j]]==false)
					{
						check_Arr1[sudoku[i][j]]=true;
						
					}
					else
					{
						check=false;
						break;
					}
				}
				for(int k=0; k<10; k++)
				{
					check_Arr1[k]=false;
				}
			}
			if(check==true)
			{
				for(int i=0; i<9; i++)
				{
					for(int j=0; j<9; j++)
					{
						if(check_Arr2[sudoku[j][i]]==false)
						{
							check_Arr2[sudoku[j][i]]=true;
							
						}
						else
						{
							check=false;
							break;
						}
					}
					for(int k=0; k<10; k++)
					{
						check_Arr2[k]=false;
					}
			}
			}
			if(check==true)
			{
				for(int i=0; i<9; i+=3)
				{
					for(int j=0; j<9; j+=3)
					{
						for(int k=0; k<3; k++)
						{
							for(int l=0; l<3; l++)
							{
								if(check_Arr3[sudoku[i+k][j+l]]==false)
								{
									check_Arr3[sudoku[i+k][j+l]]=true;
								}
								else
								{
									check=false;
									break;
								}
							}
						}
						for(int m=0; m<10; m++)//확인배열 초기화
						{
							check_Arr3[m]=false;
						}
					}
				}
			}
			if(!check)
			sb.append("0").append("\n");
			else
			sb.append("1").append("\n");
		
		
	}
		System.out.println(sb);
}
}
