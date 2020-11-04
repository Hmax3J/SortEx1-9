package sortex8;
import java.io.*;
import java.util.*;

//앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/112?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx8 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
 
		String[] arr = new String[N];
 
		for (int i = 0; i < N; i++) 
		{
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() 
		{
			public int compare(String s1, String s2) 
			{
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) 
				{
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else 
				{
					return s1.length() - s2.length();
				}
			}
		});
 
		StringBuilder sb = new StringBuilder();
 
		sb.append(arr[0]).append('\n');
		
		for (int i = 1; i < N; i++) 
		{
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) 
			{
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

}