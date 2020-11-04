package sortex3;
import java.io.*;

//�տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/107?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

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