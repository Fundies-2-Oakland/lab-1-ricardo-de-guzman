public class Main {
    public static void main(String[] args) {
        Vector3D rico = new Vector3D(5.0, 2.0, 7.0);
        System.out.println(rico);
        System.out.println(rico.getX());
        System.out.println(rico.getY());
        System.out.println(rico.getZ());
        System.out.println(rico.getMagnitude());
        System.out.println(rico.normalize());
        Vector3D braden = new Vector3D(4.0, 8.0, 3.0);
        System.out.println(rico.add(braden));
        System.out.println(rico.multiply(3.0));
        System.out.println(rico.dotProduct(braden));
    }
}

