package Metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement// Indique à JAXB que la classe "Compte" peut être convertie en un élément XML racine.
@XmlAccessorType(XmlAccessType.FIELD)// Spécifie que JAXB doit accéder aux champs de la classe directement lors de la sérialisation.
public class Compte {
    private int code ;
    private double solde;
    @XmlTransient// Marque la variable "dateCreation" comme transitoire, excluant sa sérialisation en XML.
    private Date date;
    //constucteur avec paramétres
    public Compte (int code, double solde, Date date)
    {
        this.code=code;
        this.solde=solde;
        this.date=date;
    }
    //constttructeur sans paramétres
    public Compte ()
    {
    }
    //génération des getters et des setters
    public int getCode()
    {
        return code;
    }
    public void setCode(int code)
    {
        this.code = code;
    }
    public double getSolde()
    {
        return solde;
    }
    public void setSolde(double solde)
    {
        this.solde = solde;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }
}


