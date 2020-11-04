package sortex1;
import java.io.*;

// �տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/105?category=857114 ���� ���� �߽��ϴ�. 
// �Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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