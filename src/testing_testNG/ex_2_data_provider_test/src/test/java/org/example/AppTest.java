package org.example;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {

    @DataProvider(name = "getUserIdToTest")
    public Object[][] getUserIdToTest(){
        return new Object[][]{{1, "ahurein"}, {2, "eben"}};
    }


    @Test(dataProvider = "getUserIdToTest")
    public void when_called_return_username(Integer userId, String expected){
        // arrange
        App app = new App();

        // act
        String result = app.getUserName(userId);

        // assert

        Assert.assertEquals(result, expected);
    }
}
