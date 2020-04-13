//import the Scanner class used for user input
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        //make instances
        Human h = new Human("John", "X");
        Computer c = new Computer("O");
        Scanner sc =  new Scanner(System.in);
        Board b = new Board();


        //game loop
        System.out.println("Connect 4");
        b.displayBoard();
        System.out.println("You are X's! Connect four of your pieces horizontally, vertically, or diagonally to win.");

        while(!b.checkWin(c.token)) { //check for computer win

            //set up vars
            boolean legalCol = false;
            int moveCol = -1;

            //user turn loop
            while(!legalCol) {

                System.out.println("Enter column to move:");

                //hasNextInt will return true if user input is an int
                if(sc.hasNextInt()) {
                    moveCol = sc.nextInt()-1;
                    legalCol = true;

                    if(moveCol < 0) {
                        System.out.println("Enter a legal column (integer between 1 and 8)!");
                        legalCol = false;
                        sc.next();
                    }

                    if(moveCol >= 8) {
                        System.out.println("Enter a legal column (integer between 1 and 8)!");
                        legalCol = false;
                        sc.next();
                    }

                    if(moveCol < 8 && moveCol > 0 && !b.colHasRoom(moveCol)){
                        System.out.println("Column is full");
                        legalCol = false;
                        sc.next();
                    }
                } else {
                    System.out.println("Enter a legal column (integer between 1 and 8)!");
                    sc.next(); //very important, resets the input from the "bad" one
                }

                if(legalCol && b.colHasRoom(moveCol)) {
                    b.makeMove(moveCol,h.token);
                }
            } //end of inner loop

            //check for human win
            if(b.checkWin(h.token)) {
                b.displayBoard();
                break;
            }

            //computer move
            int cMove = c.determineMove(b, h.token);
            b.makeMove(cMove,c.token);

            //all done moving, display and repeat
            b.displayBoard();

            //check for draw
            if(!b.checkWin(c.token) && !b.colHasRoom(0) && !b.colHasRoom(1)
                    && !b.colHasRoom(2) && !b.colHasRoom(3) && !b.colHasRoom(4)
                    && !b.colHasRoom(5) && !b.colHasRoom(6) && !b.colHasRoom(7)) {
                break;
            }
        } //end turn while loop
        if(b.checkWin(c.token)) {
            System.out.print("Game Over! You lose!");
        }
        if(b.checkWin(h.token)) {
            System.out.print("You win!");
        }
        if(!b.checkWin(c.token) && !b.checkWin(h.token)) {
            System.out.print("No winner! Cat's game!");
        }
    }
}