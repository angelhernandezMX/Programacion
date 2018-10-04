public class Dog{
  //Properties or attributes
  public String color;
  public String eyeColor;
  public Double height;
  public Double length;
  public Double weight;

  //Methods o behaviors
  public String sit(){
    return "Estoy sentado";
    //System.out.println("Estoy Sentado");
  }
  public  void bark(){
    System.out.println("Wauff Wauff");
  }
  public void layDown(String datos){
    System.out.println(datos + " Estoy recostado");
  }
  public void eat(){
    System.out.println("I´m eating");
  }
  public void sleep(){
    System.out.println("Zzzzzz......");
  }
}
