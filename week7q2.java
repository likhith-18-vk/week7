abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

class  Cube extends Shape3D {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * side * side;
    }
}

class week7q2 {
    public static void main(String[] args) {
        System.out.println("NAME: P SAI LIKHITH,ROLL NO :AV.SC.U4CSE24306,SEC:CSE-A"); 
        Sphere s = new Sphere(2.3);
        System.out.println("Volume of Sphere: " + s.calculateVolume());
        System.out.println("Surface Area of Sphere: " + s.calculateSurfaceArea());

        Cube c = new Cube(2.3);
        System.out.println("Volume of Cube: " + c.calculateVolume());
        System.out.println("Surface Area of Cube: " + c.calculateSurfaceArea());
    }
}






