package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void when_called_return_username(){
        // arrange
        App app = new App();

        // act
        String result = app.getUserName(1);

        // assert

        Assert.assertEquals(result, "ahurein");
    }
}
