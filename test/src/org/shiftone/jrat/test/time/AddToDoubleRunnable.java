package org.shiftone.jrat.test.time;


/**
 * @author Jeff Drost
 * @version $Revision: 1.1 $
 */
public class AddToDoubleRunnable implements Runnable {
	private double d = 0.0d;

	public void run() {
		d += 1.1d;
	}

	public String toString() {
		return "add to a double";
	}

}