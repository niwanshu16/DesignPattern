package DesignPattern.ChessValidator;

import java.util.Scanner;


public class Client {
    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        ChessValidator validator = new ChessValidator();

        validator.initializeBoard();
        int l = 0;
        
        while(true) {
            try {
                if(l == 0) 
                    System.out.println("User 1 Turn");
                else    
                    System.out.println("User 2 Turn");
                
                System.out.println("Enter -1 to Quit");

                int x = sc.nextInt();

                if(x == -1) {
                    System.out.println("FINISHING GAME");
                    sc.close();
                    break;
                }

                int y = sc.nextInt();
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                Integer out = validator.makeMove(validator.getPosition(x, y), validator.getPosition(x1,y1),l);
                if(out == 2) {
                    if(l == 0) {
                        System.out.println("User 1 Wins the Game");
                    }
                    else 
                        System.out.println("User 2 Wins the Game");
                    validator.printBoard();
                    break;
                }
                else if(out == 1){
                    l = 1 - l;
                }

                validator.printBoard(); 
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
} 