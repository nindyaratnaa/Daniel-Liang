package Daniel_Liang_10_11;

public class MainCircle2D {
    public static void main(String[] args) {
        // Membuat objek lingkaran c1 dengan pusat di (2, 2) dan jari-jari 5.5
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Menampilkan hasil perhitungan luas lingkaran c1
        System.out.println("Circle1 area: " + c1.getArea()); 

        // Menampilkan hasil perhitungan keliling lingkaran c1
        System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 

        // Memeriksa apakah titik (3, 3) berada di dalam lingkaran c1 dan menampilkan hasilnya
        System.out.println("Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 

        // Memeriksa apakah lingkaran c1 mengandung lingkaran lain dengan pusat (4, 5) dan jari-jari 10.5
        System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? " + c1.contains(new Circle2D(4, 5, 10.5)));

        // Memeriksa apakah lingkaran c1 bertumpang tindih dengan lingkaran lain dengan pusat (3, 5) dan jari-jari 2.3
        System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}