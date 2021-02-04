package source;
import java.util.ArrayList;

import source.Timer;
import java.util.Arrays;

public class Statistics {

public static double bestTime = 0;
public static double avgTime = 0;
public static double t = 999;
public static double[] times = new double[4];
public static double[] temp = new double[0];
public static int count = 0;
public static ArrayList<String> timeList = new ArrayList<String>();


public static double[] averages = new double[5];

public static double time = Timer.prevTime;



public static void main (String [] args) {
	
	
	if(time<t) bestTime = time;
	
	if(count == times.length-1) {
		newArray();
	}
	
	
	
	
	
}


public static void newArray() {
	
	int incrementLength = 1;
	for (int i = 0; i<times.length; i++) {
		temp = Arrays.copyOf(times, i + incrementLength);
	}
	
}



	
}

