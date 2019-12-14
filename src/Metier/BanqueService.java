package Metier;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name="BanqueWS")
public class BanqueService {

    @WebMethod(operationName="ConversionEuroToDH")
    public double conversion(double mt) {
        return mt*11.3;
    }

    @WebMethod
    public Comptes getCompte(@WebParam(name="code") Long code) {
        return new Comptes(code, Math.random()*80000, new Date());
    }

    @WebMethod
    public List<Comptes> getComptes(){
        List<Comptes> comptes = new ArrayList<>();
        comptes.add(new Comptes(1L, Math.random()*80000, new Date()));
        comptes.add(new Comptes(2L, Math.random()*80000, new Date()));
        return comptes;
    }
}
