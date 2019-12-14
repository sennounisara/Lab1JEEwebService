package Metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name="comptes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comptes implements Serializable {
    private  Long code;
    private double solde;
    @XmlTransient //Permet de ne pas afficher date de creation au client
    private Date datecreation;
    // ---- Constructor ---- //
    public Comptes() {}
    public Comptes(Long code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }
    // ---- Setter && Getter ---- //

    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
}
