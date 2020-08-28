package customermailapplication;

public class CustomerFactory {

    public static Customer createCustomer(String type){
        switch (type) {
            case "Delinquent":
                return new DelinquentCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Regular" :
                return new RegularCustomer();
            default:
                return null;
        }
    }

}