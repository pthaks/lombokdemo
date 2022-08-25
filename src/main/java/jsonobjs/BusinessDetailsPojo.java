package jsonobjs;

import com.google.gson.JsonArray;

public class BusinessDetailsPojo {

    private String businessName;
    private String businessNameTrustee;
    private String tradingName;
    private String businessRegistrationNumber;
    private String businessEntityType;
    private String businessType;
    private String registeredCountry;
    private String website;
    private String[] operatingCountries;

    public BusinessDetailsPojo(){}

    public BusinessDetailsPojo(String businessName, String businessNameTrustee, String tradingName, String businessRegistrationNumber, String businessEntityType, String businessType, String registeredCountry, String website, String[] operatingCountries) {
        this.businessName = businessName;
        this.businessNameTrustee = businessNameTrustee;
        this.tradingName = tradingName;
        this.businessRegistrationNumber = businessRegistrationNumber;
        this.businessEntityType = businessEntityType;
        this.businessType = businessType;
        this.registeredCountry = registeredCountry;
        this.website = website;
        this.operatingCountries = operatingCountries;
    }

    public void setOperatingCountries(String[] operatingCountries) {
        this.operatingCountries = operatingCountries;
    }

    public String[] getOperatingCountries() {
        return operatingCountries;
    }

    //Getter methods
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessNameTrustee() {
        return businessNameTrustee;
    }

    public void setBusinessNameTrustee(String businessNameTrustee) {
        this.businessNameTrustee = businessNameTrustee;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public String getBusinessRegistrationNumber() {
        return businessRegistrationNumber;
    }

    public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
        this.businessRegistrationNumber = businessRegistrationNumber;
    }

    public String getBusinessEntityType() {
        return businessEntityType;
    }

    public void setBusinessEntityType(String businessEntityType) {
        this.businessEntityType = businessEntityType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getRegisteredCountry() {
        return registeredCountry;
    }

    public void setRegisteredCountry(String registeredCountry) {
        this.registeredCountry = registeredCountry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}


