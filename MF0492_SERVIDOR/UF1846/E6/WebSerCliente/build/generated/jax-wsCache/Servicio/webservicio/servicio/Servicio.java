
package webservicio.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicio", targetNamespace = "http://servicio.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicio {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.HelloResponse")
    @Action(input = "http://servicio.webservice/Servicio/helloRequest", output = "http://servicio.webservice/Servicio/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Suma")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Suma", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.Suma")
    @ResponseWrapper(localName = "SumaResponse", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.SumaResponse")
    @Action(input = "http://servicio.webservice/Servicio/SumaRequest", output = "http://servicio.webservice/Servicio/SumaResponse")
    public Integer suma(
        @WebParam(name = "num1", targetNamespace = "")
        Integer num1,
        @WebParam(name = "num2", targetNamespace = "")
        Integer num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Resta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Resta", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.Resta")
    @ResponseWrapper(localName = "RestaResponse", targetNamespace = "http://servicio.webservice/", className = "webservicio.servicio.RestaResponse")
    @Action(input = "http://servicio.webservice/Servicio/RestaRequest", output = "http://servicio.webservice/Servicio/RestaResponse")
    public Integer resta(
        @WebParam(name = "num1", targetNamespace = "")
        Integer num1,
        @WebParam(name = "num2", targetNamespace = "")
        Integer num2);

}
