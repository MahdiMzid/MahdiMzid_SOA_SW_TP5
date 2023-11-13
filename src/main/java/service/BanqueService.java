package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam double montant)
    {
        return montant*3.36;
    }

    @WebMethod
    public Compte getCompte(@WebParam int code) {

        return new Compte(code,0,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,480,new Date()));
        comptes.add(new Compte(2,300,new Date()));
        comptes.add(new Compte(3,120,new Date()));
        return comptes;
    }
}
