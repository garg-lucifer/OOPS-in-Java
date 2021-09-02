// inheriting the vehicle class
public class Cars extends Vehicle {
        private boolean steering;
        private boolean led;

        public Cars(String name, String color, String model, String company, boolean steering, boolean led){
            super(name, color, model, company);
            this.steering = steering;
            this.led = led;
        }
        
        // overriding
        @Override
        public String getName(){
           return "Name of the car is : " + super.getName();
        }

        public void setSteering(boolean val){
            this.steering = val;
        }

        public void setLed(boolean val){
            this.led = val;
        }

        public boolean getSteering(){
            return this.steering;
        }

        public boolean getLed(){
            return this.led;
        }
}
