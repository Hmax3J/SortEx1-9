package sortex5;
import java.io.*;

//앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/109?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx5 {

	/*
	BufferedReader + charAt + 카운팅 정렬
	*/
	
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] counting = new int[10];
		String s = br.readLine();
 
		for (int i = 0; i < s.length(); i++) 
		{
			counting[s.charAt(i) - '0']++;
		}
 
		for (int i = 9; i >= 0; i--) 
		{
			while (counting[i]-- > 0) 
			{
				System.out.print(i);
			}
		}

	}

}