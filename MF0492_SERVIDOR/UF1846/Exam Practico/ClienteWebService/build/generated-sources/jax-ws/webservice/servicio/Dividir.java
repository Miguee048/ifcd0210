
package webservice.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Dividir complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Dividir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dividir", propOrder = {
    "num1",
    "num2"
})
public class Dividir {

    protected Integer num1;
    protected Integer num2;

    /**
     * Obtiene el valor de la propiedad num1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum1() {
        return num1;
    }

    /**
     * Define el valor de la propiedad num1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum1(Integer value) {
        this.num1 = value;
    }

    /**
     * Obtiene el valor de la propiedad num2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum2() {
        return num2;
    }

    /**
     * Define el valor de la propiedad num2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum2(Integer value) {
        this.num2 = value;
    }

}
