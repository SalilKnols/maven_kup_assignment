package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {WebApp.class})
public class unitTestWebApp {

    @Autowired
    private WebApp webApp;

    @Test
    public void test_shouldReturnExpectedString(){
        WebApp webApp1 = new WebApp();
        System.out.println(webApp1.hello());
        Assert.assertEquals("Hello, world!", webApp1.hello());
    }
}