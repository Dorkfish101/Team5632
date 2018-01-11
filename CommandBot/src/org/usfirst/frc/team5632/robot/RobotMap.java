package org.usfirst.frc.team5632.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	//PWM INPUTS
	public static int rightMaster = 0;
	public static int rightSlave = 1;
	public static int leftMaster = 2;
	public static int leftSlave = 3;
	public static Spark pwmSparkR = new Spark(rightMaster);
	public static Spark pwmSparkR2 = new Spark(rightSlave);
	public static Spark pwmSparkL = new Spark(leftMaster);
	public static Spark pwmSparkL2 = new Spark(leftSlave);
	
	//DIO
	public static int encoderLA = 0;
	public static int encoderRA = 1;
	public static int encoderLB = 2;
	public static int encoderRB = 3;
	public static Encoder leftEncoder = new Encoder(encoderLA,encoderLB, true);
	public static Encoder rightEncoder = new Encoder(encoderRA, encoderRB);
	
	
	

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
