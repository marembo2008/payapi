// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nmt.payapi;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class Webservice_PayoutAccount_RequestStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private com.nmt.payapi.Webservice_PayoutAccount_RequestStruct _instance;
    private java.lang.String loginID;
    private java.lang.String password;
    private java.lang.String paymentRefNumber;
    private java.lang.String pinCode;
    private java.lang.String echo;
    private static final int myLOGINID_INDEX = 0;
    private static final int myPASSWORD_INDEX = 1;
    private static final int myPAYMENTREFNUMBER_INDEX = 2;
    private static final int myPINCODE_INDEX = 3;
    private static final int myECHO_INDEX = 4;
    
    public Webservice_PayoutAccount_RequestStruct_SOAPBuilder() {
    }
    
    public void setLoginID(java.lang.String loginID) {
        this.loginID = loginID;
    }
    
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    
    public void setPaymentRefNumber(java.lang.String paymentRefNumber) {
        this.paymentRefNumber = paymentRefNumber;
    }
    
    public void setPinCode(java.lang.String pinCode) {
        this.pinCode = pinCode;
    }
    
    public void setEcho(java.lang.String echo) {
        this.echo = echo;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myLOGINID_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPASSWORD_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPAYMENTREFNUMBER_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myPINCODE_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myECHO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myLOGINID_INDEX:
                    _instance.setLoginID((java.lang.String)memberValue);
                    break;
                case myPASSWORD_INDEX:
                    _instance.setPassword((java.lang.String)memberValue);
                    break;
                case myPAYMENTREFNUMBER_INDEX:
                    _instance.setPaymentRefNumber((java.lang.String)memberValue);
                    break;
                case myPINCODE_INDEX:
                    _instance.setPinCode((java.lang.String)memberValue);
                    break;
                case myECHO_INDEX:
                    _instance.setEcho((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (com.nmt.payapi.Webservice_PayoutAccount_RequestStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
