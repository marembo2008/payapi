// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nmt.payapi;


public class Webservice_CancelPolicy_RequestStruct {
    protected java.lang.String loginID;
    protected java.lang.String password;
    protected java.lang.String policyNumber;
    protected java.lang.String echo;
    
    public Webservice_CancelPolicy_RequestStruct() {
    }
    
    public Webservice_CancelPolicy_RequestStruct(java.lang.String loginID, java.lang.String password, java.lang.String policyNumber, java.lang.String echo) {
        this.loginID = loginID;
        this.password = password;
        this.policyNumber = policyNumber;
        this.echo = echo;
    }
    
    public java.lang.String getLoginID() {
        return loginID;
    }
    
    public void setLoginID(java.lang.String loginID) {
        this.loginID = loginID;
    }
    
    public java.lang.String getPassword() {
        return password;
    }
    
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    
    public java.lang.String getPolicyNumber() {
        return policyNumber;
    }
    
    public void setPolicyNumber(java.lang.String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public java.lang.String getEcho() {
        return echo;
    }
    
    public void setEcho(java.lang.String echo) {
        this.echo = echo;
    }
}
