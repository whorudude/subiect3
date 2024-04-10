package org.example;

import org.example.com.Animale.Animal;
import org.example.com.Animale.Pisica;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Animal> animale = Animal.citesteFisier("src/main/resources/animale.json");
        //Afisare folosind referinte la metode
        animale.forEach(System.out::println);

        //verificare inaltime
        Scanner scanner = new Scanner(System.in);
        int inaltime = 0;
        boolean ok = true;
        do {
            try {
                inaltime = Integer.parseInt(scanner.next());

                ok = false;
            }catch (NumberFormatException e)
            {
                System.out.println("Introduceti corect!");
            }
        }while (ok);

        if (!animale.isEmpty() && animale.get(0).getInaltime() == inaltime) {
            System.out.println("Da, primul animal are aceasta inaltime");
        } else {
            System.out.println("Nu, primul animal NU are aceasta inaltime");
        }


        //Varsta animale:
        System.out.println("Varsta animalelor:");
        animale.forEach(e-> System.out.println(e.varsta()));


        // Lista pisici
        List<Pisica> pisici= new ArrayList<>();
        pisici.add(new Pisica("Pisica",3, LocalDate.of(2020,4,2),34,"maidaneza"));
        pisici.add(new Pisica("Alta Pisica",6,LocalDate.of(2024,7,6),9,"persana"));

        //считывание расы
        System.out.println("Introduceti rasa: ");
        String rasa = scanner.next();

        var listaSortata = pisici.stream().filter(pis->pis.getRasa().equals(rasa)).sorted((a,b)->a.getGreutate()-b.getGreutate()).toList();
        System.out.println("Lista sortata:");
        System.out.println(listaSortata);
    }
}

