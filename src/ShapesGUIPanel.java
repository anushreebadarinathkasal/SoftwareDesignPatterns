// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311


//Controller pattern separating presentation from business logic
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ShapesGUIPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Point point = null;
	ShapeController sp;
	static Shape shapes;
	String statein;
	
	public ShapesGUIPanel() {
		sp = new ShapeController();
		setBackground(Color.white);
		addMouseListener(new MouseAdapter() {
	        @Override
	        public void mousePressed(MouseEvent e) {
	        	statein = sp.getState();
	        	if(statein == "initState") {
	        		JOptionPane.showMessageDialog(null, "Please select a shape button first");
	        		return;
	        	} else {
	        		point = new Point(e.getX(), e.getY());
	        		System.out.println(statein);
	        		sp.panelClicked( statein,point.x, point.y);
	                repaint();
	        	}
	        }
	    });
	}
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(point!=null) {
        	sp.drawShape(g);
        }
    }

}
