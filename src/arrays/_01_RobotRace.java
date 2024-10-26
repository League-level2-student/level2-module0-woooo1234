package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	

	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	Random rand = new Random();
    for(int i = 0; i<robots.length;i++) {
    	robots[i] = new Robot();
    	robots[i].setX(100 + 50*i);
    	robots[i].setY(400);
    	robots[i].setPenWidth(100);
    }
		//4. make each robot start at the bottom of the screen, side by side, facing up
    	
	//5. use another for loop to iterate through the array and make each robot move
    boolean unfinished = true;
    while(unfinished) {  	
    	for(int i = 0; i<robots.length;i++) {
    	robots[i].move(rand.nextInt(50));
    	if (robots[i].getY() < 0) {
    		unfinished = false;
    	}
    		
    		
    	}
    }
    System.out.println("The robot has won!");
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
