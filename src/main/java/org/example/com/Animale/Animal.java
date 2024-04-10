package org.example.com.Animale;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Clasa de baza Animal
 */
public class Animal {
   private String nume;
   private int inaltime;
   private LocalDate dataNasterii;

   //CONSTRUCTOR

   public Animal(String nume, int inaltime, LocalDate dataNasterii) {
      this.nume = nume;
      this.inaltime = inaltime;
      this.dataNasterii = dataNasterii;
   }

    public static List<Animal> citesteFisier(String s) {
        return List.of();
    }

    // Getter
   public String getNume() {
      return nume;
   }

   public int getInaltime() {
      return inaltime;
   }

   public LocalDate getDataNasterii() {
      return dataNasterii;
   }

   //SETTER
   public void setNume(String nume) {
      this.nume = nume;
   }

   public void setInaltime(int inaltime) {
      this.inaltime = inaltime;
   }

   public void setDataNasterii(LocalDate dataNasterii) {
      this.dataNasterii = dataNasterii;
   }

   @Override
   public String toString() {
      return "Animal{" +
              "nume='" + nume + '\'' +
              ", inaltime=" + inaltime + " cm "+
              ", dataNasterii=" + dataNasterii +
              '}';
   }
   //extrage animal din cvs
   static Animal csvToAnimal(String csv)
   {
      try(Scanner scanner = new Scanner(csv)) {
         scanner.useDelimiter(";");
        return new Animal(scanner.next(),scanner.nextInt(), LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
      }
   }
   //extragere lista de animale din fiser .csv
   /* public static List<Animal> citesteFisier(String caleFisier)
   {
      try{
         File file = new File(caleFisier);
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line;
         List<Animal> animale = new ArrayList<Animal>();
         while((line=reader.readLine())!=null)
         {
            animale.add(Animal.csvToAnimal(line));
         }
         return animale;
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      return null;

   } */

   

   // Obtine varsta animal

  public int varsta()
   {
      var azi = LocalDate.now();
      return  azi.getYear()-dataNasterii.getYear();
   }
}
