
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

    
    @WebMethod(operationName = "Sumar")
    public Integer Suma(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }
    @WebMethod(operationName = "Restar")
    public Integer Resta(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1-num2;
    }
     @WebMethod(operationName = "Multiplicar")
    public Integer Multiplicar(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1*num2;
    }
     @WebMethod(operationName = "Dividir")
    public Integer Dividir(@WebParam(name = "num1") Integer num1, @WebParam(name = "num2") Integer num2) {
        //TODO write your implementation code here:
        return num1/num2;
    }
      @WebMethod(operationName = "Raiz")
    public Double Raiz(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return (Math.sqrt(num1));
    }
      @WebMethod(operationName = "Logaritmo")
    public Double Logaritmo(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return (Math.log10(num1));
    }
       @WebMethod(operationName = "Neperiano")
    public Double Neperiano(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return (Math.log(num1));
    }
        @WebMethod(operationName = "Cos")
    public Double Cos(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return Math.cos(num1);
        
    }
         @WebMethod(operationName = "Sin")
    public Double Sin(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return Math.sin(num1);
    }
         @WebMethod(operationName = "Tan")
    public Double Tan(@WebParam(name = "num1") Double num1) {
        //TODO write your implementation code here:
        return Math.tan(num1);
    }
}

