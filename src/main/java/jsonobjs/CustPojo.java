package jsonobjs;

public class CustPojo {

    private String parentRequestId;
    private String clientRefId;
    private String entityType;
    private String accountStatus;
    private CustomerInfoPojo customerInfo;
    private AddressDetailsPojo address;
    private ContactDetailsPojo contactDetails;
    private BusinessDetailsPojo businessInfo;


    public String getParentRequestId() {
        return parentRequestId;
    }

    public void setParentRequestId(String parentRequestId) {
        this.parentRequestId = parentRequestId;
    }

    public String getClientRefId() {
        return clientRefId;
    }

    public void setClientRefId(String clientRefId) {
        this.clientRefId = clientRefId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public CustomerInfoPojo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfoPojo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public AddressDetailsPojo getAddress() {
        return address;
    }

    public void setAddress(AddressDetailsPojo address) {
        this.address = address;
    }

    public ContactDetailsPojo getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsPojo contactDetails) {
        this.contactDetails = contactDetails;
    }

    public BusinessDetailsPojo getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(BusinessDetailsPojo businessInfo) {
        this.businessInfo = businessInfo;
    }
}
