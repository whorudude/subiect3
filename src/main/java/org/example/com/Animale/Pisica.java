package org.example.com.Animale;

import java.time.LocalDate;

public class Pisica extends Animal{
    private int greutate;
    String rasa;

    //CONSTRUCTOR care apeleaza clasa de baza Animal
    public Pisica(String nume, int inaltime, LocalDate dataNasterii) {
        super(nume, inaltime, dataNasterii);
    }

    public Pisica(String nume, int inaltime, LocalDate dataNasterii, int greutate, String rasa) {
        super(nume, inaltime, dataNasterii);
        this.greutate = greutate;
        this.rasa = rasa;
    }
    //GETTER


    public int getGreutate() {
        return greutate;
    }

    public String getRasa() {
        return rasa;
    }


    //SETTER

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    //REDEFINIRE TO STRING

    @Override
    public String toString() {
        return "Pisica{" +
                "greutate=" + greutate +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
