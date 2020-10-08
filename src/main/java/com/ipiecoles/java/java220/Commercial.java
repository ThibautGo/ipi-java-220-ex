package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

import java.util.Objects;

public class Commercial extends Employe {

    private Double caAnnuel ;
    private Integer performance;

    public Commercial(){

    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel ){
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.caAnnuel = caAnnuel;
    }

    public Commercial(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire, Double caAnnuel, Integer performance ){
        this(nom, prenom, matricule, dateEmbauche, salaire, caAnnuel);
        this.performance = performance;
    }



    public Double getCaAnnuel(){
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel){
        this.caAnnuel = caAnnuel;
    }

    @Override
    public Double getPrimeAnnuelle(){
        return caAnnuel != null ? Math.max(Math.ceil(this.getCaAnnuel() * 0.05), 500d) : 500d;
    }
    
    @Override
    public boolean equals(Object o){
        Commercial commercial = (Commercial) o;
        return super.equals(o) && (Objects.equals(caAnnuel, commercial.caAnnuel));
    }

    public boolean performanceEgale(Integer performance){
        return this.performance.equals(performance);
    }


}
