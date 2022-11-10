public class Triangle {
    private double side1, side2, side3, perimeter, square;
    private String typeOfTriangle;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        this.side1 = Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
        this.side2 = Math.sqrt(Math.pow((point3.getX() - point1.getX()), 2) + Math.pow((point3.getY() - point1.getY()), 2));
        this.side3 = Math.sqrt(Math.pow((point3.getX() - point2.getX()), 2) + Math.pow((point3.getY() - point2.getY()), 2));
        typeOfTriangle();
        square();
    }

    public double perimeter() {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public void square() {
        square =  Math.sqrt(perimeter() / 2 * (perimeter() / 2 - side1) * (perimeter() / 2 - side2) * (perimeter() / 2 - side3));
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    public String getTypeOfTriangle() {
        return typeOfTriangle;
    }

    public void typeOfTriangle() {
        if (side1 != side2 && side2 != side3)
            typeOfTriangle = "versatile";
        else if ((side1 == side2 && side1 != side3) || (side2 == side3 && side1 != side3) || (side1 == side3 && side2 != side3))
            typeOfTriangle = "isosceles";
        else if (side1 == side2 && side2 == side3)
            typeOfTriangle = "equilateral";
        else if (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2))
            typeOfTriangle = "rectangular";
        else if (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2))
            typeOfTriangle = "rectangular";
        else if (Math.pow(side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2))
            typeOfTriangle = "rectangular";

    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", typeOfTriangle='" + typeOfTriangle + '\'' +
                '}';
    }
}
