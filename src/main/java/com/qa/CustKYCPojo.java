package com.qa;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustKYCPojo {

    private String clientReferenceId;
    private String entityType;
    private String accountStatus;
    private String documentCount;
    private DeviceDetailsPojo deviceDetails;

}
