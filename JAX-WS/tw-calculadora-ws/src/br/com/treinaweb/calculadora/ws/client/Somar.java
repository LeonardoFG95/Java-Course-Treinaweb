
package br.com.treinaweb.calculadora.ws.client;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somar", propOrder = {
    "arg0",
    "arg1"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
public class Somar {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    protected int arg0;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    protected int arg1;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public int getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public int getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public void setArg1(int value) {
        this.arg1 = value;
    }

}
