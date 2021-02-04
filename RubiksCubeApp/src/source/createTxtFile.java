package source;

import java.io.*;
import source.Timer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class createTxtFile {

	private static String path;
    private static String[] MYARRAY = new String[4];
    private static int COUNTER = 0;
	//creating the text file
	public static void createTxtfile() throws IOException{
	
		FileWriter writer = null;
		try {
			
		for(String str: Timer.timeList) {
			File file = new File("Times.txt");
	
			if(!file.exists()) {
				file.createNewFile();
			}
		
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		}
		} 
			
		catch (IOException e) {
		
		e.printStackTrace();
		
			}
		
		finally {
			if(writer!=null){
				try {
					writer.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				}
			
				
			}
		}
	//selecting the file
	public static void selectFile() {
		JFileChooser fileChoose = new JFileChooser();
        fileChoose.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files","txt");;
        String fileExtension = ".txt";
        
        fileChoose.addChoosableFileFilter(filter);
        fileChoose.setFileFilter(filter);

        int RESULT;
        RESULT = fileChoose.showOpenDialog(null);
        
        if (RESULT == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChoose.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            if (path.substring(path.length()-4).compareTo(fileExtension) !=0){
                path = path + fileExtension;
		
	}

	}
	}
}






