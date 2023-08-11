 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

/**
 *
 * @author sonaz
 */
public class teachers extends People {
    
         private String name;
         private String department;
// added getters and setters and constructors

    public teachers() {
    }

    public teachers(String name, String department) {
        this.name = name;
        this.department = department;
    }
         
        public String getName() {
        return name;
    }
            public String getdepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
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
