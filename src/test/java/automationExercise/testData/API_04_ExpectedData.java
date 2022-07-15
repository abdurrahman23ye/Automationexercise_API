package automationExercise.testData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class API_04_ExpectedData {

    public static Map<String,Object> API04() {

        Map<String,Object> expectedData = new HashMap<>();


        expectedData.put("message","This request method is not supported.");
        expectedData.put("responseCode", 405);

    return expectedData; }


}
