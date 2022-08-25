package com.qa.tests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.CustKYCPojo;
import com.qa.DeviceDetailsPojo;
import org.testng.annotations.Test;

public class SerDesWithGson {

    @Test (enabled = true)
    public void SerialisedCust(){
        CustKYCPojo kycObj = new CustKYCPojo();
        DeviceDetailsPojo deviceObj = new DeviceDetailsPojo();
        deviceObj.setDeviceInfo("Android");
        deviceObj.setCountryIP("100.0.0.1");
        deviceObj.setIpAddress("255.255.255.0");
        deviceObj.setSessionId("1234-888");

        kycObj.setDeviceDetails(deviceObj);
        kycObj.setAccountStatus("BEGIN");
        kycObj.setDocumentCount("2");
        kycObj.setClientReferenceId("1111-2222-3333-4444");
        kycObj.setEntityType("BUSINESS");

        Gson convertToJSON = new Gson();
        String jsonObj = convertToJSON.toJson(kycObj);

        System.out.println(jsonObj); //Plain json string -- Not beautified JSON format


        Gson beautifyJSON = new GsonBuilder().setPrettyPrinting().create();
        String prettyJSON = beautifyJSON.toJson(kycObj);

        System.out.println(prettyJSON); //Formatted JSON
    }

    @Test(enabled = true)
    public void DeserialisedCust(){

        String json = "{\n" +
                "  \"clientReferenceId\": \"1111-2222-3333-4444\",\n" +
                "  \"entityType\": \"BUSINESS\",\n" +
                "  \"accountStatus\": \"BEGIN\",\n" +
                "  \"documentCount\": \"2\",\n" +
                "  \"deviceDetails\": {\n" +
                "    \"deviceInfo\": \"Android\",\n" +
                "    \"ipAddress\": \"255.255.255.0\",\n" +
                "    \"countryIP\": \"100.0.0.1\",\n" +
                "    \"sessionId\": \"1234-888\"\n" +
                "  }\n" +
                "}";

        Gson jsonToObj = new Gson();
        CustKYCPojo custObj =  jsonToObj.fromJson(json, CustKYCPojo.class);

        System.out.println("Account status --> " + custObj.getAccountStatus());

    }

}
