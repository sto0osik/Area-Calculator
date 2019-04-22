public class AreaCalculator {

    public static double area(double radius){

        if (radius >= 0) {
            System.out.println("Rectangle area is equal to " + (radius * radius * Math.PI));
            return radius * radius * Math.PI;
        } else {
            System.out.println("Invalid inserted value or values");
            return -1.0;
        }
    }


    public static double area(double x, double y){

        if (x < 0 || y < 0) {
            System.out.println("Invalid inserted value or values");
            return -1.0;
        } else {
            System.out.println("Rectangle area is equal to " + (x * y));
            return x * y;
        }
    }
}
