package sortex1;
import java.io.*;

// 앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/105?category=857114 에서 참고 했습니다. 
// 실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx1 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2001];
		
		for(int i = 0; i < n; i++) 
		{
			arr[Integer.parseInt(br.readLine()) + 1000] = true;
		}
		
		for(int i = 0; i < 2001; i++) 
		{
			if(arr[i]) 
			{
				sb.append(i - 1000).append('\n');
			}
		}
		System.out.println(sb);

	}

}