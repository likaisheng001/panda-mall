package com.panda.codegenerator;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.13
 * 2014-11-07T14:10:56.991+08:00
 * Generated source version: 2.7.13
 */

@WebFault(name = "Exception", targetNamespace = "http://codegenerator.chunbo.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public Exception getFaultInfo() {
        return this.exception;
    }
}
