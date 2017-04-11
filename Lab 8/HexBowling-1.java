import java.util.Scanner;	/* Hint: You'll need this for getNumGames() and getNumFrames() */

public class HexBowling {
    /**
     * Main method. Do not modify it, but instead implement the functions that is uses:
     * TODO: Implement playGame()
     * TODO: Implement getNumGames()
     * TODO: Implement getNumFrames()
     * TODO: Implement getFrameScore()
     */
    public static void main(String[] args){
        /* Print the program greeting */
        System.out.println("WELCOME TO HEXBOWLING!!!!");

        /* Get the number of games to play */
        int numberOfGames = getNumGames();

        /* Get the number of frames that each game will have */
        int numberOfFrames = getNumFrames();

        /* Call playGame the specified number of times, each game consisting of the specified number of frames */
        for(int gameNumber = 1; (gameNumber <= numberOfGames); gameNumber++){
            System.out.println("Game " + gameNumber + " Results:");
            playGame(numberOfFrames);
     
        }

        /* Print the goodbye message */
        System.out.println("What a Day! Thanks for Playing!");
    }

    /**
     * playGame():
     * Simulates a Hexbowling game of a given number of frames.
     *
     * Should print each of the game's frames as a single line.
     * For example, this is a possible result from calling playGame(4):
     *
     *      Frame 1	|	E00 	|	Omg.. a gutter
     *      Frame 2	|	D20 	|	Nice Spare!
     *      Frame 3	|	420 	|
     *      Frame 4	|	F00 	|	WAAAHOOO what a Strike!
     *
     * Makes use of getFrameScore() and getFrameComment() to make the second and third column of each frame's printout
     *
     * @param numFrames     number of frames that the game will consist of
     * @return              void. No return type, it just prints the game results as shown above.  */
    private static void playGame(int numFrames){
    	 for(int j = 0; j<numFrames; j++ ){  
    		 String getScore = getFrameScore();
    	 System.out.println("Frame" + (j+1) + "|" + getFrameScore() + "|" + getFrameComment(getScore)); 
    		 }
    	 }


    /**
     * getNumGames():
     * Prompts the user to input the number of games they wish to simulate.
     * Uses a locally-declared and locally-initialized Scanner object to read user input from System.in.
     * Returns the number the user inputs. Does not do any input validation.
     *
     * @return     the number input by the user
     */
    private static int getNumGames(){
		/* Get first input: Number of games to be played */
    	Scanner input= new Scanner(System.in); 
       	System.out.println("Enter the number of games: ");
    	int numGames = input.nextInt(); 
    	
    	return numGames; 

    }

    /**
     * getNumFrames():
     * Prompts the user to input the number of frames they wish for each game to have.
     * Uses a locally-declared and locally-initialized Scanner object to read user input from System.in.
     * Returns the number the user inputs. Does not do any input validation.
     *
     * @return     the number input by the user
     */
    private static int getNumFrames(){
		/* Get second input: Number of frames per game */
    	Scanner input= new Scanner(System.in); 
    	System.out.println("Enter the number of frames: ");
    	int numFrames= input.nextInt(); 
    	return numFrames; 
    }


