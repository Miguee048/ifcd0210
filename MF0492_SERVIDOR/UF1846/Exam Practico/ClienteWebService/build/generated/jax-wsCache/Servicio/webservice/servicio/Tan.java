
package webservice.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Tan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tan", propOrder = {
    "num1"
})
public class Tan {

    protected Double num1;

    /**
     * Obtiene el valor de la propiedad num1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNum1() {
        return num1;
    }

    /**
     * Define el valor de la propiedad num1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNum1(Double value) {
        this.num1 = value;
    }

}
