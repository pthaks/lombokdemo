package com.qa.tests;

import jsonobjs.*;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.testng.annotations.Test;

//Using Apache JUNEAU JSON Library
//They also support POJO to XML, POJO to HTML serialization

public class SerDesWithJuneau {

    @Test (enabled = true)
    public void serializationWithJuneau() throws SerializeException {
        //Serialization
        CustPojo custObj = new CustPojo();
        AddressDetailsPojo address = new AddressDetailsPojo();
        BusinessDetailsPojo businessDetails = new BusinessDetailsPojo();
        ContactDetailsPojo contactDetails = new ContactDetailsPojo();
        CustomerInfoPojo customerInfo = new CustomerInfoPojo();
        String countries[] = {"USD", "NPR", "SGD"};

        address.setAddressLine1("3165 Reppert Coal Road");
        address.setAddressLine2("Bloomfield Township");
        address.setCity("Bloomfield");
        address.setCountry("USA");
        address.setState("MI Michigan");
        address.setPostcode("48302");

        businessDetails.setBusinessName("LogiTech");
        businessDetails.setBusinessType("SME");
        businessDetails.setBusinessNameTrustee("Shivank");
        businessDetails.setBusinessEntityType("BUSINESS");
        businessDetails.setRegisteredCountry("USA");
        businessDetails.setTradingName("LGT");
        businessDetails.setWebsite("http://logitech.com");
        businessDetails.setOperatingCountries(countries);

        contactDetails.setContactNo("586-946-0710");
        contactDetails.setEmail("support@logtech.com");

        customerInfo.setFirstName("Silvia");
        customerInfo.setMiddleName("Jerónimo");
        customerInfo.setLastName("Dorina");
        customerInfo.setTitle("Mrs");

        custObj.setAccountStatus("BEGIN");
        custObj.setEntityType("BUSINESS");
        custObj.setClientRefId("CLIENT-167547-58858");
        custObj.setParentRequestId("PARENT-88898-77874");
        custObj.setAddress(address);
        custObj.setContactDetails(contactDetails);
        custObj.setBusinessInfo(businessDetails);
        custObj.setCustomerInfo(customerInfo);

        JsonSerializer jsonBuilder = JsonSerializer.DEFAULT_READABLE;
        String jsonObj = jsonBuilder.serialize(custObj);

        System.out.println(jsonObj);




    }

    @Test (enabled = true)
    public void deserializationWithJuneau() throws ParseException {

        //Deserialization
        String jsonBody = "{\n" +
                "\t\"accountStatus\": \"BEGIN\",\n" +
                "\t\"address\": {\n" +
                "\t\t\"addressLine1\": \"3165 Reppert Coal Road\",\n" +
                "\t\t\"addressLine2\": \"Bloomfield Township\",\n" +
                "\t\t\"city\": \"Bloomfield\",\n" +
                "\t\t\"country\": \"USA\",\n" +
                "\t\t\"postcode\": \"48302\",\n" +
                "\t\t\"state\": \"MI Michigan\"\n" +
                "\t},\n" +
                "\t\"businessInfo\": {\n" +
                "\t\t\"businessEntityType\": \"BUSINESS\",\n" +
                "\t\t\"businessName\": \"LogiTech\",\n" +
                "\t\t\"businessNameTrustee\": \"Shivank\",\n" +
                "\t\t\"businessType\": \"SME\",\n" +
                "\t\t\"operatingCountries\": [\n" +
                "\t\t\t\"USD\",\n" +
                "\t\t\t\"NPR\",\n" +
                "\t\t\t\"SGD\"\n" +
                "\t\t],\n" +
                "\t\t\"registeredCountry\": \"USA\",\n" +
                "\t\t\"tradingName\": \"LGT\",\n" +
                "\t\t\"website\": \"http://logitech.com\"\n" +
                "\t},\n" +
                "\t\"clientRefId\": \"CLIENT-167547-58858\",\n" +
                "\t\"contactDetails\": {\n" +
                "\t\t\"contactNo\": \"586-946-0710\",\n" +
                "\t\t\"email\": \"support@logtech.com\"\n" +
                "\t},\n" +
                "\t\"customerInfo\": {\n" +
                "\t\t\"firstName\": \"Silvia\",\n" +
                "\t\t\"lastName\": \"Dorina\",\n" +
                "\t\t\"middleName\": \"Jerónimo\",\n" +
                "\t\t\"title\": \"Mrs\"\n" +
                "\t},\n" +
                "\t\"entityType\": \"BUSINESS\",\n" +
                "\t\"parentRequestId\": \"PARENT-88898-77874\"\n" +
                "}";

        JsonParser jsonParsed = JsonParser.DEFAULT;

        CustPojo custObj =jsonParsed.parse(jsonBody, CustPojo.class);

        System.out.println("Business name --> " + custObj.getBusinessInfo().getBusinessName());
    }
}
