package com.company;
/*
 * Program to simulate the following experiment. You have 100 closed lockers.
 * Start with the first locker and for every locker open it. Now, starting with the second locker, for this locker and
 * every second locker after that, if the locker is open, close it; if it is closed, open it. Then, starting with the
 * third locker, for this locker and every third locker after that, if the locker is open, close it; if it is closed,
 * open it. Continue with the nth locker changing the “position” of every nth locker until n = 100.
 * Program prints out the locker numbers that remain open.
 * What do you notice about the lockers that remain open?
 * All the squares i.e. 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 remain open hence it follows a pattern
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Locker[] locker = new Locker[100+1];

        for(int i = 0; i <= 100; i++) {
            locker[i] = new Locker();
            locker[i].setisClose();
        }
        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(j%i == 0) {
                    if((locker[j].getisOpen()))
                        locker[j].setisClose();
                    else
                        locker[j].setisOpen();
                }
            }
        }
        //Print out the lockers that remain open
        for(int i = 1; i <= 100; i++) {
            if((locker[i].getisOpen()))
                System.out.println("" +i +locker[i].displayOpenLocker());
        }

    }

}
