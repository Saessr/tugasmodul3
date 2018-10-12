/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

/**
 *
 * @author user
 */import java.util.Scanner;
public class TugasModul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a,b,c,rata;

// Buat objek Scanner
Scanner scan = new Scanner(System.in);

System.out.print("number 1: ");
a = scan.nextDouble();

System.out.print("number 2: ");
b = scan.nextDouble();

System.out.print("number 3: ");
c = scan.nextDouble();

rata = (a + b + c)/3;

System.out.println("rata-rata: " + rata);

// Tutup object Scanner

scan.close();

}

    
}
