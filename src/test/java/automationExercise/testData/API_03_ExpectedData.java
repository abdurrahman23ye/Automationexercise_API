package automationExercise.testData;

import org.json.JSONObject;

import java.util.*;

public class API_03_ExpectedData {

    public static JSONObject API02() {

        JSONObject expectedData = new JSONObject();
        List<String>brands=new ArrayList<>();
        brands.add("polo");
        brands.add("H&M");
        brands.add("Mast & Harbour");
        brands.add("Babyhug");


        expectedData.put("brands",brands);
        expectedData.put("responseCode", 200);

    return expectedData; }


}
