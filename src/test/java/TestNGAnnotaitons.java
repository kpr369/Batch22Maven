import org.testng.annotations.*;

public class TestNGAnnotaitons {

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }

    @Test
    public void test1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void test2()
    {
        System.out.println("Test 1");
    }
}
