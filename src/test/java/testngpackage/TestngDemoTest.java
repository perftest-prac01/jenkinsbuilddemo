package testngpackage;

import org.testng.annotations.*;

public class TestngDemoTest {

/*        @BeforeSuite
        public void test_BS(){
            System.out.println("Before Suite");
        }

        @BeforeTest
        public void test_BT(){
            System.out.println("Before Test");
        }
        @BeforeClass
        public void test_BC(){
            System.out.println("Before Class");
        }
        @BeforeMethod
        public void test_BM(){
            System.out.println("Before Method");
        } */
        @Test
        public void test_app(){
            System.out.println("Test case no 1");
        }
        @Test
        public void test_app1(){
            System.out.println("Test case no 2");
        }
        @Test
        public void test_app2(){
            System.out.println("Test case no 3");
//            Assert.fail();
        }
}
