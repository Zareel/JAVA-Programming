public class Main {
    public static void main(String[] args) {
        Person user1 = new Person();
        user1.name = "Shon";
        user1.age = 20;
       
        SmartAppliance appliance1 = new SmartAppliance("Air Conditioner", "Cooling", "On");

        SmartAppliance appliance2 = appliance1.getInstance();

        SmartAppliance appliance3 = appliance1;

        appliance2.applianceName = "Air con 2";
        appliance2.displayDetails();
        System.out.println("--------------------------------------------");
        appliance3.applianceType = "Air con 3";
        appliance3.displayDetails();
        System.out.println("-------------------------------------------------");
        appliance1.displayDetails();

           





    }
    
}
