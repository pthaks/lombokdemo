package com.qa.tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.CustKYCPojo;
import com.qa.DeviceDetailsPojo;
import org.testng.annotations.Test;

public class SerDesWithJackson {

    @Test(enabled = true)
    public void serialisedJackson() throws JsonProcessingException {

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

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(kycObj);

        System.out.println(json);
    }


    @Test(enabled = true)
    public void deserialisedJackson() throws JsonProcessingException {

        String json ="{\n" +
                "  \"clientReferenceId\" : \"1111-2222-3333-4444\",\n" +
                "  \"entityType\" : \"BUSINESS\",\n" +
                "  \"accountStatus\" : \"BEGIN\",\n" +
                "  \"documentCount\" : \"2\",\n" +
                "  \"deviceDetails\" : {\n" +
                "    \"deviceInfo\" : \"Android\",\n" +
                "    \"ipAddress\" : \"255.255.255.0\",\n" +
                "    \"countryIP\" : \"100.0.0.1\",\n" +
                "    \"sessionId\" : \"1234-888\"\n" +
                "  }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

        CustKYCPojo custObj = mapper.readValue(json, CustKYCPojo.class);


        System.out.println(custObj.getDeviceDetails().getDeviceInfo());

    }
}
