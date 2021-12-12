import java.util.Objects;



    public class Car {
        private String model;
        private int year;
        private  int rozhid;

        public Car(String model, int year, int rozhid) {
            this.model = model;
            this.year = year;
            this.rozhid = rozhid;
        }

        public int hashCode(){
            return Objects.hash(model, year , rozhid);

        }

        public static void main(String[] args) {
            Car lamborghini = new Car("Lamborghini", 2020 , 15);
            Car lamborghini1 = new Car("Lamborghini", 2020, 15);
            Car ferrari = new Car("Ferrari", 2020 , 14);
            Car ferrari1 = new Car("Ferrari", 2020, 13);
            Car bugatti = new Car("Bugatti", 2020, 16);
            Car bugatti1 = new Car("Bugatti", 2020,16);
            System.out.println(ferrari.hashCode() == ferrari.hashCode());
            System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
            System.out.println(ferrari.hashCode() == ferrari1.hashCode());
            System.out.println(bugatti.hashCode() == bugatti1.hashCode());
            System.out.println(bugatti.hashCode() == lamborghini.hashCode());
            System.out.println(lamborghini.hashCode() == ferrari.hashCode());
        }
    }


