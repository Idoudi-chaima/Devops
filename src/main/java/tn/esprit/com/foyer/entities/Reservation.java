package tn.esprit.com.foyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="idReservation")
    private long idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private Boolean estValid = false;

    @ManyToMany (mappedBy = "reservations" ,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Etudiant> etudiants;


    public long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public Boolean getEstValid() {
        return estValid;
    }

    public void setEstValid(Boolean estValid) {
        this.estValid = estValid;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }



}
