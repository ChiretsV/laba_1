import java.util.ArrayList;

public class FindingMaxMinTriangles {
    public static Triangle findMaxTriangle(ArrayList<Triangle> triangles){
        double saveSquare = 0;
        Triangle saveTriangle = null;
        for (Triangle triangle : triangles) {
            if(triangle.getSquare() > saveSquare) {
                saveSquare = triangle.getSquare();
                saveTriangle = triangle;
            }
        }
        return saveTriangle;
    }

    public static Triangle findMinTriangle(ArrayList<Triangle> triangles){
        double saveSquare = 10000000;
        Triangle saveTriangle = null;
        for (Triangle triangle : triangles) {
            if(triangle.getSquare() < saveSquare) {
                saveSquare = triangle.getSquare();
                saveTriangle = triangle;
            }
        }
        return saveTriangle;
    }
}
