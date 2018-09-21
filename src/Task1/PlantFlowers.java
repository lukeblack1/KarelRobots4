//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task1;

import becker.robots.*;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    /*
        City berlin = new City();
        Wall eWall = new Wall(berlin, 1,2, Direction.EAST);
        Wall nWall = new Wall(berlin, 1,2, Direction.NORTH);
        Wall wWall = new Wall(berlin, 1,2, Direction.WEST);
        Wall sWall = new Wall(berlin, 1,2, Direction.SOUTH);
      */
        Garden berlin = new Garden();
        berlin.buildWalls();
        
        Gardener karel = new Gardener(berlin,0,1,Direction.SOUTH,8);
        
     karel.move();
     karel.move();
     karel.turnLeft();
     karel.move();
     karel.move();
     karel.turnLeft();
     karel.move();
     karel.putThing();
     karel.move();
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     karel.move();
     
        //karel.plantFlowers();
        
    }
}

        
        
        
    
    

