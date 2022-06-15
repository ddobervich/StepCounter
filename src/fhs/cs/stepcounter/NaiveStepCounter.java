package fhs.cs.stepcounter;

import fhs.cs.stepcounter.dataexplorer.CSVData;
import fhs.cs.stepcounter.interfaces.StepCounter;

public class NaiveStepCounter implements StepCounter {


	/***
	 * Return the number of steps represented by the data in CSVData object.
	 * 
	 * @param data
	 *            a CSVData object which is a wrapper for the raw sensor data.
	 *            Extract the specific data you want using the
	 *            .getDataForColumns method. You can specify column names to get
	 *            a 2d array of the data.
	 * @return the number of steps represented by the data. 
	 */
	@Override
	public int countSteps(CSVData data) {
		int steps = 0;
		double[][] accels = data.getDataForColumns(new String[] { "x acc", "y acc", "z acc" });

		/* you implement this section */

		return steps;
	}

	/***
	 * Calculate the magnitude for a vector with x, y, and z components.
	 * 
	 * @param x
	 *            the x component
	 * @param y
	 *            the y component
	 * @param z
	 *            the z component
	 * @return the magnitude of the vector
	 */
	public static double calculateMagnitude(double x, double y, double z) {
		return 0.0;
	}

	/***
	 * Takes a 2d array with 3 columns representing the 3 axes of a sensor.
	 * Calculates the magnitude of the vector represented by each row. Returns a
	 * new array with the same number of rows where each element contains this
	 * magnitude.
	 * 
	 * @param accelData
	 *            2d array of 3 axis acceleration data. Column 0 is x, column 1
	 *            is y, column 2 is z
	 * 
	 * @return an array with n rows and each element is the magnitude of the
	 *         vector for the corresponding row in the sensorData array
	 */
	private static double[] calculateMagnitudesFor(double[][] accelData) {

		return null;
	}

	/***
	 * Return the standard deviation of the data.
	 * 
	 * @param arr
	 *            the array of the data
	 * @param mean
	 *            the mean of the data (must be pre-calculated).
	 * @return the standard deviation of the data.
	 */
	private static double calculateStandardDeviation(double[] arr, double mean) {
		return 0.0;
	}

	/***
	 * Return the mean of the data in the array
	 * 
	 * @param arr
	 *            the array of values
	 * @return the mean of the data
	 */
	private static double calculateMean(double[] arr) {
		return 0.0;
	}

}