    /**
     * getFrameScore():
     * Randomly generates and returns a randomly-generated 3-hex-digit score as specified in Lab 6.
     *
     * @return      a string such as "D20", "F00", or "E02", as per the Lab 6 specifications
     */
    private static String getFrameScore(){
    	  	int pins = 15;
    	    int throw1 = (int)( Math.random()*pins);
    	    int pinsOne = pins - throw1;
    	    int throw2 = (int)( Math.random()*pinsOne);
    	    int pinsTwo = pinsOne - throw2;
    	    int throw3 = (int)( Math.random()*pinsTwo);

    	    double frameScore = throw1 + throw2;
    	    
    	    if (frameScore < 15){
    	        throw3 = (int)( Math.random()*16);
    	    	}
    	    
    	    double frameScore2 = throw1 + throw2 + throw3;
    	   
    	    if(frameScore2 > 15){
    	    	double totalPins = 15;
    	    } 
    	    
    	    String throwOne = "throwOne";
    	   
    	    switch(throw1){
    	    
    	    case 0 : throwOne = "0";break;
    	    
    	    case 1 : throwOne = "1";break;
    	    
    	    case 2 : throwOne = "2";break;
    	    
    	    case 3 : throwOne = "3";break;
    	    
    	    case 4 : throwOne = "4";break;
    	    
    	    case 5 : throwOne = "5";break;
    	    
    	    case 6 : throwOne = "6";break;
    	    
    	    case 7 : throwOne = "7";break;
    	    
    	    case 8 : throwOne = "8";break;
    	    
    	    case 9 : throwOne = "9";break;
    	    
    	    case 10: throwOne = "A";break;
    	   
    	    case 11: throwOne = "B";break;
    	    
    	    case 12 : throwOne = "C";break;
    	    
    	    case 13 : throwOne = "D";break;
    	    
    	    case 14 : throwOne = "E";break;
    	    
    	    case 15 : throwOne = "F";break;
    	    
    	    }

    	    String throwTwo = "throwTwo";
    	    
    	    switch(throw2){
    	    
    	    case 0 : throwTwo = "0";break;
    	    
    	    case 1 : throwTwo = "1";break;
    	    
    	    case 2 : throwTwo = "2";break;
    	    
    	    case 3 : throwTwo = "3";break;
    	    
    	    case 4 : throwTwo = "4";break;
    	    
    	    case 5 : throwTwo = "5";break;
    	    
    	    case 6 : throwTwo = "6";break;
    	    
    	    case 7 : throwTwo = "7";break;
    	    
    	    case 8 : throwTwo = "8";break;
    	    
    	    case 9 : throwTwo = "9";break;
    	    
    	    case 10: throwTwo = "A";break;
    	   
    	    case 11: throwTwo = "B";break;
    	    
    	    case 12 : throwTwo = "C";break;
    	    
    	    case 13 : throwTwo = "D";break;
    	    
    	    case 14 : throwTwo = "E";break;
    	    
    	    case 15 : throwTwo = "F";break;
    	    
    	    }

    	 String throwThree = "throwThree";
    	    
    	    switch(throw3){
    	    
    	    case 0 : throwThree = "0";break;
    	    
    	    case 1 : throwThree = "1";break;
    	    
    	    case 2 : throwThree = "2";break;
    	    
    	    case 3 : throwThree = "3";break;
    	    
    	    case 4 : throwThree = "4";break;
    	    
    	    case 5 : throwThree = "5";break;
    	    
    	    case 6 : throwThree = "6";break;
    	    
    	    case 7 : throwThree = "7";break;
    	    
    	    case 8 : throwThree = "8";break;
    	    
    	    case 9 : throwThree = "9";break;
    	    
    	    case 10: throwThree = "A";break;
    	   
    	    case 11: throwThree = "B";break;
    	    
    	    case 12 : throwThree = "C";break;
    	    
    	    case 13 : throwThree = "D";break;
    	    
    	    case 14 : throwThree = "E";break;
    	    
    	    case 15 : throwThree = "F";break;
    	    
    	    
    	    }
//    	    int frame1Total = throw1 + throw2 + throw3;
    	    
    	    return  throwOne + throwTwo + throwThree; 
    }

    /**
     * Freebie!
     * getFrameComment():
     * Takes in a 3-hex-digit frame score as a String and determines what comment it should go with.
     * @see getFrameScore()
     *
     * @return      a randomly-generated String such as "D20", "F00", or "E02", as per the Lab 6 specifications
     */
    private static String getFrameComment(String score){
        int throw1 = Integer.parseInt(""+score.charAt(0),16);
        int throw2 = Integer.parseInt(""+score.charAt(1),16);
        int throw3 = Integer.parseInt(""+score.charAt(2),16);

        if(throw1 == 15)
            return ("WAAAHOOO what a Strike!");
        else if(throw1 + throw2 + throw3 == 15)
            return ("Nice Spare!");
        else if(throw1 == 0 || throw2 == 0 || throw3 == 0)
            return ("Omg.. a gutter");
        else return "";
    }
}