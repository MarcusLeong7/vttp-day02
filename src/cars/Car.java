package cars;

public class Car {

    //Members of the class
    //Protected - myself and decesdents can access
    protected String make;
    protected String owner;
    protected String colour;
    protected int fuel = 100;

    //Constructor takes the name of the class
    //Do not put void, if void is placed, it becomes a method
    public Car() {
        this.colour = "silver";
        this.make = "honda";
    }
    public Car(String m) {
        this.make = m;
    }
    public Car(String m,String c) {
        this.make = m;
        this.colour = c;
    }


    // Getters and setters to make property
    //ENCAPSULATION

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}


    public String getOwner() {return owner;}
    public void setOwner(String owner) {this.owner = owner;}


    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}


    // Methods - behaviours
    // Overloaded Method - Name has to be the same but different parameter types
    public void go() {
        this.go(1,false);
        // go(1,false)
        // this.fuel--;
    }

    public void go(String distance) {
        this.go(Integer.parseInt(distance),false);
    }

    public void go(int distance) {
        // go(distance,false)
        // this.fuel -= distance;
        this.go(distance,false);
    }

    public void go(int distance,boolean turbo) {
        if (turbo)
            this.fuel -= 2;
        this.fuel -= distance;
    }
    
    public void accelerate(int acc) {
        for (int i = 0; i < acc; i++)
            go(i + 1);
    }
    public void fuelGauge() {
        System.out.printf("FUEL:%d\n", this.fuel);
    }

    // \n for new line
    public void info() {
        System.out.printf("make: %s, Owner: %s\n", this.make, this.owner, this.colour);

    }


    

   

    
}
