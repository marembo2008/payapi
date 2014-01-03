// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nmt.payapi;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class Webservice_Echo_ResponseStruct_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_return_QNAME = new QName("", "return");
    private static final javax.xml.namespace.QName ns3_TEchoResult_TYPE_QNAME = new QName("urn:WebserviceIntf", "TEchoResult");
    private CombinedSerializer ns3_myTEchoResult_SOAPSerializer;
    private static final int my_RETURN_INDEX = 0;
    
    public Webservice_Echo_ResponseStruct_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myTEchoResult_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, com.nmt.payapi.TEchoResult.class, ns3_TEchoResult_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.nmt.payapi.Webservice_Echo_ResponseStruct instance = new com.nmt.payapi.Webservice_Echo_ResponseStruct();
        com.nmt.payapi.Webservice_Echo_ResponseStruct_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_return_QNAME)) {
                member = ns3_myTEchoResult_SOAPSerializer.deserialize(ns1_return_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.nmt.payapi.Webservice_Echo_ResponseStruct_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, my_RETURN_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.set_return((com.nmt.payapi.TEchoResult)member);
                }
                reader.nextElementContent();
            } else {
                throw new DeserializationException("soap.unexpectedElementName", new Object[] {ns1_return_QNAME, elementName});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.nmt.payapi.Webservice_Echo_ResponseStruct instance = (com.nmt.payapi.Webservice_Echo_ResponseStruct)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.nmt.payapi.Webservice_Echo_ResponseStruct instance = (com.nmt.payapi.Webservice_Echo_ResponseStruct)obj;
        
        ns3_myTEchoResult_SOAPSerializer.serialize(instance.get_return(), ns1_return_QNAME, null, writer, context);
    }
    protected void verifyName(XMLReader reader, javax.xml.namespace.QName expectedName) throws java.lang.Exception {
    }
}
