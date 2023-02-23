package com.sandbox.clientMgmt.entity;

import javax.persistence.Entity;
import java.util.Date;

public class FailedCall {

    String clientId;
    String requestType;
    String payload;
    String reasonOfFailure;
    Date timeOfFailure;
    String processed;

}
