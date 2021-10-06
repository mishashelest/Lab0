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
    public void forTest(int number , float length, float check)
    {
        assertEquals(new Lab_0_Variant26().case_stat(number,length) , check);
    }

    @DataProvider
    public Object[][] forProvider()
    {
        return new Object[][] {{2,2,2000},{1,300,30}};
    }

}
