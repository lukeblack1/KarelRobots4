
package Task1;

import becker.robots.*;

public class Garden extends City
{
 public Garden()
 {
     super();
 }
 
 public void buildWalls()
 {
     Wall eWall = new Wall(this,1,2,Direction.EAST);
     Wall nWall = new Wall(this,1,2,Direction.NORTH);
     Wall wWall = new Wall(this,1,2,Direction.WEST);
     Wall sWall = new Wall(this,1,2,Direction.SOUTH);
     
     //Wall 2
     Wall fWall = new Wall(this,1,8,Direction.EAST);
     
     
     Wall abWall = new Wall(this,1,4,Direction.NORTH);
     Wall acWall = new Wall(this,1,5,Direction.NORTH);
     Wall adWall = new Wall(this,1,6,Direction.NORTH);
     Wall aeWall = new Wall(this,1,7,Direction.NORTH);
     Wall afWall = new Wall(this,1,8,Direction.NORTH);
     
     
     
     Wall hWall = new Wall(this,1,4,Direction.WEST);
     
     Wall baWall = new Wall(this,1,4,Direction.SOUTH);
     Wall bcWall = new Wall(this,1,5,Direction.SOUTH);
     Wall bdWall = new Wall(this,1,6,Direction.SOUTH);
     Wall beWall = new Wall(this,1,7,Direction.SOUTH);
     Wall bfWall = new Wall(this,1,8,Direction.SOUTH);
     
     
 }
}
