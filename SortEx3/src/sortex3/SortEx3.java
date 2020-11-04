package sortex3;
import java.io.*;

//앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/107?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx3 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i = 1; i < 10001; i++)
		{
			while(arr[i] > 0)
			{
				sb.append(i).append('\n');
                arr[i]--;
			}
		}
		
		System.out.println(sb);
	}

}