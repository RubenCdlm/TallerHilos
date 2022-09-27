import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import javax.sound.sampled.*;


public class TallerHiloStart{
	public static void main(String[] args){
		
			
		TallerHiloMusic mt = new TallerHiloMusic();
		TallerHiloSuma mt2 = new TallerHiloSuma();
		mt.start();
		mt2.start();
		
	}
}