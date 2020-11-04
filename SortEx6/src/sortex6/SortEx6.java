package sortex6;
import java.io.*;
import java.util.*;

//앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/110?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx6 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());   
		
		int[][] arr = new int[N][2]; 
		
		for(int i = 0; i < N; i++)  
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) 
			{
				return e1[1] - e2[1];
			} 
			else 
			{
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i< N ; i++) 
		{
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
		
	}

}