
package webservice.servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicio")
public class Servicio {

   
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    
    @WebMethod(operationName = "Suma")
    public Integer Suma(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }
    @WebMethod(operationName = "Resta")
    public Integer Resta(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }
}

