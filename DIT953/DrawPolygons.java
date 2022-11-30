package DIT953;

/* This is now all we (can) use from the sub-package */


/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT953.model.shapes package.
 */
//import DIT953.model.adapter.*;

public class DrawPolygons {

    public static void main(String[] args) {
        PolygonView myView = new PolygonView();
        PolygonController controller = new PolygonController();
        myView.makeFrame(controller);

        

        try {
            while (true) {
                Thread.sleep(500);
                myView.updateView();
            }
        } catch (InterruptedException e) {}

    }//main

}//DIT953.DrawPolygons