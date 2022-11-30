package DIT953;

import DIT953.polygonModel.polygon.IPolygon;
import DIT953.polygonModel.polygon.PolygonFactory;
import java.util.*;

public class PolygonModel{
    private static ArrayList<IPolygon> polygons = new ArrayList<IPolygon>();
    private static boolean direction = true;
    private static int ticker = 0;

    public static void makePolygon(int x, int y) {
        polygons.add(PolygonFactory.createRectangle(x, y - 20));
    }

    public static ArrayList<IPolygon> getPolygons(){
        return polygons;
    } 

    public static void update(){
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p: polygons){
            p.updateCenter(p.getCenter().x+value, p.getCenter().y+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }
}
