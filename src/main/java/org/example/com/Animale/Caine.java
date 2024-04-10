package org.example.com.Animale;

import java.time.LocalDate;

public class Caine extends Animal{
    Boolean esteAdoptat;

    //CONSTRUCTOR REDEFINIT
    public Caine(String nume, int inaltime, LocalDate dataNasterii) {
        super(nume, inaltime, dataNasterii);
    }
    //GETTER

    public Boolean getEsteAdoptat() {
        return esteAdoptat;
    }

    //SETTER

    public void setEsteAdoptat(Boolean esteAdoptat) {
        this.esteAdoptat = esteAdoptat;
    }

    //REDEFINIRE TO STRING

    @Override
    public String toString() {
        return "Caine{" +
                "esteAdoptat=" + esteAdoptat +
                '}';
    }
}
