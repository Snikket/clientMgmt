package com.sandbox.clientMgmt.command;

import com.sandbox.clientMgmt.enums.TransactionType;

import java.util.UUID;

public class RegisterConversionCommand {
    UUID orderId;
    Double totalPrice;
    UUID clientId;
    TransactionType transactionType;
}
