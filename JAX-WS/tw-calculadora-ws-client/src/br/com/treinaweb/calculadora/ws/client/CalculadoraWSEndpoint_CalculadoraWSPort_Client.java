
package br.com.treinaweb.calculadora.ws.client;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-06-23T22:00:19.179-03:00
 * Generated source version: 3.3.6
 *
 */
public final class CalculadoraWSEndpoint_CalculadoraWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.calculadora.treinaweb.com.br/", "CalculadoraWSService");

    private CalculadoraWSEndpoint_CalculadoraWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CalculadoraWSService.WSDL_LOCATION;
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

        CalculadoraWSService ss = new CalculadoraWSService(wsdlURL, SERVICE_NAME);
        CalculadoraWSEndpoint port = ss.getCalculadoraWSPort();

        {
        System.out.println("Invoking somar...");
        int _somar_arg0 = 766297968;
        int _somar_arg1 = -988391719;
        int _somar__return = port.somar(_somar_arg0, _somar_arg1);
        System.out.println("somar.result=" + _somar__return);


        }

        System.exit(0);
    }

}
