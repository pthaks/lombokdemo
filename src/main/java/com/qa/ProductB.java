package com.qa;


import lombok.Builder;
import lombok.ToString;

//Builder pattern of Java
@Builder
@ToString
public class ProductB {

    private String productName;
    private String productDescription;
    private String productCategory;
    private double productAmount;
    private String productMake;
    private String Seller;
}
