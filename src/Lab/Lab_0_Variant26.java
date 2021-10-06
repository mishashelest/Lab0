package Lab;
import java.util.Scanner;

public class Lab_0_Variant26 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//        int N , M;
//        M = in.nextInt(); // rows
//        N = in.nextInt(); // cols
//        int[][] array1 = { { 1, 1, 2 ,4}, { 3, 4, 5 ,1} };
//        for (int i = 0; i < M; i++)
//        {
//            array1[i] = new int[N];
//            for(int j = 0; j < N; j++)
//            {
//                array1[i][j] = in.nextInt();
//            }
//        }

//        matrix_array(array1,N,M);
        System.out.println(int_ger(20));
        int[] array = new int[]{2,1,2,2};
        System.out.println(minn_max(4,array));
//        for (int i = 0; i < M; i++)
//        {
//            for(int j = 0; j < N; j++)
//            {
//                System.out.print(array1[i][j] + "   ");
//            }
//            System.out.print("\n");
//        }
//        int[] array = new int[]{2,1,2,2};
//        array_1_dimensional(array);
//        System.out.println(array_1_dimensional(array));
//        System.out.println( minn_max(2623));

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

    public  static  void while_loop(int N)
    {
        int last, next;
        int f = 1, g = 1;
        while(f < N )
        {
            f = f + g;
            g = f - g;
        }
        last = g;
        next = f + g;
        System.out.println(last + "    " + next);
    }

    public  static  int minn_max(int n , int[] array)
    {
        int count1 = 0, count2 = 0;
        boolean check = false;
        for (int i = 0 ; i < n; i++ )
        {
            if ( array[i] % 2 == 0 )
            {
                check = true;
                while (check)
                {
                    count2++;
                }
                check = false;
                if(count1 < count2)
                {
                    count1 = count2;
                }
                count2 = 0;
            }
        }
        if(count1 != 0)
        {
            return count1 ;
        }
        else
        {
            return 0;
        }
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

    public  static void matrix_array(int[][] array,int N,int M)
    {
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
        System.out.println(min  + "   " + number);
    }
}
///sdfsdsddssds