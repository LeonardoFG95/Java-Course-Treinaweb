
package br.com.treinaweb.calculadora.ws.client;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarResponse", propOrder = {
    "_return"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
public class SomarResponse {

    @XmlElement(name = "return")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    protected int _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public int getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-06-23T10:00:19-03:00", comments = "JAXB RI v2.3.2")
    public void setReturn(int value) {
        this._return = value;
    }

}
