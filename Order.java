import java.util.ArrayList;

public class Order{
  private String name;
  private boolean ready;
  private ArrayList<Item> items;

  public Order(){
    this.name="Guest";
    items = new ArrayList<Item>();
  }
  
  public Order(String name){
    this.name=name;
    items = new ArrayList<Item>();
  }
}