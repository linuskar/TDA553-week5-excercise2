package DIT953;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import DIT953.polygonModel.polygon.IPolygon;

import java.awt.Graphics;
import java.util.ArrayList;

public class PolygonView extends JComponent {

    public PolygonView() {
        PolygonModel.getPolygons();
    }

    public void makeFrame(PolygonController controller) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.addMouseListener(controller);
    }

    public void updateView() {
        PolygonModel.update();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : PolygonModel.getPolygons()) {
            currentPolygon.paint(g);
        }
    }//paint

}
