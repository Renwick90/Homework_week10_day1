import java.util.*;

public class Field{
  private String name;
  // private Buffalo[] livestock;
  private ArrayList<Moveable> livestock;

public Field(String name){
this.name = name;
// this.livestock = new Buffalo[20];
  this.livestock = new ArrayList<Moveable>();

}

public String getName(){
  return this.name;
}

public int livestockCount(){
 return livestock.size();
}


public void takeBuffalo(Moveable animal){
livestock.add(animal);

}


}