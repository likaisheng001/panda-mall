package com.panda.codegenerator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chunbo.codegenerator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateNumberResponse_QNAME = new QName("http://codegenerator.chunbo.com/", "generateNumberResponse");
    private final static QName _GetNextLongNumberResponse_QNAME = new QName("http://codegenerator.chunbo.com/", "getNextLongNumberResponse");
    private final static QName _GenerateNumber_QNAME = new QName("http://codegenerator.chunbo.com/", "generateNumber");
    private final static QName _GetNextLongNumber_QNAME = new QName("http://codegenerator.chunbo.com/", "getNextLongNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chunbo.codegenerator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNextLongNumberResponse }
     * 
     */
    public GetNextLongNumberResponse createGetNextLongNumberResponse() {
        return new GetNextLongNumberResponse();
    }

    /**
     * Create an instance of {@link GenerateNumberResponse }
     * 
     */
    public GenerateNumberResponse createGenerateNumberResponse() {
        return new GenerateNumberResponse();
    }

    /**
     * Create an instance of {@link GetNextLongNumber }
     * 
     */
    public GetNextLongNumber createGetNextLongNumber() {
        return new GetNextLongNumber();
    }

    /**
     * Create an instance of {@link GenerateNumber }
     * 
     */
    public GenerateNumber createGenerateNumber() {
        return new GenerateNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codegenerator.chunbo.com/", name = "generateNumberResponse")
    public JAXBElement<GenerateNumberResponse> createGenerateNumberResponse(GenerateNumberResponse value) {
        return new JAXBElement<GenerateNumberResponse>(_GenerateNumberResponse_QNAME, GenerateNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextLongNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codegenerator.chunbo.com/", name = "getNextLongNumberResponse")
    public JAXBElement<GetNextLongNumberResponse> createGetNextLongNumberResponse(GetNextLongNumberResponse value) {
        return new JAXBElement<GetNextLongNumberResponse>(_GetNextLongNumberResponse_QNAME, GetNextLongNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codegenerator.chunbo.com/", name = "generateNumber")
    public JAXBElement<GenerateNumber> createGenerateNumber(GenerateNumber value) {
        return new JAXBElement<GenerateNumber>(_GenerateNumber_QNAME, GenerateNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextLongNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codegenerator.chunbo.com/", name = "getNextLongNumber")
    public JAXBElement<GetNextLongNumber> createGetNextLongNumber(GetNextLongNumber value) {
        return new JAXBElement<GetNextLongNumber>(_GetNextLongNumber_QNAME, GetNextLongNumber.class, null, value);
    }

}
