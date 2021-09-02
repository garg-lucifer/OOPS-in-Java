public class sample {
    public static void main(String[] args) throws Exception {

        // Polymorphism
        Vehicle car = new Cars("civic", "black", "1999", "honda", true, false);
        System.out.println(car.getName());

        Vehicle vehicle =  new Vehicle("civic", "black", "1999", "honda");
        System.out.println(vehicle.getName());

        Vehicle vehicle2 = new Vehicle();
        if(vehicle2 instanceof Cars){
            ((Cars)vehicle2).getLed();
        } else{
            System.out.println("Don't break the trust of compiler.");
        }

        Shape shape = new Circle();
        shape.draw();

        Rectangle2 shape2 = new Rectangle2();
        shape2.draw2();
        shape2.draw3();
    }
}


