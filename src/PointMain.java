public class PointMain {
    public static void main(String[] args) {

    }

    public static Double calculateDistance (Point pointA, Point pointB) {
        return Math.sqrt(
                Math.pow(pointA.getX() - pointB.getX(), 2.0)+
                        Math.pow(pointA.getY() - pointB.getY(),2.0)
        );
    }

}
