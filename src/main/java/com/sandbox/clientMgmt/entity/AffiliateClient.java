package com.sandbox.clientMgmt.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "affiliate_client_map")
public class AffiliateClient {
    @Id
    @GeneratedValue (generator = "UUID" )
    private UUID clientId;
    String referralCode;
    UUID clickId;
    String userAgent;
    Date creationDate;

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public UUID getClickId() {
        return clickId;
    }

    public void setClickId(UUID clickId) {
        this.clickId = clickId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public AffiliateClient(){

    }
    public AffiliateClient(UUID clientId, String referralCode, UUID clickId, String userAgent, Date creationDate) {
        this.clientId = clientId;
        this.referralCode = referralCode;
        this.clickId = clickId;
        this.userAgent = userAgent;
        this.creationDate = creationDate;
    }
}
