// Student Name : Anushree Badarinath Kasal
// Student ID : 1001624311

//Controller pattern separating presentation from business logic

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ShapeGUI{
	static String buttonClicked = "";
	private static final long serialVersionUID = 1L;
	public static boolean shapecaptured = false;
	

    public static void main(String[] args) {
    	
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame("HW1 GUI");
                
                //f.setBounds(100, 100, 841, 748);
                f.setBounds(10, 10, 1400, 600);
                
        		        		
                ShapesGUIPanel p = new ShapesGUIPanel();
                p.sp.Initcapture();

                p.setPreferredSize(new Dimension(800, 400));
                
                JPanel ButtonPanel = new JPanel();
                ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));
        		ButtonPanel.setPreferredSize(new Dimension(100,5));
        		// line selection
        		JButton btnLine = new JButton("Line");
        		btnLine.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				buttonClicked = "Line";
        				p.sp.buttonstate(buttonClicked);
        				
        			}
        		});
        		btnLine.setBounds(0, 59, 97, 25);
        		ButtonPanel.add(btnLine);
        		
        		//Circle selection
        		JButton btnCircle = new JButton("Circle");
        		btnCircle.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				buttonClicked = "Circle";
        				p.sp.buttonstate(buttonClicked);
        				
        			}
        		});
        		btnCircle.setBounds(0, 97, 97, 25);
        		ButtonPanel.add(btnCircle);
        		
        		//box selection
        		JButton btnBox = new JButton("Box");
        		btnBox.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				buttonClicked = "Box";
        				p.sp.buttonstate(buttonClicked);
        			}
        		});
        		btnBox.setBounds(0, 135, 97, 25);
        		ButtonPanel.add(btnBox);
        		
        		JButton btnUndo = new JButton("Undo");
        		btnUndo.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				//buttonClicked = "Undo";
        				
        				//System.out.println("undo action detected");
        				p.sp.undoClicked();
        				p.repaint();
                    	//repaint();
        			}
        		});
        		btnUndo.setBounds(0, 176, 97, 25);
        		ButtonPanel.add(btnUndo);
        		
        		JButton btnRedo = new JButton("Redo");
        		btnRedo.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				//buttonClicked = "Redo";
        				
        				p.sp.redoClicked();
        				p.repaint();
        				
        			}
        		});
        		btnRedo.setBounds(0, 214, 97, 25);
        		ButtonPanel.add(btnRedo);
        		
        		//f.setContentPane(p);
        		f.pack();
        		f.setSize(1000,1000);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationRelativeTo(null);
                f.setVisible(true);
        		f.getContentPane().add(ButtonPanel,BorderLayout.WEST);
        		f.getContentPane().add(p,BorderLayout.EAST);
        		
        		
        		

                
            }
        });
    }


	
}