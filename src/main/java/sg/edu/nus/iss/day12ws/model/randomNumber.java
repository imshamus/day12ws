package sg.edu.nus.iss.day12ws.model;

import java.util.Random;

public class randomNumber 
{
    private int randInt;

    public randomNumber() {
        
        Random rand = new Random();
         // int randInt = rand.nextInt(max - min + 1) + min
        this.randInt = rand.nextInt(1, 31); // 1 is inclusive, 31 is exclusive
    }

    public int getRandInt() {
        return randInt;
    }

    // public void setRandInt(int randInt) {
    //     this.randInt = randInt;
    // }
}
