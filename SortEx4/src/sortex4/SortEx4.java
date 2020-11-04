package sortex4;
import java.io.*;

//앞에 나온 예제 대부분과 지금 하고 있는 정렬 예제는 https://st-lab.tistory.com/108?category=857114 에서 참고 했습니다. 
//실력이 아직 많이 미숙하여 소스코드를 보고 재수정은 못해봤지만 실력을 키운뒤에 재수정을 해 볼 예정입니다.

public class SortEx4 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) 
		{
			int value = Integer.parseInt(br.readLine());
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) 
			{
				max = value;
			}
			
			if(min > value) 
			{
				min = value;
			}
		}
		
		// 순회 
			int count = 0;	// 중앙값 빈도 누적 수 
			int mode_max = 0; 	// 최빈값의 최댓값  
				
			// 이전의 동일한 최빈값이 1번만 등장했을경우 true, 아닐경우 false
			boolean flag = false;	 
				
			for(int i = min + 4000; i <= max + 4000; i++) 
			{
					
				if(arr[i] > 0) 
				{
						
					/*
					 * <중앙값 찾기>
					 * 누적횟수가 전체 전체 길이의 절반에 못 미친다면 
					 */
					if(count < (N + 1) / 2) 
					{
						count += arr[i];	// i값의 빈도수를 count 에 누적
						median = i - 4000;
					}
						
					/*
					 * <최빈값 찾기>
					 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우 
					 */
					if(mode_max < arr[i]) 
					{
						mode_max = arr[i];
						mode = i - 4000;
						flag = true;	// 첫 등장이므로 true 로 변경 
					}
					// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
					else if(mode_max == arr[i] && flag == true)
					{
						mode = i - 4000;
						flag = false;					
					}
				}
			}
				
			System.out.println((int)Math.round((double)sum / N));	// 산술평균 
			System.out.println(median);	// 중앙값 
			System.out.println(mode);	// 최빈값 
			System.out.println(max - min);	// 범위 

	}

}