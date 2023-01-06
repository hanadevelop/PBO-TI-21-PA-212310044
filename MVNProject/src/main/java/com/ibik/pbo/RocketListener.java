package com.ibik.pbo;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;

public class RocketListener extends JFrame implements KeyListener {

	private JPanel contentPane;
	JLabel rocket_Img = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RocketListener frame = new RocketListener();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RocketListener() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setVisible(true);
		
		rocket_Img.setBounds(0, 0, 548, 591);
		String packageName = "com/ibik/pbo/praktikum/images/";
		
	    URL rocket_path = RocketListener.class.getClassLoader().getResource(packageName+"rocket.png");
	    final ImageIcon rocket = new ImageIcon(rocket_path);
	    
	    URL rocketleft_path = RocketListener.class.getClassLoader().getResource(packageName+"rocket_left.png");
	    final ImageIcon rocketleft = new ImageIcon(rocketleft_path);
	    
	    rocket_Img.setIcon(rocket);
		contentPane.add(rocket_Img);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 switch (e.getKeyChar()) {
		          case 'a':
		          	rocket_Img.setLocation(rocket_Img.getX()-10, rocket_Img.getY());
		              break;
		          case 'w':
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()-10); 
		          	rocket_Img.getX();
		              break;
		          case 's':
		          	rocket_Img.setLocation(rocket_Img.getX(), rocket_Img.getY()+10); 
		              break;
		          case 'd':
		          	rocket_Img.setLocation(rocket_Img.getX()+10, rocket_Img.getY()); 
		              break;
		          default:
		              break;
		      }
				if (rocket_Img.getX() >= 340) {
					rocket_Img.setIcon(rocketleft);
					rocket_Img.setBounds(340, 0, 548, 591);
				}else if (rocket_Img.getX() <= 0) {
					rocket_Img.setIcon(rocket);
					rocket_Img.setBounds(0, 0, 548, 591);
				}
			}
		});
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}



