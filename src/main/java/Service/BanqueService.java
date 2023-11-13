package Service;
import Metier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService
public class BanqueService {
    // Méthode de conversion de montant
    @WebMethod
    public double conversion( @WebParam double montant)
    {
        return montant*3.36;
    }
    // Cette méthode prend un montant en paramètre et le convertit en utilisant un taux de change fixe (3.36 dans cet exemple).
    public List <Compte> getComptes()  // Méthode pour obtenir la liste des comptes
    {
        List <Compte> comptes=new ArrayList();
        //création de deux comptes
        Compte c1= new Compte(10, 10.5,new Date());
        Compte c2= new Compte(9, 15.5,new Date());
        // ajout des comptes à la liste
        comptes.add(c1);
        comptes.add(c2);
        return comptes;
    }
}
