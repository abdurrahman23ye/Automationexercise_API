package automationExercise.tests;

import automationExercise.pojos.TestAutomationPojo;
import automationExercise.testBase.Automation_Exercise_TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API_01_Get_All_Products_List extends Automation_Exercise_TestBase {

    @Test
    public void test01(){

       spec01.pathParams("p1","api","p2","productsList");


        Response rp=given().
                contentType(ContentType.JSON).
               spec(spec01).
                when().
                get("/{p1}/{p2}");

        Assert.assertEquals(200,rp.statusCode());


    }
}
