package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnReverseStringNoNUm {
	public static void main(String[] args) {
		//Input - Test123it34all45
		//Output - tset123ti34lla45
		 String input = "Test123it34all45"; //Expected output:tset123ti34lla45 
	        String output="";                              
	        String finalOutput = "";
	     
	        boolean isEndsWithChar = false;
	        for(int i=0;i<input.length();i++){
	            if(Character.isAlphabetic(input.charAt(i))){
	                output = input.charAt(i) + output;
	                isEndsWithChar = true;
	            } else{
	                finalOutput = finalOutput + output + input.charAt(i);
	                output ="";
	            }
	        }

	        if(isEndsWithChar){
	            finalOutput = finalOutput + output;
	        }
	        System.out.println(finalOutput);
		}
				
		

	}


