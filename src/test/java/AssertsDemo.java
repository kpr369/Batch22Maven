import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsDemo {

    @Test
    public void test()
    {

        SoftAssert sa = new SoftAssert();

        sa.assertEquals("google","Google","Title is not matching");
        sa.assertTrue(true);
        sa.assertFalse(false);
        System.out.println("Hello");
        sa.assertAll();
    }

    @Test
    public void test1()
    {

        System.out.println(58/0);
    }
}
