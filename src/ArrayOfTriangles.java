import java.util.ArrayList;

public class ArrayOfTriangles {
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Triangle> versatileTriangles = new ArrayList<>();
    private ArrayList<Triangle> isoscelesTriangles = new ArrayList<>();
    private ArrayList<Triangle> equilateralTriangles = new ArrayList<>();
    private ArrayList<Triangle> rectangularTriangles = new ArrayList<>();

    public ArrayOfTriangles() {
        triangles.add(new Triangle(-3, -2, 0, -1, -2, 5));
        triangles.add(new Triangle(0, 3, -2, -3, -6, 1));
        triangles.add(new Triangle(0, 6, -4, -6, -12, 2));
        triangles.add(new Triangle(-6, -4, 0, -2, -4, 10));
        triangles.add(new Triangle(3, 31, 4, 93, 5, 28));
        triangles.add(new Triangle(2, 47, 7, 54, 68, 6));

        separateTriangles();
        amountOfTriangles();
        printMaxMinTriangles();
    }

    public void separateTriangles() {
        for (Triangle triangle : triangles) {
            if (triangle.getTypeOfTriangle().equalsIgnoreCase("versatile"))
                versatileTriangles.add(triangle);
            else if (triangle.getTypeOfTriangle().equalsIgnoreCase("rectangular"))
                isoscelesTriangles.add(triangle);
            else if (triangle.getTypeOfTriangle().equalsIgnoreCase("equilateral"))
                equilateralTriangles.add(triangle);
            else if (triangle.getTypeOfTriangle().equalsIgnoreCase("isosceles"))
                rectangularTriangles.add(triangle);
        }
    }

    public void amountOfTriangles() {
        System.out.println("\namount of versatile triangles" + " = " + versatileTriangles.size());
        System.out.println("amount of isosceles triangles" + " = " + isoscelesTriangles.size());
        System.out.println("amount of equilateral triangles" + " = " + equilateralTriangles.size());
        System.out.println("amount of rectangular triangles" + " = " + rectangularTriangles.size() + "\n");
    }


    public void printMaxMinTriangles() {
        System.out.println("max versatile triangle = " + FindingMaxMinTriangles.findMaxTriangle(versatileTriangles));
        System.out.println("min versatile triangle = " + FindingMaxMinTriangles.findMinTriangle(versatileTriangles) + "\n");
        System.out.println("max isosceles triangle = " + FindingMaxMinTriangles.findMaxTriangle(isoscelesTriangles));
        System.out.println("min isosceles triangle = " + FindingMaxMinTriangles.findMinTriangle(isoscelesTriangles) + "\n");
        System.out.println("max equilateral triangle = " + FindingMaxMinTriangles.findMaxTriangle(equilateralTriangles));
        System.out.println("min equilateral triangle = " + FindingMaxMinTriangles.findMinTriangle(equilateralTriangles) + "\n");
        System.out.println("max rectangular triangle = " + FindingMaxMinTriangles.findMaxTriangle(rectangularTriangles));
        System.out.println("min rectangular triangle = " + FindingMaxMinTriangles.findMinTriangle(rectangularTriangles) + "\n");

    }
}
