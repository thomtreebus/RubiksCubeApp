package source;
import source.Scrambler;

public class VisualScramble {
	
	   static char[] white = new char[] {'w','w','w','w','w','w','w','w','w'};
	   static char[] yellow = new char[] {'y','y','y','y','y','y','y','y','y'};
	   static char[] blue = new char[] {'b','b','b','b','b','b','b','b','b'};
	   static char[] green = new char[] {'g','g','g','g','g','g','g','g','g'};
	   static char[] red = new char[] {'r','r','r','r','r','r','r','r','r'};
	   static char[] orange = new char[] {'o','o','o','o','o','o','o','o','o'};
	   
	 
	    public static void display(char face[]) {
	    	
	    	for(int i = 0; i<9; i++) {
	    		System.out.print(face[i] + " ");
	    		
	    	}
	    	System.out.print("\n");
	    }
	   
	    public static void displayCube(){
	       
	    	
	        for(int i = 0; i<9; i++){
	            System.out.print(white[i] + " ");
	        }
	        System.out.print("\n");
	        for(int i = 0; i<9; i++){
	            System.out.print(yellow[i] + " ");        
	        }
	        System.out.print("\n");
	        for(int i = 0; i<9; i++){
	            System.out.print(blue[i] + " ");        
	        }
	        System.out.print("\n");
	        for(int i = 0; i<9; i++){
	            System.out.print(green[i] + " ");        
	        }
	        System.out.print("\n");
	        for(int i = 0; i<9; i++){
	            System.out.print(red[i] + " ");        
	        }
	        System.out.print("\n");
	        for(int i = 0; i<9; i++){
	            System.out.print(orange[i] + " ");        
	        }
	        System.out.print("\n");
	 
	    }
	   
	    public static void swap(char a, char b){
	     char temp = a;
	     a = b;
	     b = temp;
	   
	    }
	   
