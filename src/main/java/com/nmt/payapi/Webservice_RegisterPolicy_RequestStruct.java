// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nmt.payapi;


public class Webservice_RegisterPolicy_RequestStruct {
    protected java.lang.String loginID;
    protected java.lang.String password;
    protected java.lang.String policyNumber;
    protected java.lang.String firstName;
    protected java.lang.String lastName;
    protected java.lang.String IDNumber;
    protected java.lang.String contactNumber;
    protected java.lang.String address;
    protected java.lang.String textField1;
    protected java.lang.String textField2;
    protected java.lang.String textField3;
    protected boolean realTime;
    protected java.lang.String echo;
    protected double additionalAmount;
    protected java.lang.String paymentRefNumber;
    protected java.lang.String storeID;
    protected java.lang.String tillID;
    protected java.lang.String paymentReceiptNo;
    protected boolean realTimePayment;
    protected boolean verifyOnly;
    
    public Webservice_RegisterPolicy_RequestStruct() {
    }
    
    public Webservice_RegisterPolicy_RequestStruct(java.lang.String loginID, java.lang.String password, java.lang.String policyNumber, java.lang.String firstName, java.lang.String lastName, java.lang.String IDNumber, java.lang.String contactNumber, java.lang.String address, java.lang.String textField1, java.lang.String textField2, java.lang.String textField3, boolean realTime, java.lang.String echo, double additionalAmount, java.lang.String paymentRefNumber, java.lang.String storeID, java.lang.String tillID, java.lang.String paymentReceiptNo, boolean realTimePayment, boolean verifyOnly) {
        this.loginID = loginID;
        this.password = password;
        this.policyNumber = policyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.contactNumber = contactNumber;
        this.address = address;
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
        this.realTime = realTime;
        this.echo = echo;
        this.additionalAmount = additionalAmount;
        this.paymentRefNumber = paymentRefNumber;
        this.storeID = storeID;
        this.tillID = tillID;
        this.paymentReceiptNo = paymentReceiptNo;
        this.realTimePayment = realTimePayment;
        this.verifyOnly = verifyOnly;
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
    
    public java.lang.String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }
    
    public java.lang.String getLastName() {
        return lastName;
    }
    
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }
    
    public java.lang.String getIDNumber() {
        return IDNumber;
    }
    
    public void setIDNumber(java.lang.String IDNumber) {
        this.IDNumber = IDNumber;
    }
    
    public java.lang.String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(java.lang.String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public java.lang.String getAddress() {
        return address;
    }
    
    public void setAddress(java.lang.String address) {
        this.address = address;
    }
    
    public java.lang.String getTextField1() {
        return textField1;
    }
    
    public void setTextField1(java.lang.String textField1) {
        this.textField1 = textField1;
    }
    
    public java.lang.String getTextField2() {
        return textField2;
    }
    
    public void setTextField2(java.lang.String textField2) {
        this.textField2 = textField2;
    }
    
    public java.lang.String getTextField3() {
        return textField3;
    }
    
    public void setTextField3(java.lang.String textField3) {
        this.textField3 = textField3;
    }
    
    public boolean isRealTime() {
        return realTime;
    }
    
    public void setRealTime(boolean realTime) {
        this.realTime = realTime;
    }
    
    public java.lang.String getEcho() {
        return echo;
    }
    
    public void setEcho(java.lang.String echo) {
        this.echo = echo;
    }
    
    public double getAdditionalAmount() {
        return additionalAmount;
    }
    
    public void setAdditionalAmount(double additionalAmount) {
        this.additionalAmount = additionalAmount;
    }
    
    public java.lang.String getPaymentRefNumber() {
        return paymentRefNumber;
    }
    
    public void setPaymentRefNumber(java.lang.String paymentRefNumber) {
        this.paymentRefNumber = paymentRefNumber;
    }
    
    public java.lang.String getStoreID() {
        return storeID;
    }
    
    public void setStoreID(java.lang.String storeID) {
        this.storeID = storeID;
    }
    
    public java.lang.String getTillID() {
        return tillID;
    }
    
    public void setTillID(java.lang.String tillID) {
        this.tillID = tillID;
    }
    
    public java.lang.String getPaymentReceiptNo() {
        return paymentReceiptNo;
    }
    
    public void setPaymentReceiptNo(java.lang.String paymentReceiptNo) {
        this.paymentReceiptNo = paymentReceiptNo;
    }
    
    public boolean isRealTimePayment() {
        return realTimePayment;
    }
    
    public void setRealTimePayment(boolean realTimePayment) {
        this.realTimePayment = realTimePayment;
    }
    
    public boolean isVerifyOnly() {
        return verifyOnly;
    }
    
    public void setVerifyOnly(boolean verifyOnly) {
        this.verifyOnly = verifyOnly;
    }
}
