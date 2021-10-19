package Lab;
import java.util.Scanner;
public class Lab_0_Variant26 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[]{2,4,1,2,2,2,2};
        System.out.println(minn_max(7,array));



    }
    public static int int_ger(int a)
    {
        return (a % 7) + 1;
    }

    public static  boolean bool_check(int x, int y)
    {
        return  (x > 0 && y < 0);
    }

    public static  float if_stat(float x)
    {
        if(x <= 0)
        {
            return  -x;
        }
        else if(x > 0 && x < 2 )
        {
            return  x * x;
        }
        else
        {
            return 4;
        }

    }

    public static  float case_stat(int number, float len_ght)
    {
        switch (number)
        {
            case 1:
                return len_ght / 10;
            case 2:
                return len_ght * 1000;
            case 3:
                return len_ght ;
            case 4:
                return len_ght / 1000;
            case 5:
                return len_ght / 100;
            default:
                return len_ght;
        }
    }

    public static float for_loop(float x,int N)
    {
        float sum = 0;
        for (int i = 0; i <= N ; i++)
        {
            sum += Math.pow((-1),N) * Math.pow(x ,(2 * N) + 1) / ((2 * N) + 1);
        }
        return  sum;
    }

    public  static  int[] while_loop(int N)
    {
        int[] arr = new int [ 2];

        int last, next;
        int f = 1, g = 1;
        while(f < N )
        {
            f = f + g;
            g = f - g;
        }
        arr[0] = g;
        arr[1] = f + g;
        return arr;
    }

    public  static  int minn_max(int n , int[] array)
    {
        int count = 0, sum = 0 ;
        for (int i = 0 ; i < n; i++ )
        {
            int j = i;
            while( j < n && array[j] % 2 == 0 )
            {
                count++;
                j++;
            }
            if(sum < count)
            {
                sum = count;
            }
            count = 0;

        }
        return sum;
    }

    public static int array_1_dimensional(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            if( ( array[i] % 2 == 0 && array[i + 1] % 2 == 0 ) || ( array[i] % 2 != 0 && array[i + 1] % 2 != 0 ))
            {
                return i + 2;
            }
        }
        return 0;
    }

    public  static int[] matrix_array(int[][] array,int N,int M)
    {
        int[] arr = new int[2];
        int min = 9999999, number = 0, sum = 1;
        for (int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                sum *= array[j][i];
            }
            if(min > sum)
            {
                min = sum;
                number = i + 1;
            }
            sum = 1;
        }
        arr[0] = min;
        arr[1] = number;
        return  arr ;

    }
}
