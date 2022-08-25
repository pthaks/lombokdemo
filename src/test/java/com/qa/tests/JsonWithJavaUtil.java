package com.qa.tests;


import org.apache.juneau.marshall.Jso;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringWriter;

public class JsonWithJavaUtil {

    @Test
    public void simpleJsonObj() throws IOException {

        JSONObject customer = new JSONObject();
        customer.put("firstname" , "priya");
        customer.put("lastname", "thakur");
        customer.put("city", "Mumbai");
        customer.put("org", "National");

        JSONArray cards = new JSONArray();
        cards.add("MasterCard");
        cards.add("VISA");
        cards.add("AMEX");

        JSONObject address = new JSONObject();
        address.put("addressLine1", "456 Krushna Kunj");
        address.put("addressLine2", "Nanda Road");
        address.put("city", "Bhopal");
        address.put("pincode", "467700");
        address.put("country", "INDIA");

        customer.put("addressDetails", address);
        customer.put("cardDetails", cards);

        System.out.println(customer);

        JSONArray addressList = new JSONArray();
        addressList.add(address);
        addressList.add(address);
        JSONObject addresses = new JSONObject();
        addresses.put("addressList", addressList);

        System.out.println(addresses);

    }
}
