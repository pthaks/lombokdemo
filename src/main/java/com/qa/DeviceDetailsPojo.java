package com.qa;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeviceDetailsPojo {

    private String deviceInfo;
    private String ipAddress;
    private String countryIP;
    private String sessionId;

}
