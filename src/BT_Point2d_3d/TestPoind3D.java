public class TestPoind3D {
    public static void main(String[] args) {
        Poind3D point3D = new Poind3D(2, 3, 4);
        System.out.println(point3D);
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
        for (float a : (point3D.getXYZ())) {
            System.out.print(a + " ");
        }
    }
}
