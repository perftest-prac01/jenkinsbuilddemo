package testngpackage;

import org.testng.annotations.Test;

public class TestngSkipTest {

        @Test
        public void LoginTestValidation(){
            System.out.println("Login Passed");
        }
        @Test
        public void LogoutTestValidation(){
            System.out.println("Logout Passed");
//            Assert.fail();
        }
        @Test
        public void AddCustomer(){
            System.out.println("Customer Added");
        }
        @Test
        public void EditCustomer(){
            System.out.println("Customer Modified");
        }
}
