package automationExercise.tests;

import automationExercise.testBase.Automation_Exercise_TestBase;
import automationExercise.testData.API_02_ExpectedData;
import automationExercise.testData.API_03_ExpectedData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_03_Get_All_Brands_List extends Automation_Exercise_TestBase {

    @Test
    public void test01() {

        spec01.pathParams("p1", "api", "p2", "brandsList");

        JSONObject expectedData= API_03_ExpectedData.API02();


        Response rp = given().
                contentType(ContentType.JSON).
                spec(spec01).
                when().
                get("/{p1}/{p2}");

       JsonPath actualData=rp.jsonPath();












        Assert.assertEquals(expectedData.get("responseCode"),actualData.getJsonObject("responseCode"));
        System.out.println(actualData.getList("brands.brand"));


    }

}