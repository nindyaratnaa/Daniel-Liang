package Daniel_Liang_10_11;

class Circle2D { 
    double x; //Koordinat x dari pusat lingkaran
    double y; //Koordinat y dari pusat lingkaran
    double radius; //Jari-jari lingkaran 

    // Konstruktor default (membuat lingkaran dengan pusat di (0, 0) dan jari-jari 1)
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Konstruktor dengan parameter untuk membuat lingkaran dengan pusat (x, y) dan jari-jari tertentu
    public Circle2D(double x, double y, double radius) {
        this.x = x; 
        this.y = y;
        this.radius = radius; 
    }

    // Metode getter untuk mendapatkan koordinat x
    public double getX() {
        return x; 
    }

    // Metode getter untuk mendapatkan koordinat y
    public double getY() {
        return y; 
    }

    // Metode getter untuk mendapatkan jari-jari lingkaran
    public double getRadius() {
        return radius; 
    }

    // Metode untuk menghitung luas lingkaran (π * r^2)
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); 
    }

    // Metode untuk menghitung keliling lingkaran (2 * π * r)
    public double getPerimeter() {
        return 2 * Math.PI * radius; 
    }

    // Metode untuk memeriksa apakah titik (x, y) berada di dalam lingkaran
    public boolean contains(double x, double y) {
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= radius; 
    } 

    // Metode untuk memeriksa apakah lingkaran lain berada di dalam lingkaran ini
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance + circle.radius <= this.radius; 
    } 

    // Metode untuk memeriksa apakah lingkaran lain bertumpang tindih dengan lingkaran ini
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return distance <= this.radius + circle.radius;
    }
}