
package com.panda.codegenerator;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2014-11-10T18:45:01.158+08:00
 * Generated source version: 2.7.13
 * 
 */
public final class SerialNumberGenerator_SerialNumberGeneratorImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://codegenerator.chunbo.com/", "serialNumberGeneratorService");

    private SerialNumberGenerator_SerialNumberGeneratorImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SerialNumberGeneratorService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SerialNumberGeneratorService ss = new SerialNumberGeneratorService(wsdlURL, SERVICE_NAME);
        SerialNumberGenerator port = ss.getSerialNumberGeneratorImplPort();  
        
        {
        System.out.println("Invoking generateNumber...");
        int _generateNumber_arg0 = 0;
        long _generateNumber__return = port.generateNumber(_generateNumber_arg0);
        System.out.println("generateNumber.result=" + _generateNumber__return);


        }
        {
        System.out.println("Invoking getNextLongNumber...");
        int _getNextLongNumber_arg0 = 0;
        long _getNextLongNumber__return = port.getNextLongNumber(_getNextLongNumber_arg0);
        System.out.println("getNextLongNumber.result=" + _getNextLongNumber__return);


        }

        System.exit(0);
    }

}
