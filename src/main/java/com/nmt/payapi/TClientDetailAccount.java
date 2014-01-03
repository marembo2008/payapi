// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nmt.payapi;


public class TClientDetailAccount {
    protected java.lang.String paymentRefNumber;
    protected java.lang.String firstName;
    protected java.lang.String lastName;
    protected java.lang.String IDNumber;
    protected java.lang.String contactNumber;
    protected java.lang.String address;
    protected double amountDue;
    protected double additionalAmount;
    protected java.lang.String dueDate;
    protected java.lang.String institution;
    protected java.lang.String institutionCallCenter;
    protected java.lang.String customerMessage;
    protected java.lang.String verifyClientDetails;
    protected java.lang.String receiveIDcopy;
    protected java.lang.String acceptPartPayment;
    protected java.lang.String acceptAdditional;
    protected java.lang.String transactionStatus;
    protected java.lang.String transactionConfirm;
    protected java.lang.String receiptMessage;
    protected java.lang.String transactionID;
    protected java.lang.String messageCode;
    protected java.lang.String messageDescription;
    protected com.nmt.payapi.TClientDetailAccArray[] detailArr;
    
    public TClientDetailAccount() {
    }
    
    public TClientDetailAccount(java.lang.String paymentRefNumber, java.lang.String firstName, java.lang.String lastName, java.lang.String IDNumber, java.lang.String contactNumber, java.lang.String address, double amountDue, double additionalAmount, java.lang.String dueDate, java.lang.String institution, java.lang.String institutionCallCenter, java.lang.String customerMessage, java.lang.String verifyClientDetails, java.lang.String receiveIDcopy, java.lang.String acceptPartPayment, java.lang.String acceptAdditional, java.lang.String transactionStatus, java.lang.String transactionConfirm, java.lang.String receiptMessage, java.lang.String transactionID, java.lang.String messageCode, java.lang.String messageDescription, com.nmt.payapi.TClientDetailAccArray[] detailArr) {
        this.paymentRefNumber = paymentRefNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.contactNumber = contactNumber;
        this.address = address;
        this.amountDue = amountDue;
        this.additionalAmount = additionalAmount;
        this.dueDate = dueDate;
        this.institution = institution;
        this.institutionCallCenter = institutionCallCenter;
        this.customerMessage = customerMessage;
        this.verifyClientDetails = verifyClientDetails;
        this.receiveIDcopy = receiveIDcopy;
        this.acceptPartPayment = acceptPartPayment;
        this.acceptAdditional = acceptAdditional;
        this.transactionStatus = transactionStatus;
        this.transactionConfirm = transactionConfirm;
        this.receiptMessage = receiptMessage;
        this.transactionID = transactionID;
        this.messageCode = messageCode;
        this.messageDescription = messageDescription;
        this.detailArr = detailArr;
    }
    
    public java.lang.String getPaymentRefNumber() {
        return paymentRefNumber;
    }
    
    public void setPaymentRefNumber(java.lang.String paymentRefNumber) {
        this.paymentRefNumber = paymentRefNumber;
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
    
    public double getAmountDue() {
        return amountDue;
    }
    
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
    public double getAdditionalAmount() {
        return additionalAmount;
    }
    
    public void setAdditionalAmount(double additionalAmount) {
        this.additionalAmount = additionalAmount;
    }
    
    public java.lang.String getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }
    
    public java.lang.String getInstitution() {
        return institution;
    }
    
    public void setInstitution(java.lang.String institution) {
        this.institution = institution;
    }
    
    public java.lang.String getInstitutionCallCenter() {
        return institutionCallCenter;
    }
    
    public void setInstitutionCallCenter(java.lang.String institutionCallCenter) {
        this.institutionCallCenter = institutionCallCenter;
    }
    
    public java.lang.String getCustomerMessage() {
        return customerMessage;
    }
    
    public void setCustomerMessage(java.lang.String customerMessage) {
        this.customerMessage = customerMessage;
    }
    
    public java.lang.String getVerifyClientDetails() {
        return verifyClientDetails;
    }
    
    public void setVerifyClientDetails(java.lang.String verifyClientDetails) {
        this.verifyClientDetails = verifyClientDetails;
    }
    
    public java.lang.String getReceiveIDcopy() {
        return receiveIDcopy;
    }
    
    public void setReceiveIDcopy(java.lang.String receiveIDcopy) {
        this.receiveIDcopy = receiveIDcopy;
    }
    
    public java.lang.String getAcceptPartPayment() {
        return acceptPartPayment;
    }
    
    public void setAcceptPartPayment(java.lang.String acceptPartPayment) {
        this.acceptPartPayment = acceptPartPayment;
    }
    
    public java.lang.String getAcceptAdditional() {
        return acceptAdditional;
    }
    
    public void setAcceptAdditional(java.lang.String acceptAdditional) {
        this.acceptAdditional = acceptAdditional;
    }
    
    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }
    
    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
    
    public java.lang.String getTransactionConfirm() {
        return transactionConfirm;
    }
    
    public void setTransactionConfirm(java.lang.String transactionConfirm) {
        this.transactionConfirm = transactionConfirm;
    }
    
    public java.lang.String getReceiptMessage() {
        return receiptMessage;
    }
    
    public void setReceiptMessage(java.lang.String receiptMessage) {
        this.receiptMessage = receiptMessage;
    }
    
    public java.lang.String getTransactionID() {
        return transactionID;
    }
    
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }
    
    public java.lang.String getMessageCode() {
        return messageCode;
    }
    
    public void setMessageCode(java.lang.String messageCode) {
        this.messageCode = messageCode;
    }
    
    public java.lang.String getMessageDescription() {
        return messageDescription;
    }
    
    public void setMessageDescription(java.lang.String messageDescription) {
        this.messageDescription = messageDescription;
    }
    
    public com.nmt.payapi.TClientDetailAccArray[] getDetailArr() {
        return detailArr;
    }
    
    public void setDetailArr(com.nmt.payapi.TClientDetailAccArray[] detailArr) {
        this.detailArr = detailArr;
    }
}
