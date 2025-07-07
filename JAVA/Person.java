public class Person {
    String name;
    int age;


    public Person setName(String name){
    this.name = name; // return the curent object for futher use
    return this;   
}
 public Person setAge(int age){
        this.age = age;
        return this; // returns the current object for further use
    }

    void display(){
        showDetails(this);
    }

   void showDetails(Person obj){
    System.out.println("Current Object: " + obj);
   }
}


