package sortex9;
import java.io.*;
import java.util.*;

//�տ� ���� ���� ��κа� ���� �ϰ� �ִ� ���� ������ https://st-lab.tistory.com/113?category=857114 ���� ���� �߽��ϴ�. 
//�Ƿ��� ���� ���� �̼��Ͽ� �ҽ��ڵ带 ���� ������� ���غ����� �Ƿ��� Ű��ڿ� ������� �� �� �����Դϴ�.

public class SortEx9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
 
		// �ԷµǴ� ������ ���� : 1 ~ 200
		StringBuilder[] p = new StringBuilder[201];
		
		//��ü�迭�� �ε����� �� StringBuilder ��ü�� �������ش�.
		for(int i = 0; i < p.length; i++) 
		{
			p[i] = new StringBuilder();
		}
		
		for(int i = 0; i < N; i++) 
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			// ī���� ���� : ���̸� index �� �Ͽ� �ش� �迭�� ���̿� �̸��� append() �Ѵ�
			p[age].append(age).append(' ').append(name).append('\n');
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder val : p) 
		{
			sb.append(val);
		}
        
		System.out.println(sb);

	}

}