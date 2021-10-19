package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import Lab.Lab_0_Variant26;
public class Test_Lab_0_Variant26
{
    @Test(dataProvider = "inputProvider")
    public void inputTest(int N , int check)
    {
        assertEquals(new Lab_0_Variant26().int_ger(N),check);
    }

    @DataProvider
    public Object[][] inputProvider()
    {
        return new Object[][] {{9,3},{11,5}};
    }

    @Test(dataProvider = "boolProvider")
    public void boolTest(int x , int y, boolean check)
    {
        assertEquals(new Lab_0_Variant26().bool_check( x , y), check);
    }

    @DataProvider
    public Object[][] boolProvider()
    {
        return new Object[][] {{9,-3,true},{11,5, false}};
    }

    @Test(dataProvider = "ifProvider")
    public void iFTest(float x, float check)
    {
        assertEquals(new Lab_0_Variant26().if_stat(x) , check);
    }

    @DataProvider
    public Object[][] ifProvider()
    {
        return new Object[][] {{-5,5},{2,4}};
    }

    @Test(dataProvider = "caseProvider")
    public void CaSeTest(int number , float length, float check)
    {
        assertEquals(new Lab_0_Variant26().case_stat(number,length) , check);
    }

    @DataProvider
    public Object[][] caseProvider()
    {
        return new Object[][] {{2,2,2000},{1,300,30}};
    }

    @Test(dataProvider = "forProvider")
    public void forTest(float x , int N, float check)
    {
        assertEquals(new Lab_0_Variant26().for_loop(x ,N), check);
    }

    @DataProvider
    public Object[][] forProvider()
    {
        return new Object[][] {{2,2,19.2F}};
    }

    @Test(dataProvider = "WhileProvider")
    public void WhileTest(int N, int[] check )
    {
        assertEquals(new Lab_0_Variant26().while_loop(N), check);
    }

    @DataProvider
    public Object[][] WhileProvider()
    {
        return new Object[][] {{13,new int[]{8,21}}};
    }

    @Test(dataProvider = "MinProvider")
    public void MinTest(int n ,int[] array, float check)
    {
        assertEquals(new Lab_0_Variant26().minn_max(n,array), check);
    }

    @DataProvider
    public Object[][] MinProvider()
    {
        return new Object[][] {{ 5 , new int[]{2,2,2,1,2} , 3}};
    }

    @Test(dataProvider = "ArrayProvider")
    public void ArrayTest(int[] array, float check)
    {
        assertEquals(new Lab_0_Variant26().array_1_dimensional(array), check);
    }

    @DataProvider
    public Object[][] ArrayProvider()
    {
        return new Object[][] {{ new int[]{2,1,2,2,2} , 4}};
    }

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] array,int N, int M, int[] check)
    {
        assertEquals(new Lab_0_Variant26().matrix_array(array,N,M), check);
    }

    @DataProvider
    public Object[][] matrixProvider()
    {
        int[][] array = {{1, 2, 3},
                {6, 2, 5},
                {4, 2, 7}
                };
        int[] check = {8,2};

        return new Object[][] {{array,3,3,check} };

    }

}
