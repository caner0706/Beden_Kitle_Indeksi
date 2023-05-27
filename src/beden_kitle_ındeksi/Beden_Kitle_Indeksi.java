package beden_kitle_ındeksi;

import java.util.Scanner;

public class Beden_Kitle_Indeksi {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Boyunuzu Girin (Örneğin :1,71) : ");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen Kilonuzu Girin : ");
        double kilo = scanner.nextDouble();
        double bki = (kilo / (boy * boy));
        
        System.out.println("Beden Kitle İndeksiniz : " + bki);
        if(bki < 18){
            System.out.println("Zayıf.");
        }
        else if(bki < 25){
            System.out.println("Normal.");
        }
        else if(bki < 30){
            System.out.println("Şişman.");
        }
        else{
            System.out.println("Obez.");
        }   
        
    }
    
}
