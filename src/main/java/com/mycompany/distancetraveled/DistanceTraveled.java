/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distancetraveled;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */


public class DistanceTraveled {

    public static void main(String[] args) 
    {
        // define keyboard object
        Scanner keyboard = new Scanner(System.in);
        
        // variables
        int speed;  // speed vehicle traveled in miles per hour
        int hours;  // hours vehicle traveled
        int distance;   // distance vehicle traveled
        
        // ask user for speed of vehicle in miles per hour
        System.out.println("What was the speed of your vehicle in miles per hour?");
        
        // read user's response for speed of vehicle
        speed = keyboard.nextInt();
        
        // speed cannot be less than 0
        while (speed < 0)
        {
        System.out.println("Please enter a speed greater than or equal to 0, Orlando Marin.");
        speed = keyboard.nextInt();
        }
        
        // ask user for number of hours vehicle has traveled
        System.out.println("How many hours did you travel?");
        
        // read user's response for number of hours traveled
        hours = keyboard.nextInt();
        
        // number of hours traveled cannot be less than 1
        while (hours < 1) 
        {
        System.out.println("Please enter a number of hours traveled greater than or equal to 1, Orlando Marin.");
        hours = keyboard.nextInt();
        }
        
        // calculate distance traveled and use loop to display the distance a vehicle has traveled each hour
        for (int time = 1; time <= hours; time++)
        {
        distance = time * speed;
        System.out.printf("Hour: %,d  " + "Distance Traveled by Orlando Marin: %,d\n", time, distance);
        }    
    }
}
