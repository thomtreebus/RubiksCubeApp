package source;

import java.awt.List;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;

import source.writeToFile;

public class Timer {

	public static ArrayList<String> timeList = new ArrayList<String>();
	//public static ArrayList<double[]> times = new ArrayList<double[]>();
	public static double[] times = new double [100];
	public static double[] averages = new double[50];
	public static double prevTime;
	public static String timeDisplay;
	public static double bt = 99;
	public static String bestTime;
	public static double avgTime = 0;
	public static double bestAvg;
	public static int count = 0;
	public static int c = 0;
	public static double sum = 0;
	public static double rounded;
	
    private static boolean running;
    private static long start;
    private static long end;
    public static String time;
    
    public void StopWatch() {
        this.start = 0;
        this.end = 0;
    }
 
    public static boolean isRunning() {
        return running;
    }

    public void start() {
        start = System.nanoTime();
        //running = true;
    }
    

    
    
    @SuppressWarnings("unlikely-arg-type")
	public static void stop() {
        
    	if (!isRunning()) {
            end = System.nanoTime();
            running = false;
        }
    	
    	
    	long elapsedTime = end - start;
    	double temp = (double)elapsedTime;
    	temp = temp/1000000000.0;
    	
    	BigDecimal bd = new BigDecimal(temp);
    	bd = bd.round(new MathContext(3));
    	
    	rounded = bd.doubleValue();
    	timeDisplay = String.valueOf(rounded);

    	//add the previous times to the array list
    	time = String.valueOf(rounded);
    	timeList.add(time);
    	
    	//add the previous time to the array
    	times[count] = rounded;	
    	
    	//calculate best time
    	if(times[count] < bt){
    		bt = times[count];
    		bestTime = String.valueOf(bt);
    	}
    	//calculate average
    	if(count <=4) {
    		sum=sum+rounded;
    	}else if (count>5) {
    		sum = sum-times[c];
    		sum = sum+rounded;
    		c=c+1;
    	}
    	//calculate fastest average
    	count = count +1;
    	if(count >=5) {
    		avgTime = sum/5;

    		
    		BigDecimal temp1 = new BigDecimal(avgTime);
    		temp1= temp1.round(new MathContext(3));
    		avgTime = temp1.doubleValue();
    		averages[c]=avgTime;
    		
    	}
    	if(c>=1) {
    	if(avgTime <=averages[c-1]) bestAvg = avgTime;
    	}
    	c=c+1;
    	System.out.println("best time: " + bt);
    	System.out.println("count: " + count);

    	for(int i=0; i<20; i++) {
    		times[i]=timeList.indexOf(i);
    		//System.out.println(times[i]);
    	}
    		
    	}	
    	
    	
    	
    
    
    public long elapsed() {
        if (isRunning()) {
            return (System.nanoTime() - start);
        } else
            return (end - start);
    }

    public String toString() {
        long enlapsed = elapsed();
        return ((double) enlapsed / 1000000000.0) + " Seconds";
    }

	
}
