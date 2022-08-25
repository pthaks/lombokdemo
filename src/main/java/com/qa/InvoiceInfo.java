package com.qa;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor (force = true)
@RequiredArgsConstructor
@ToString
public class InvoiceInfo {

    @NonNull
    private int id;
    @NonNull
    private String payerName;
    @NonNull
    private String sellerName;
    private double netAmount;

    private final String sellerAddress;

}
