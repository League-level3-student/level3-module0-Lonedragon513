package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] Bb = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < Bb.length; i++) {
			Bb[i]= new Robot();
			Bb[i].setSpeed(10000);
			Bb[i].miniaturize();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < Bb.length; i++) {
			Bb[i].setX(100);
			Bb[i].setY(200);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean isRacing=true;
		int FCYGVHBJB = 0;
		while (isRacing) {
		Random ran = new Random();
    	for (int i = 0; i < Bb.length; i++) {
		//	Bb[i].move(ran.nextInt(49)+1);
			for (int j = 0; j < ran.nextInt(49)+1; j++) {
				Bb[i].move(1);
				Bb[i].turn(1);
				if(Bb[i].getY()==200&&Bb[i].getX()==100) {
				isRacing=false;
				FCYGVHBJB=i+1;break;
			}
			}
			//if(Bb[i].getY()<0) {
			
    	}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//√
		//7. declare that robot the winner and throw it a party!
    	System.out.println("robot "+ FCYGVHBJB + " have won. yah.");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
