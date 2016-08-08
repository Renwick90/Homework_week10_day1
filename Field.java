public class Field{
  private String name;
  private Buffalo[] livestock;

public Field(String name){
this.name = name;
this.livestock = new Buffalo[20];
}

public String getName(){
  return this.name;
}
}