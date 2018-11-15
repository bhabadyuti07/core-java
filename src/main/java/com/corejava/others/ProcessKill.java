/**
 * 
 */
package com.corejava.others;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Bhabadyuti Bal
 *
 */
public class ProcessKill {
	
	
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /F /IM ";

	public static boolean isProcessRunning(String serviceName) throws Exception {

	 Process p = Runtime.getRuntime().exec(TASKLIST);
	 BufferedReader reader = new BufferedReader(new InputStreamReader(
	   p.getInputStream()));
	 String line;
	 while ((line = reader.readLine()) != null) {

	  System.out.println(line);
	  if (line.contains(serviceName)) {
	   return true;
	  }
	 }

	 return false;

	}

	public static void killProcess(String serviceName) throws Exception {

	  Runtime.getRuntime().exec(KILL + serviceName);

	 }
	
	public static void main(String args[]) throws Exception {
		 String processName = "OUTLOOK.EXE";

		 //System.out.print(isProcessRunning(processName));

		 if (isProcessRunning(processName)) {

		  killProcess(processName);
		 }
		}

}
