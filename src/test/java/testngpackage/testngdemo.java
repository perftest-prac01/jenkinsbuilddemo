package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngdemo {

        @Test
        public void app(){
            System.out.println("Test case no 1");
        }
        @Test
        public void app1(){
            System.out.println("Test case no 2");
        }
        @Test
        public void app2(){
            System.out.println("Test case no 3");
            Assert.fail();
        }
}
