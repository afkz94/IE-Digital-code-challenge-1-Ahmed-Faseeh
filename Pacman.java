/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;
import java.util.Scanner;
/**
 *
 * @author ahmee
 */
public class Pacman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            pacmanSimulator pac=new pacmanSimulator();
        pac.instruction();
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] tokens=input.split(" ");
        
        
        while(!tokens[0].equalsIgnoreCase("place"))
        {
            input=in.nextLine();
            tokens=input.split(" ");
            
        }
        
        do{
            if(tokens[0].equalsIgnoreCase("place"))
            {
                String[] position=tokens[1].split(",");
                pac.place(Integer.parseInt(position[0]), Integer.parseInt(position[1]), position[2]);
            }
            else if(tokens[0].equalsIgnoreCase("move"))
            {
                pac.move();
            }
            else if(tokens[0].equalsIgnoreCase("left"))
            {
                pac.left();
            }
            else if(tokens[0].equalsIgnoreCase("right"))
            {
                pac.right();
            }
            else if(tokens[0].equalsIgnoreCase("report"))
            {
                pac.report();
            }
            else
            {
               break; 
            }
            input=in.nextLine();
            tokens=input.split(" ");
            
        }while(true);
        
        
    }
  
}
    
    

