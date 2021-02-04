package source;

import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import source.Timer;


public class writeToFile {
	private Formatter x;
	private static String FILEPATH;
    public static String[] MYARRAY = new String[4];
    private static int COUNTER = 0;
    
	public void openFile() {
		try {
			x = new Formatter("Times.txt");
			
		} catch(Exception e) {
			System.out.println("Error");
		
		}
	}
	
	public void addTimes() {
		
		for(String str: Timer.timeList) {
			x.format("%s", str+"\n");
		}
		
		
		
	}
	
	public void closeFile() {
		
		x.close();
		
	}
	public static void selectFile() {
		JFileChooser FILECHOOSER = new JFileChooser();
        FILECHOOSER.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter FILTER = new FileNameExtensionFilter("Text Files","txt");;
        String EXTENSION = ".txt";
        
        FILECHOOSER.addChoosableFileFilter(FILTER);
        FILECHOOSER.setFileFilter(FILTER);

        int RESULT;
        RESULT = FILECHOOSER.showOpenDialog(null);
        
        if (RESULT == JFileChooser.APPROVE_OPTION) {
            File selectedFile = FILECHOOSER.getSelectedFile();
            FILEPATH = selectedFile.getAbsolutePath();
            if (FILEPATH.substring(FILEPATH.length()-4).compareTo(EXTENSION) !=0){
                FILEPATH = FILEPATH + EXTENSION;
		
	}

	}
	}
	
	public static void readFile() {
		try (BufferedReader MYFILE = new BufferedReader(new FileReader(FILEPATH))){
            String LINE = null;
            boolean OK;
             
            while ((LINE = MYFILE.readLine()) != null){
                OK = true;
                
                for (int C=0;C<COUNTER;C++){
                    if (MYARRAY[C].equals(LINE)){
                        OK = false;
                        C = COUNTER;
                    }
                }
                
                if (OK){
                    MYARRAY[COUNTER] = LINE;
                    COUNTER++;
                
                    if (COUNTER == MYARRAY.length){
                        increaseArraySize();
                    }

                }
            }
            
            MYFILE.close();

        }catch(Exception e){
            System.out.println(e);
            return;
        }                
		
	}
		private static void increaseArraySize(){
	        String TEMP[] = new String[MYARRAY.length*2];
	        System.arraycopy(MYARRAY, 0, TEMP, 0, MYARRAY.length);
	        MYARRAY = TEMP;
	    }
		
	
}
