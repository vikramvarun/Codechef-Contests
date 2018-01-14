import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader(in);		
        int T = Integer.parseInt(br.readLine());               
        for (int i=0; i<T; i++ )
        {
            String result = "NO";
            String[] A = br.readLine().split(" ");
            int[] arr = new int[4];
            for (int j=0; j<4; j++)
                arr[j] = Integer.parseInt(A[j]);
            Arrays.sort(arr);
            if (arr[0] == arr[1] && arr[2] == arr[3])
                result = "YES";
            System.out.println(result);
        }
        br.close();
	}
} 
