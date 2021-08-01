/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpagetest;

import org.testng.annotations.Test;
import base.TestBase;
import org.testng.Assert;
import pages.IndexPage;
import pages.LoginPage;


/**
 *
 * @author niravkumar2
 */
public class TestLoginPage extends TestBase{
    
    @Test
    public void testLoginPage(){
        LoginPage loginpage = homepage.clickLoginButton();
        IndexPage indexpage = loginpage.enterCredential(prop.getProperty("username"), prop.getProperty("password"));
        String actualtitel = indexpage.getTitel();  
        System.out.println("actualtitel ===="+actualtitel);
        Assert.assertEquals(actualtitel, "Login - Wealth Management111", "Invalid Title");
    }
}