import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class TallerHiloSuma extends Thread{
	
    public void run(){
		
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");    
		numero1 = scan.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		numero2 = scan.nextInt();
		
		resultado = numero1+numero2;
		System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
    }
	
}