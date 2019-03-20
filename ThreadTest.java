/**
 * 
 */
package com.list.bean;

/**
 * @author e075269
 *
 */
public class ThreadTest extends Thread {

	public void run(){
		
		System.out.println(Thread.currentThread().getId() + " - " + Thread.currentThread().getName() + " executing.");
	}
}
