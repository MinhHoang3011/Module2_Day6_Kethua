public class TestPoind2D {
    public static void main(String[] args) {
        Poind2D point2D = new Poind2D(2,3);
        System.out.println(point2D);
        point2D.setXY(4,5);
        System.out.println(point2D);
        for(float a:(point2D.getXY())){
            System.out.print(a+" ");
        }

    }
}
