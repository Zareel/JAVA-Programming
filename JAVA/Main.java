public class Main {
    public static void main(String[] args) {

        //? Person
        /* 
        Person user1 = new Person();
        user1.name = "Shon";
        user1.age = 20;
       */

       //? SmartAppliance
      
       SmartAppliance appliance1 = new SmartAppliance("Air conditioner", "cooling", "On");

// we are creating a new instance
        SmartAppliance appliance2  = appliance1.getInstance();
        //appliance2.applianceName = "Air con2";
        appliance2.displayDetails();
        System.out.println("------------------------------------------");
// here we are creating a reference to the other object
        SmartAppliance appliance3 = appliance1;
        appliance3.setApplianceName("Air con3");
        appliance3.displayDetails();
        System.out.println("------------------------------------------");

        appliance1.setApplianceName("Set Air condition").setApplianceType("Cooling mooling").setPowerStatus("Off");
        appliance1.displayDetails();

        

      


       







    }
    
}
