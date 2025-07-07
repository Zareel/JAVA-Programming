
public class SmartAppliance{
   public  String applianceName;
   public  String applianceType;
   public String powerStatus;

      public SmartAppliance setApplianceName(String applianceName){
       this.applianceName = applianceName;
       return this;
   }

   public SmartAppliance setApplianceType(String applianceType){
       this.applianceType = applianceType;
       return this;
   }

   public SmartAppliance setPowerStatus(String powerStatus){
       this.powerStatus = powerStatus;
       return this;
   }


    // SmartAppliance class has three fields. 

    public SmartAppliance(String applianceName, String applianceType, String powerStatus){
        this.applianceName = applianceName;
        this.applianceType = applianceType;
        this.powerStatus = powerStatus;
    }
    // then we have the constructors where we use the parameters and use this keyword to set the value of the smartAppliance

    public void displayDetails(){
        System.out.println("Appliance name: " + applianceName);
        System.out.println("Appliance type: " + applianceType);
        System.out.println("Appliance power status: " + powerStatus);

    //  method that takes care of diplaying the details
    }

    public SmartAppliance getInstance(){
    return this;
    // here is a method that will get us the instance of current class the method on
    // to understand what this instance is, move on to the main class
}

}

