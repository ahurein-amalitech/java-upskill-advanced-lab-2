package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTestWithDataProvider {

    public int[] getUserIdToTest(){
        return new int[]{1, 2};
    }


    @Test
    public void when_called_return_username(Integer userId){
        // arrange
        App app = new App();

        // act
        String result = app.getUserName(userId);

        // assert

        Assert.assertEquals(result, "ahurein");
    }
}
