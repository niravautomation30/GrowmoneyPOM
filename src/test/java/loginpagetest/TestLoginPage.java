/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpagetest;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
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
        Assert.assertEquals(actualtitel, "Login - Wealth Management", "Invalid Title");
    }
}