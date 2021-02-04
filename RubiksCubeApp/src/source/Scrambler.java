package source;

import java.util.Random;
 


public class Scrambler{
   
    private static char[] options = {'R','L','U','F','B','D','2'};
    
    public static char[] arr = new char[20];
   
    static String scramble;
    
    public static void main (String []args){
   
        createScramble();
        
    }
    public static char[] createScramble() {
    Random r = new Random();
 
    //char[] arr = new char[20];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = options[r.nextInt(options.length)];
    
        if(arr[0]=='2'){
   
        arr[0]='R';
    }
   
    for(int c = 0; c<arr.length-1; c++){
   
    if((arr[c] == 'R' && arr[c+1] == 'R') || (arr[c] == 'L' && arr[c+1] == 'L') || (arr[c] == 'U' && arr[c+1] == 'U') || (arr[c] == 'F' && arr[c+1] == 'F') || (arr[c] == 'B' && arr[c+1] == 'B') || (arr[c] == 'D' && arr[c+1] == 'D')) {
   
        arr[c+1] = '2';
    }
    if(arr[c] == '2' && arr[c+1] =='2') { arr[c+1] = 'B'; }
   
    }
   
   
    }
     
   
   //String[] scramble = new String[20];
    
    scramble = String.copyValueOf(arr);
    for(int i=0; i<arr.length; i++){
     
        //System.out.print(scramble);
       
    }
return arr;
}
    }

