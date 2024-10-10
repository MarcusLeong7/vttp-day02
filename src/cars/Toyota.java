package cars;

public class Toyota extends Car {

    private boolean gps = false;

    public Toyota() {
        setMake("Toyota");
    }

    // OVERRIDING - shadows the method
    // Method signature (name-go and type -int and boolean) is the same as the parents 
    @Override //annotation- telling java that I am overriding
    public void go(int d,boolean turbo) {
        this.fuel-=d;
    }

    @Override // ensure toyota stays as toyota
    public void setMake(String m) { }

    // For boolean the read is "is" instead of "get"
    public boolean isGps() {return gps;}
    public void setGps(boolean gps) {this.gps = gps;}
    
}
