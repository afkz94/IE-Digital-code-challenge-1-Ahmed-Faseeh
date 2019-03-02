/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

/**
 *
 * @author ahmee
 */
public class pacmanSimulator {
    public int x;
    public int y;
    public String face;
    
    public pacmanSimulator()
    {   
    }
    
    public void instruction()
    {
        System.out.println("Please enter one of the following commands:");
        System.out.println("1.Place [X],[Y],[Facing]");
        System.out.println("2.Move");
        System.out.println("3.Left");
        System.out.println("4.Right");
        System.out.println("5.Report");
    }
    
    public void move()
    {
       if(face.equalsIgnoreCase("north"))
       {
           if(y>=0 && y<=3)
           {
               y++;
           }
       }
       
       else if(face.equalsIgnoreCase("south"))
       {
           if(y>0 && y<=4)
               y--;
       }
       else if(face.equalsIgnoreCase("east"))
       {
           if(x>=0 && x<=3)
           {
               x++;
           }
       }
       else if(face.equalsIgnoreCase("west"))
       {
           if(x>0 && x<=4)
               x--;
       }
       else
       {}
        
    }
    
    public void place(int a, int b, String Face)
    {
		if((a>=0 && a<=4) &&(b>=0 && b<=4) &&
           (Face.equalsIgnoreCase("North") || Face.equalsIgnoreCase("east")||
            Face.equalsIgnoreCase("west") || Face.equalsIgnoreCase("south")  ))
		{
            x=a;
            y=b;
            face=Face;
		}
		else
		{
			
		}
    }
    
    public void left()
    {
       if(face.equalsIgnoreCase("west"))
       {
           face="South";
       }
       else if(face.equalsIgnoreCase("South"))
       {
         face="East";  
       }
       else if(face.equalsIgnoreCase("East"))
       {
           face="North";
           
       }
       else
       {
           face="West";
       }
    }
    
    public void right()
    {
        if(face.equalsIgnoreCase("west"))
       {
           face="North";
       }
       else if(face.equalsIgnoreCase("South"))
       {
         face="West";  
       }
       else if(face.equalsIgnoreCase("East"))
       {
           face="South";
           
       }
       else
       {
           face="East";
       }
    }
    
    public void report()
    {
        System.out.println();
        System.out.print(x);
        System.out.print(","+y);
        System.out.print(","+face);
        System.out.println();
    }
    
}
