package automationExercise.tests;

import automationExercise.testBase.Automation_Exercise_TestBase;
import automationExercise.testData.API_02_ExpectedData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_02_Post_To_All_Products_List extends Automation_Exercise_TestBase {

    @Test
    public void test01() {

        spec01.pathParams("p1", "api", "p2", "productsList");

        Map<String,Object> expectedData= API_02_ExpectedData.API02();


        Response rp = given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().
                post("/{p1}/{p2}");

        JsonPath actualData=rp.jsonPath();


        Assert.assertEquals(expectedData.get("message"),actualData.getString("message"));
        Assert.assertEquals(expectedData.get("responseCode"),actualData.getInt("responseCode"));


    }

}