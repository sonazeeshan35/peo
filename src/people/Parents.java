/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author sonaz
 */
public class Parents extends People {

    @Override
    String getCategory() {
        return "Parents";
    }
    
     private String name;
    private int age;
// added getters and setters and constructors

    public Parents() {
    }

    public Parents(String name, int age) {
        this.name = name;
        this.age = age;
    }

  public String getName() {
        return name;
    }
      public int getAge() {
        return age;
    }    
    
        public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
        //adding implements methods
    public void Drivable(String message) {
        System.out.println("Drive : " + message);
    }
     public void speakable(String message) {
        System.out.println("Displaying: " + message);
    }
 public void movable(String message) {
        System.out.println("Drive : " + message);
    }  

    @Override
    public void print(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
