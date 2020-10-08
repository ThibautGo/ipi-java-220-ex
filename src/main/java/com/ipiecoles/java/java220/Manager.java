package com.ipiecoles.java.java220;

import java.util.HashSet;

public class Manager extends Employe {

    private HashSet<Technicien> equipe = new HashSet<Technicien>();

    public HashSet<Technicien> getEquipe(){
        return equipe;
    }

    public void setEquipe(HashSet<Technicien> equipe){
        this.equipe = equipe;
    }

    public void ajoutTechnicienEquipe(Technicien technicien){
        equipe.add(technicien);
    }

    public void setSalaire(Double salaire){
        //super.setSalaire(salaire*(Entreprise.INDICE_MANAGER + 0.1d*(double)equipe.size()));
        super.setSalaire(salaire * Entreprise.INDICE_MANAGER + (salaire * (double)equipe.size() / 10));
    }

    public Double getPrimeAnnuelle(){

    }
}

