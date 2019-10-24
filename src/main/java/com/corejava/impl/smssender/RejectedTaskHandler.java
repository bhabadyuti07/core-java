/**
 * 
 */
package com.corejava.impl.smssender;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Bhabadyuti Bal
 *
 */
public class RejectedTaskHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		//logic to collect all rejected tasks and re process it
		System.out.printf("RejectedTaskHandler: The %s task has been rejected",r.toString());
	}

}