	    public static void rotate(char move){
	       
	        if(move == 'U'){
	        	
	        	char temp;
	
	            //swap(white[7], white[3]);
	            temp = white[7];
	        	white[7] = white[3];
	        	white[3] = temp;  	
	            //swap(white[6], white[4]);
	        	temp = white[6];
	        	white[6] = white[4];
	        	white[4] = temp;
	            //swap(white[0], white[2]);
	        	temp = white[0];
	        	white[0] = white[2];
	        	white[2] = temp;
	            //swap(white[7], white[5]);
	        	temp = white[7];
	        	white[7] = white[5];
	        	white[5] = temp;
	            //swap(white[0], white[4]);
	        	temp = white[0];
	        	white[0] = white[4];
	        	white[4] = temp;
	            //swap(white[1], white[3]);
	        	temp = white[1];
	        	white[1] = white[3];
	        	white[3] = temp;

	           
	            //swap(blue[0],orange[0]);
	        	temp = blue[0];
	        	blue[0] = orange[0];
	        	orange[0] = temp;
	            //swap(blue[7],orange[7]);
	        	temp = blue[7];
	        	blue[7] = orange[7];
	        	orange[7] = temp;
	            //swap(blue[6],orange[6]);
	        	temp = blue[6];
	        	blue[6] = orange[6];
	        	orange[6] = temp;
	            //swap(orange[6],green[6]);
	        	temp = orange[6];
	        	orange[6] = green[6];
	        	green[6] = temp;
	            //swap(orange[7],green[7]);
	        	temp = orange[7];
	        	orange[7] = green[7];
	        	green[7] = temp;
	            //swap(orange[0],green[0]);
	        	temp = orange[0];
	        	orange[0] = green[0];
	        	green[0] = temp;
	            //swap(green[6],red[6]);
	        	temp = green[6];
	        	green[6] = red[6];
	        	red[6] = temp;
	            //swap(green[7],red[7]);
	        	temp = green[7];
	        	green[7] = red[7];
	        	red[7] = temp;
	            //swap(green[0],red[0]);
	        	temp = green[0];
	        	green[0] = red[0];
	        	red[0] = temp;
	        }    
	        else if(move == 'F'){
	            char temp;
	        	//swap(red[0],red[4]);
	        	temp = red[0];
	        	red[0] = red[4];
	        	red[4] = temp;
	            //swap(red[7],red[5]);
	        	temp = red[7];
	        	red[7] = red[5];
	        	red[5] = temp;
	            //swap(red[1],red[3]);
	        	temp = red[1];
	        	red[1] = red[3];
	        	red[3] = temp;
	            //swap(red[0],red[6]);
	        	temp = red[0];
	        	red[0] = red[6];
	        	red[6] = temp;
	            //swap(red[1],red[5]);
	        	temp = red[1];
	        	red[1] = red[5];
	        	red[5] = temp;
	            //swap(red[2],red[4]);
	        	temp = red[2];
	        	red[2] = red[4];
	        	red[4] = temp;
	 
	            //swap(blue[6],white[3]);
	        	temp = blue[6];
	        	blue[6] = white[3];
	        	white[3] = temp;
	            //swap(blue[5],white[2]);
	        	temp = blue[5];
	        	blue[5] = white[2];
	        	white[2] = temp;
	            //swap(blue[4],white[1]);
	        	temp = blue[4];
	        	blue[4] = white[1];
	        	white[1] = temp;
	            //swap(white[1],green[0]);
	        	temp = white[1];
	        	white[1] = green[0];
	        	green[0] = temp;
	            //swap(white[2],green[1]);
	        	temp = white[2];
	        	white[2] = green[1];
	        	green[1] = temp;
	            //swap(white[3],green[2]);
	        	temp = white[3];
	        	white[3] = green[2];
	        	green[2] = temp;
	            //swap(green[0],yellow[3]);
	        	temp = green[0];
	        	green[0] = yellow[3];
	        	yellow[3] = temp;
	            //swap(green[1],yellow[2]);
	        	temp = green[1];
	        	green[1] = yellow[2];
	        	yellow[2] = temp;
	            //swap(green[2],yellow[1]);
	        	temp = green[2];
	        	green[2] = yellow[1];
	        	yellow[1] = temp;
	       
	        }
	        else if(move == 'D'){
	        	char temp;
	            //swap(yellow[1],yellow[5]);
	            temp = yellow[1]; 
	            yellow[1] = yellow[5];
	            yellow[5] = temp;
	            //swap(yellow[2],yellow[4]);
	            temp = yellow[2]; 
	            yellow[2] = yellow[4];
	            yellow[4] = temp;
	            //swap(yellow[0],yellow[6]);
	            temp = yellow[0]; 
	            yellow[0] = yellow[6];
	            yellow[6] = temp;
	            //swap(yellow[1],yellow[3]);
	            temp = yellow[1]; 
	            yellow[1] = yellow[3];
	            yellow[3] = temp;
	            //swap(yellow[0],yellow[4]);
	            temp = yellow[0]; 
	            yellow[0] = yellow[4];
	            yellow[4] = temp;
	            //swap(yellow[7],yellow[5]);
	            temp = yellow[7]; 
	            yellow[7] = yellow[5];
	            yellow[5] = temp;
	 
	            //swap(blue[4],red[4]);
	            temp = blue[4]; 
	            blue[4] = red[4];
	            red[4] = temp;
	            //swap(blue[3],red[3]);
	            temp = blue[3]; 
	            blue[3] = red[3];
	            red[3] = temp;
	            //swap(blue[2],red[2]);
	            temp = blue[2]; 
	            blue[2] = red[2];
	            red[2] = temp;
	            //swap(red[2],green[2]);
	            temp = red[2]; 
	            red[2] = green[2];
	            green[2] = temp;
	            //swap(red[3],green[3]);
	            temp = red[3]; 
	            red[3] = green[3];
	            green[3] = temp;
	            //swap(red[4],green[4]);
	            temp = red[4]; 
	            red[4] = green[4];
	            green[4] = temp;
	            //swap(green[4],orange[4]);
	            temp = green[4]; 
	            green[4] = orange[4];
	            orange[4] = temp;
	            //swap(green[3],orange[3]);
	            temp = green[3]; 
	            green[3] = orange[3];
	            orange[3] = temp;
	            //swap(green[2],orange[2]);
	            temp = green[2]; 
	            green[2] = orange[2];
	            orange[2] = temp;
	       
	        }
	        else if(move == 'B'){
	        	char temp;
	            //swap(orange[4],orange[0]);
	        	temp = orange[4];
	        	orange[4] = orange[0];
	        	orange[0] = temp;
	            //swap(orange[3],orange[1]);
	        	temp = orange[3];
	        	orange[3] = orange[1];
	        	orange[1] = temp;
	            //swap(orange[5],orange[7]);
	        	temp = orange[5];
	        	orange[5] = orange[7];
	        	orange[7] = temp;
	            //swap(orange[4],orange[2]);
	        	temp = orange[4];
	        	orange[4] = orange[2];
	        	orange[2] = temp;
	            //swap(orange[5],orange[1]);
	        	temp = orange[5];
	        	orange[5] = orange[1];
	        	orange[1] = temp;
	            //swap(orange[6],orange[0]);
	        	temp = orange[6];
	        	orange[6] = orange[0];
	        	orange[0] = temp;
	        	
	            //swap(blue[2],yellow[5]);
	        	temp = blue[2];
	        	blue[2] = yellow[5];
	        	yellow[5] = temp;
	            //swap(blue[1],yellow[6]);
	        	temp = blue[1];
	        	blue[1] = yellow[6];
	        	yellow[6] = temp;
	            //swap(blue[0],yellow[7]);
	        	temp = blue[0];
	        	blue[0] = yellow[7];
	        	yellow[7] = temp;
	            //swap(yellow[5],green[6]);
	        	temp = yellow[5];
	        	yellow[5] = green[6];
	        	green[6] = temp;
	            //swap(yellow[6],green[5]);
	        	temp = yellow[6];
	        	yellow[6] = green[5];
	        	green[5] = temp;
	            //swap(yellow[7],green[4]);
	        	temp = yellow[7];
	        	yellow[7] = green[4];
	        	green[4] = temp;
	            //swap(green[6],white[7]);
	        	temp = green[6];
	        	green[6] = white[7];
	        	white[7] = temp;
	            //swap(green[5],white[6]);
	        	temp = green[5];
	        	green[5] = white[6];
	        	white[6] = temp;
	            //swap(green[4],white[5]);
	        	temp = green[4];
	        	green[4] = white[5];
	        	white[5] = temp;
	       
	        }
	        else if(move == 'L'){
	        	char temp;
	            //swap(green[6],green[2]);
	        	temp = green[6];
	        	green[6] = green[2];
	        	green[2] = temp;
	            //swap(green[5],green[3]);
	        	temp = green[5];
	        	green[5] = green[3];
	        	green[3] = temp;
	            //swap(green[7],green[1]);
	        	temp = green[7];
	        	green[7] = green[1];
	        	green[1] = temp;
	            //swap(green[4],green[6]);
	        	temp = green[4];
	        	green[4] = green[6];
	        	green[6] = temp;
	            //swap(green[7],green[3]);
	        	temp = green[7];
	        	green[7] = green[3];
	        	green[3] = temp;
	            //swap(green[0],green[2]);
	        	temp = green[0];
	        	green[0] = green[2];
	        	green[2] = temp;
	   
	            //swap(white[5],orange[2]);
	        	temp = white[5];
	        	white[5] = orange[2];
	        	orange[2] = temp;
	            //swap(white[4],orange[1]);
	        	temp = white[4];
	        	white[4] = orange[1];
	        	orange[1] = temp;
	            //swap(white[3],orange[0]);
	        	temp = white[3];
	        	white[3] = orange[0];
	        	orange[0] = temp;
	            //swap(yellow[3],orange[2]);
	        	temp = yellow[3];
	        	yellow[3] = orange[2];
	        	orange[2] = temp;
	            //swap(yellow[4],orange[1]);
	        	temp = yellow[4];
	        	yellow[4] = orange[1];
	        	orange[1] = temp;
	            //swap(yellow[5],orange[0]);
	        	temp = yellow[5];
	        	yellow[5] = orange[0];
	        	orange[0] = temp;
	            //swap(yellow[3],red[6]);
	        	temp = yellow[3];
	        	yellow[3] = red[6];
	        	red[6] = temp;
	            //swap(yellow[4],red[5]);
	        	temp = yellow[4];
	        	yellow[4] = red[5];
	        	red[5] = temp;
	            //swap(yellow[5],red[4]);
	        	temp = yellow[5];
	        	yellow[5] = red[4];
	        	red[4] = temp;
	       
	        }
	       else if(move == 'R'){
	    	    char temp;
	            //swap(blue[1],blue[7]);
	    	     temp = blue[1];
	        	 blue[1] = blue[7];
	        	 blue[7] = temp;
	            //swap(blue[2],blue[6]);
	        	 temp = blue[2];
		         blue[2] = blue[6];
		         blue[6] = temp;
	            //swap(blue[5],blue[3]);
		         temp = blue[5];
		         blue[5] = blue[3];
		         blue[3] = temp;
	            //swap(blue[2],blue[0]);
		         temp = blue[2];
		         blue[2] = blue[0];
		         blue[0] = temp;
	            //swap(blue[7],blue[3]);
		         temp = blue[7];
		         blue[7] = blue[3];
		         blue[3] = temp;
	            //swap(blue[6],blue[4]);
		         temp = blue[6];
		         blue[6] = blue[4];
		         blue[4] = temp;
	   
	            //swap(yellow[1],orange[4]);
		         temp = yellow[1];
		         yellow[1] = orange[4];
		         orange[4] = temp;
	            //swap(yellow[0],orange[5]);
		         temp = yellow[0];
		         yellow[0] = orange[5];
		         orange[5] = temp;
	            //swap(yellow[7],orange[6]);
		         temp = yellow[7];
		         yellow[7] = orange[6];
		         orange[6] = temp;
	            //swap(white[7],orange[4]); 
		         temp = white[7];
		         white[7] = orange[4];
		         orange[4] = temp;
	            //swap(white[0],orange[5]);
		         temp = white[0];
		         white[0] = orange[5];
		         orange[5] = temp;
	            //swap(white[1],orange[6]);
		         temp = white[1];
		         white[1] = orange[6];
		         orange[6] = temp;
	            //swap(white[7],red[0]);
		         temp = white[7];
		         white[7] = red[0];
		         red[0] = temp;
	            //swap(white[0],red[1]);
		         temp = white[0];
		         white[0] = red[1];
		         red[1] = temp;
	            //swap(white[1],red[2]);
		         temp = white[1];
		         white[1] = red[2];
		         red[2] = temp;
	        }
	       
	       
	       
	        }
	       
	   
	   
	   
	    public static void main(String []ARGS){
	   
	    

	    rotate('R');

	    display(white);
	    display(yellow);
	    display(green);
	    display(blue);
	    display(red);
	    display(orange);
	    
	    }

}
