


public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {

        //1.
//        Level myVar = Level.MEDIUM;
//
//        switch(myVar) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case MEDIUM:
//                System.out.println("Medium level");
//                break;
//            case HIGH:
//                System.out.println("High level");
//                break;
//        }
//
//        for (Level v : Level.values()) {
//            System.out.println(v);
//        }


        //2.
        double earthWeight = 75; // weight on Earth in kilograms
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
        }

    }
}