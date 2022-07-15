package automationExercise.tests;

import automationExercise.testBase.Automation_Exercise_TestBase;
import automationExercise.testData.API_03_ExpectedData;
import automationExercise.testData.API_04_ExpectedData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_04_Put_To_All_Brands_List extends Automation_Exercise_TestBase {

    @Test
    public void test01() {

        spec01.pathParams("p1", "api", "p2", "brandsList");

        Map<String,Object> expectedData= API_04_ExpectedData.API04();


        Response rp = given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().
                put("/{p1}/{p2}");

       JsonPath js=rp.jsonPath();

       Map<String,Object> actualData=new HashMap<>();
        actualData.put("message",js.getString("message"));
        actualData.put("responseCode",js.getInt("responseCode"));




        Assert.assertEquals(expectedData.get("responseCode"),actualData.get("responseCode"));
        Assert.assertEquals(expectedData.get("message"),actualData.get("message"));




    }

}