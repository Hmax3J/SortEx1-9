package sortex5;
import java.io.*;

//�տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/109?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

public class SortEx5 {

	/*
	BufferedReader + charAt + ī���� ����
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