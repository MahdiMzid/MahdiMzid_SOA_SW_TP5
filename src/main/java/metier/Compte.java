package metier;

import java.util.*;

public class Compte {
        // Données d'un compte
        private int code;
        private double solde;
        private Date dateCreation;

        // Constructeur avec paramètres
        public Compte(int code, double solde, Date dateCreation) {
            this.code=code;
            this.solde=solde;
            this.dateCreation=dateCreation;
        }
        // Constructeur sans paramètres
        public Compte() {

        }

        // getters et setters
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
        }
        public double getSolde() {
            return solde;
        }
        public void setSolde(double solde) {
            this.solde = solde;
        }
        public Date getDateCreation() {
            return dateCreation;
        }
        public void setDateCreation(Date dateCreation) {
            this.dateCreation = dateCreation;
        }


    }


