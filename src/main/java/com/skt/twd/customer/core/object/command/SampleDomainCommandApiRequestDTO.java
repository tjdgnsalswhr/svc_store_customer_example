package com.skt.twd.customer.core.object.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SampleDomainCommandApiRequestDTO {

    // Using fields with DB
    private String id;
    private String sampleData1;
    private String sampleData2;

    // Using fields with External System
    boolean isExternalError = false;
    String externalSystemType = "A";
}