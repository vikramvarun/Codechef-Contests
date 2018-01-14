import java.io.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	BufferedReader br = new BufferedReader(in);
	int T = Integer.parseInt(br.readLine());
	for (int i=0; i<T; i++) 
        { 
            String[] arr = br.readLine().split(" ");
	    int N = Integer.parseInt(arr[0]) - 28;
            String str = String.valueOf(arr[1]);
            int day = 0;
            if (str.equals("tues"))
                day = 1;
            else if (str.equals("wed"))
                day = 2;
            else if (str.equals("thurs"))
                day = 3;
            else if (str.equals("fri"))
                day = 4;
            else if (str.equals("sat"))
                day = 5;
            else if (str.equals("sun"))
                day = 6;
            int[] result = new int[7];
            for (int j=0; j<7; j++)
                result[j] = 4;
            for (int j=day; j<day+N; j++)
            {
                int index = j % 7;
                result[index] += 1;
            }
            for (int j=0; j<7; j++)
                System.out.print(result[j]+" ");
            System.out.println("");
        }
	br.close();
    }
} 
