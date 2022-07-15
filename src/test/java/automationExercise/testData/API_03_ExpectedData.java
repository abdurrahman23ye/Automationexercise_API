package automationExercise.testData;

import org.json.JSONObject;

import java.util.*;

public class API_03_ExpectedData {

    public static Map<String,Object> API02() {

        Map<String,Object> expectedData = new HashMap<>();
        List<String>brands=new ArrayList<>();
          brands.add("Polo");
          brands.add("H&M");
          brands.add("Madame");
          brands.add("Mast & Harbour");
          brands.add("Babyhug");
          brands.add("Allen Solly Junior");
          brands.add("Kookie Kids");
          brands.add("Biba");


        expectedData.put("brands",brands);
        expectedData.put("responseCode", 200);

    return expectedData; }


}
