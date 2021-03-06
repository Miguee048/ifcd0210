
package webservice.servicio;

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
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Neperiano")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Neperiano", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Neperiano")
    @ResponseWrapper(localName = "NeperianoResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.NeperianoResponse")
    @Action(input = "http://servicio.webservice/Servicio/NeperianoRequest", output = "http://servicio.webservice/Servicio/NeperianoResponse")
    public Double neperiano(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.HelloResponse")
    @Action(input = "http://servicio.webservice/Servicio/helloRequest", output = "http://servicio.webservice/Servicio/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Cos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Cos", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Cos")
    @ResponseWrapper(localName = "CosResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.CosResponse")
    @Action(input = "http://servicio.webservice/Servicio/CosRequest", output = "http://servicio.webservice/Servicio/CosResponse")
    public Double cos(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Tan")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Tan", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Tan")
    @ResponseWrapper(localName = "TanResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.TanResponse")
    @Action(input = "http://servicio.webservice/Servicio/TanRequest", output = "http://servicio.webservice/Servicio/TanResponse")
    public Double tan(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Sin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Sin", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Sin")
    @ResponseWrapper(localName = "SinResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.SinResponse")
    @Action(input = "http://servicio.webservice/Servicio/SinRequest", output = "http://servicio.webservice/Servicio/SinResponse")
    public Double sin(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Logaritmo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Logaritmo", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Logaritmo")
    @ResponseWrapper(localName = "LogaritmoResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.LogaritmoResponse")
    @Action(input = "http://servicio.webservice/Servicio/LogaritmoRequest", output = "http://servicio.webservice/Servicio/LogaritmoResponse")
    public Double logaritmo(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param num1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "Raiz")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Raiz", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Raiz")
    @ResponseWrapper(localName = "RaizResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.RaizResponse")
    @Action(input = "http://servicio.webservice/Servicio/RaizRequest", output = "http://servicio.webservice/Servicio/RaizResponse")
    public Double raiz(
        @WebParam(name = "num1", targetNamespace = "")
        Double num1);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Dividir")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Dividir", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Dividir")
    @ResponseWrapper(localName = "DividirResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.DividirResponse")
    @Action(input = "http://servicio.webservice/Servicio/DividirRequest", output = "http://servicio.webservice/Servicio/DividirResponse")
    public Integer dividir(
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
    @WebMethod(operationName = "Restar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Restar", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Restar")
    @ResponseWrapper(localName = "RestarResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.RestarResponse")
    @Action(input = "http://servicio.webservice/Servicio/RestarRequest", output = "http://servicio.webservice/Servicio/RestarResponse")
    public Integer restar(
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
    @WebMethod(operationName = "Sumar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Sumar", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Sumar")
    @ResponseWrapper(localName = "SumarResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.SumarResponse")
    @Action(input = "http://servicio.webservice/Servicio/SumarRequest", output = "http://servicio.webservice/Servicio/SumarResponse")
    public Integer sumar(
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
    @WebMethod(operationName = "Multiplicar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Multiplicar", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.Multiplicar")
    @ResponseWrapper(localName = "MultiplicarResponse", targetNamespace = "http://servicio.webservice/", className = "webservice.servicio.MultiplicarResponse")
    @Action(input = "http://servicio.webservice/Servicio/MultiplicarRequest", output = "http://servicio.webservice/Servicio/MultiplicarResponse")
    public Integer multiplicar(
        @WebParam(name = "num1", targetNamespace = "")
        Integer num1,
        @WebParam(name = "num2", targetNamespace = "")
        Integer num2);

}
