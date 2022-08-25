package com.qa.tests;

import com.qa.InvoiceInfo;
import com.qa.ProductB;
import com.qa.ProductInfo;
import com.qa.StudentInfo;

import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class TestLombokFunc {


    @Test
    public void func1(){
        //constructor Setter
        ProductInfo prodA = new ProductInfo("TV", "Television set");
        ProductInfo prodC = new ProductInfo("TV", "Television set");

        //Normal setter methods
        ProductInfo prodB = new ProductInfo();
        prodB.setProductName("Boat Bluetooth");
        prodB.setProductDescription("use Boat bluetooth for solid voice quality");

        //Object equals method
        if (prodA.equals(prodB))
            System.out.println("prodA and prodB are equal");
        else
            System.out.println("prodA and prodB are NOT equal ");

        if (prodA.equals(prodC))
            System.out.println("prodA and prodC are equal");
        else
            System.out.println("prodA and prodC are NOT equal ");

        //Hashcode give memory reference value to which object points
        System.out.println("prodA hash --> " + prodA.hashCode());
        System.out.println("prodB hash --> " + prodB.hashCode());
        System.out.println("prodC hash --> " + prodC.hashCode());

        //ToString method
        System.out.println(prodA.toString());

    }

    @Test
    public void testReqFields(){

        //Using required fields constructor
        InvoiceInfo invoice = new InvoiceInfo(4567, "LG", "Boat", "Pune");

        System.out.println(invoice.toString());

    }

    @Test
    public void testDataFeature(){

        //Using @Data annotation which includes some features by default
        StudentInfo studentA = new StudentInfo("Abhinaya Deo", "30", "3", "A", "Ms Kiran Sachdeo");
        System.out.println(studentA.toString());
    }

    @Test
    public void testBuilder(){

        //Only passing fields in builder class that are required/has value
        ProductB productA = ProductB.builder()
                                        .productName("Umbrella")
                                        .productDescription("Big size multi colored umbrells")
                                        .productAmount(100.15)
                                        //.productCategory("Rainy Season Items")
                                        .Seller("Sun umbrella")
                                        .productMake("somethimg")
                                        .build();

        System.out.println(productA.toString());

    }

    @Test
    public void testLogging(){

        //log.info("fdfsf");
        log.info("Information msg");
        log.debug("Debug msg");
        log.error("ERROR msg");
        log.warn("Warning msg");




    }
}
