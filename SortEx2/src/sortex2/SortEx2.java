package sortex2;
import java.io.*;

//�տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/106?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

public class SortEx2 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] arr = new boolean[2000001];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			arr[Integer.parseInt(br.readLine()) + 1000000 ] = true;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i])
			{
				sb.append((i - 1000000)).append('\n');
			}
		}
		
		System.out.println(sb);

	}

}