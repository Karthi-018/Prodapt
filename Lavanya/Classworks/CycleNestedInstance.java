public class CycleNestedInstance {
        class Tyre {
            void Details() {
                System.out.println("brand name " + brand);
                System.out.println("brand color " + color);
            }
    }
        String brand= "LadyBird";
        private String color = "black";
        public static void main (String[]args){
            CycleNestedInstance cyc = new CycleNestedInstance();
            CycleNestedInstance.Tyre tyr = cyc.new Tyre();
            tyr.Details();
        }
    }
