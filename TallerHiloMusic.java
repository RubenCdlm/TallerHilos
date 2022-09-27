import java.io.File;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import javax.sound.sampled.*;

public class TallerHiloMusic extends Thread{
	
    public void run(){
		
		try{
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("Arctic-Monkeys.wav");
		AudioInputStream audio = AudioSystem.getAudioInputStream(file); 
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
	
		clip.start();
		
		}catch(UnsupportedAudioFileException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(LineUnavailableException e){
			e.printStackTrace();
		}
    }
}