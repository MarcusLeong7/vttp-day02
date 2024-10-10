package cars;

public class MainToyota {
    
    public static void main(String[] args) {
        
        Toyota camry = new Toyota();

        camry.info();
        System.out.printf(">>> has GPS: %b\n", camry.isGps());
        
        camry.fuelGauge();
        camry.go(5,true);
        camry.fuelGauge();
        camry.go(7,false);
        camry.fuelGauge();

        Car myCar = new Toyota();
        Fiat fiat = new Fiat();
        
        // How do you know what is this??
        CarWorkshop workshop = new CarWorkshop();
        workshop.service(myCar);

        workshop.service(camry);
        workshop.service(fiat);


    }
}
