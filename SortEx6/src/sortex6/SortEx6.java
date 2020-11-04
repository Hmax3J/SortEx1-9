package sortex6;
import java.io.*;
import java.util.*;

//�տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/110?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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