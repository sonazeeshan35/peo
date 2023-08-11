/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author sonaz
 */
public class person extends People  {
    // adding super class
    private String Name;
    private int age;
// added getters and setters and constructors
    public person(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    person() {
    }
    
      public String getName() {
        return Name;
    }
      public int getAge() {
        return age;
    }
      
         public void setName(String name) {
        this.Name = name;
    }
      
        public void setAge(int age) {
        this.age = age;
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
    String getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void print(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
