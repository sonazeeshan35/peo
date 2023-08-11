/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package people;

/**
 *
 * @author sonaz
 */
public abstract class People implements Drivable, speakable, movable {
      abstract String getCategory();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// created a people class
// created the class named person,Parents,teachers,Childrens,Aunty

// added the objects related to the classes
        People Childrens = new Childrens();
        People teachers = new teachers();
        People person = new person();
        People Parents = new Parents();
        People Aunty = new Aunty();
 
        
        // added the category of the classes with override methods
        
        System.out.println("Categories:");
        System.out.println("Children: " + Childrens.getCategory());
        System.out.println("Teacher: " + teachers.getCategory());
        System.out.println("person: " + person.getCategory());
        System.out.println("Parent: " + Parents.getCategory());
        System.out.println("aunty: " + Aunty.getCategory());
        
        // usings methods to get and set
   Parents per1 = new Parents();
   //setting the name and age
   per1.setName("Ann");
   per1.setAge(30);
// get the name and age
   System.out.println(" Name : " + per1.getName() );
   System.out.println(" Age : " + per1.getName() );

    per1.Drivable("Drive a car.....");
    per1.speakable("Sing a song !!!!!");
   per1.movable("lets walk    ");
    }
    
}


// adding interfaces

	interface Drivable {
    void print(String message);
}

	interface speakable {
    void print(String message);
}
	interface movable {
    void print(String message);
}