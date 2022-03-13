package ascenseur;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import java.awt.Font;

public class Interface {

	private JFrame frmAscenseur;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmAscenseur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAscenseur = new JFrame();
		frmAscenseur.setResizable(false);
		frmAscenseur.setTitle("Ascenseur");
		frmAscenseur.getContentPane().setBackground(new Color(51,204,255));
		frmAscenseur.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0,0,0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 49, 360, 372);
		frmAscenseur.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl11 = new JLabel("");
		lbl11.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-fen\u00EAtre-ouverte-40.png")));
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setBounds(10, 10, 76, 50);
		panel.add(lbl11);
		
		JLabel lbl12 = new JLabel("");
		lbl12.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-fen\u00EAtre-ouverte-40.png")));
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBounds(10, 70, 76, 50);
		panel.add(lbl12);
		
		JLabel lbl13 = new JLabel("");
		lbl13.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-fen\u00EAtre-ouverte-40.png")));
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setBounds(10, 130, 76, 50);
		panel.add(lbl13);
		
		JLabel lbl14 = new JLabel("");
		lbl14.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-fen\u00EAtre-ouverte-40.png")));
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBounds(10, 190, 76, 50);
		panel.add(lbl14);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setIcon(new ImageIcon(Interface.class.getResource("/Icons/Shoji1-paper-sliding-door-icon.png")));
		lbl5.setBounds(10, 250, 76, 50);
		panel.add(lbl5);
		
		JLabel lbl16 = new JLabel("");
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-garage-64.png")));
		lbl16.setBounds(10, 310, 76, 50);
		panel.add(lbl16);
		
		JLabel lbl34 = new JLabel("");
		lbl34.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-capteur-de-porte-40.png")));
		lbl34.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34.setBounds(96, 190, 45, 50);
		panel.add(lbl34);
		
		JLabel lbl33 = new JLabel("");
		lbl33.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-capteur-de-porte-40.png")));
		lbl33.setHorizontalAlignment(SwingConstants.CENTER);
		lbl33.setBounds(96, 130, 45, 50);
		panel.add(lbl33);
		
		JLabel lbl32 = new JLabel("");
		lbl32.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-capteur-de-porte-40.png")));
		lbl32.setHorizontalAlignment(SwingConstants.CENTER);
		lbl32.setBounds(96, 70, 45, 50);
		panel.add(lbl32);
		
		JLabel lbl31 = new JLabel("");
		lbl31.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-capteur-de-porte-40.png")));
		lbl31.setHorizontalAlignment(SwingConstants.CENTER);
		lbl31.setBounds(96, 10, 45, 50);
		panel.add(lbl31);
		
		JLabel lblP1 = new JLabel("");
		lblP1.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-employ\u00E9-48.png")));
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblP1.setBounds(185, 310, 45, 50);
		panel.add(lblP1);
		
		JLabel lblP2 = new JLabel("");
		lblP2.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-gar\u00E7on-40.png")));
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setBounds(185, 250, 45, 50);
		panel.add(lblP2);
		
		JLabel lblP3 = new JLabel("");
		lblP3.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-gar\u00E7on-48.png")));
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setBounds(185, 190, 45, 50);
		panel.add(lblP3);
		
		JLabel lblP4 = new JLabel("");
		lblP4.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-homme-debout-48 (1).png")));
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setBounds(185, 130, 45, 50);
		panel.add(lblP4);
		
		JLabel lblP5 = new JLabel("");
		lblP5.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-personne-\u00E2g\u00E9er-48.png")));
		lblP5.setHorizontalAlignment(SwingConstants.CENTER);
		lblP5.setBounds(185, 70, 45, 50);
		panel.add(lblP5);
		
		JLabel lblP6 = new JLabel("");
		lblP6.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-voyageur-avec-bagages-40.png")));
		lblP6.setHorizontalAlignment(SwingConstants.CENTER);
		lblP6.setBounds(185, 10, 45, 50);
		panel.add(lblP6);
		
		JPanel pnlAscenseur1 = new JPanel();
		pnlAscenseur1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(1,1,1)));
		pnlAscenseur1.setBackground(new Color(161,204,255));
		pnlAscenseur1.setBounds(240, 310, 60, 50);
		panel.add(pnlAscenseur1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 67, 599, 9);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 130, 599, 9);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 189, 599, 9);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 245, 599, 9);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 305, 599, 9);
		panel.add(separator_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		lblNewLabel.setBounds(10, 10, 45, 41);
		frmAscenseur.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		lblNewLabel_1.setBounds(65, 10, 45, 41);
		frmAscenseur.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		lblNewLabel_2.setBounds(120, 10, 45, 41);
		frmAscenseur.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		lblNewLabel_3.setBounds(235, 10, 45, 41);
		frmAscenseur.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		lblNewLabel_4.setBounds(309, 10, 45, 41);
		frmAscenseur.getContentPane().add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-recherche-gps-40.png")));
		label.setBounds(175, 10, 45, 41);
		frmAscenseur.getContentPane().add(label);
		

		Personne person = new Personne(lblP3);//etage2
		Personne person2 = new Personne(lblP4);//etage3
		Personne person3 = new Personne(lblP2);//etage1
		Personne person4 = new Personne(lblP5);//etage4
		Personne person5 = new Personne(lblP1);//etage0
		Personne person6 = new Personne(lblP6);//etage 5
		
		// les buttons de etage 5
		JButton btn = new JButton("0");
		btn.setToolTipText("Cliquez ici pour commencer");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(0);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
		btn.setBounds(500, 49, 20, 20);
		frmAscenseur.getContentPane().add(btn);
		
		JButton btn1 = new JButton("1");
		btn1.setToolTipText("Cliquez ici pour commencer");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(1);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn1.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
		btn1.setBounds(475, 49, 20, 20);
		btn1.setText("3");
		frmAscenseur.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setToolTipText("Cliquez ici pour commencer");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(2);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn2.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
		btn2.setBounds(450, 49, 20, 20);
		frmAscenseur.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setToolTipText("Cliquez ici pour commencer");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(3);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn3.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
		btn3.setBounds(425, 49, 20, 20);
		btn3.setText("3");
		frmAscenseur.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setToolTipText("Cliquez ici pour commencer");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(4);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn4.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
		btn4.setBounds(400, 49, 20, 20);
		frmAscenseur.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setToolTipText("Cliquez ici pour commencer");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				person6.setEtageTo(5);
				Ascenseur as = new Ascenseur(pnlAscenseur1, person6);
				as.start();
			}
		});
		btn5.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
		btn5.setBounds(375, 49, 20, 20);
		frmAscenseur.getContentPane().add(btn5);
		
		// les buttons de etage 4
				JButton btn10 = new JButton("0");
				btn.setToolTipText("Cliquez ici pour commencer");
				
				btn10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(0);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn10.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
				btn10.setBounds(500, 120, 20, 20);
				frmAscenseur.getContentPane().add(btn10);
				
				JButton btn11 = new JButton("1");
				btn11.setToolTipText("Cliquez ici pour commencer");
				btn11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(1);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn11.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
				btn11.setBounds(475, 120, 20, 20);
				btn11.setText("3");
				frmAscenseur.getContentPane().add(btn11);
				
				JButton btn21 = new JButton("2");
				btn21.setToolTipText("Cliquez ici pour commencer");
				btn21.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(2);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn21.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
				btn21.setBounds(450, 120, 20, 20);
				frmAscenseur.getContentPane().add(btn21);
				
				JButton btn31 = new JButton("3");
				btn31.setToolTipText("Cliquez ici pour commencer");
				btn31.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(3);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn31.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
				btn31.setBounds(425, 120, 20, 20);
				btn31.setText("3");
				frmAscenseur.getContentPane().add(btn31);
				
				JButton btn41 = new JButton("4");
				btn41.setToolTipText("Cliquez ici pour commencer");
				btn41.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(4);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn41.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
				btn41.setBounds(400, 120, 20, 20);
				frmAscenseur.getContentPane().add(btn41);
				
				JButton btn51 = new JButton("5");
				btn51.setToolTipText("Cliquez ici pour commencer");
				btn51.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(5);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person4);
						as.start();
					}
				});
				btn51.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
				btn51.setBounds(375, 120, 20, 20);
				frmAscenseur.getContentPane().add(btn51);
				
				
				// les buttons de etage 3
				JButton btn30 = new JButton("0");
				btn.setToolTipText("Cliquez ici pour commencer");
				
				btn30.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person2.setEtageTo(0);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn30.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
				btn30.setBounds(500, 180, 20, 20);
				frmAscenseur.getContentPane().add(btn30);
				
				JButton btn311 = new JButton("1");
				btn311.setToolTipText("Cliquez ici pour commencer");
				btn311.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person2.setEtageTo(1);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn311.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
				btn311.setBounds(475, 180, 20, 20);
				btn311.setText("3");
				frmAscenseur.getContentPane().add(btn311);
				
				JButton btn211 = new JButton("2");
				btn211.setToolTipText("Cliquez ici pour commencer");
				btn211.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person4.setEtageTo(2);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn211.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
				btn211.setBounds(450, 180, 20, 20);
				frmAscenseur.getContentPane().add(btn211);
				
				JButton btn331 = new JButton("3");
				btn331.setToolTipText("Cliquez ici pour commencer");
				btn331.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person2.setEtageTo(3);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn331.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
				btn331.setBounds(425, 180, 20, 20);
				btn331.setText("3");
				frmAscenseur.getContentPane().add(btn331);
				
				JButton btn441 = new JButton("4");
				btn441.setToolTipText("Cliquez ici pour commencer");
				btn441.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person2.setEtageTo(4);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn441.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
				btn441.setBounds(400, 180, 20, 20);
				frmAscenseur.getContentPane().add(btn441);
				
				JButton btn551 = new JButton("5");
				btn551.setToolTipText("Cliquez ici pour commencer");
				btn551.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person2.setEtageTo(5);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person2);
						as.start();
					}
				});
				btn551.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
				btn551.setBounds(375, 180, 20, 20);
				frmAscenseur.getContentPane().add(btn551);
				
				// les buttons de etage 2
				JButton btn302 = new JButton("0");
				btn.setToolTipText("Cliquez ici pour commencer");
				
				btn302.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(0);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn302.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
				btn302.setBounds(500, 240, 20, 20);
				frmAscenseur.getContentPane().add(btn302);
				
				JButton btn312 = new JButton("1");
				btn312.setToolTipText("Cliquez ici pour commencer");
				btn312.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(1);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn312.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
				btn312.setBounds(475, 240, 20, 20);
				btn312.setText("3");
				frmAscenseur.getContentPane().add(btn312);
				
				JButton btn212 = new JButton("2");
				btn212.setToolTipText("Cliquez ici pour commencer");
				btn212.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(2);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn212.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
				btn212.setBounds(450, 240, 20, 20);
				frmAscenseur.getContentPane().add(btn212);
				
				JButton btn332 = new JButton("3");
				btn332.setToolTipText("Cliquez ici pour commencer");
				btn332.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(3);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn332.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
				btn332.setBounds(425, 240, 20, 20);
				btn332.setText("3");
				frmAscenseur.getContentPane().add(btn332);
				
				JButton btn442 = new JButton("4");
				btn442.setToolTipText("Cliquez ici pour commencer");
				btn442.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(4);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn442.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
				btn442.setBounds(400, 240, 20, 20);
				frmAscenseur.getContentPane().add(btn442);
				
				JButton btn552 = new JButton("5");
				btn552.setToolTipText("Cliquez ici pour commencer");
				btn552.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person.setEtageTo(5);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person);
						as.start();
					}
				});
				btn552.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
				btn552.setBounds(375, 240, 20, 20);
				frmAscenseur.getContentPane().add(btn552);

				// les buttons de etage 1
				JButton btn301 = new JButton("0");
				btn.setToolTipText("Cliquez ici pour commencer");
				
				btn301.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(0);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn301.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
				btn301.setBounds(500, 300, 20, 20);
				frmAscenseur.getContentPane().add(btn301);
				
				JButton btn3111 = new JButton("1");
				btn3111.setToolTipText("Cliquez ici pour commencer");
				btn3111.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(1);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn3111.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
				btn3111.setBounds(475, 300, 20, 20);
				btn3111.setText("3");
				frmAscenseur.getContentPane().add(btn3111);
				
				JButton btn2111 = new JButton("2");
				btn2111.setToolTipText("Cliquez ici pour commencer");
				btn2111.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(2);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn2111.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
				btn2111.setBounds(450, 300, 20, 20);
				frmAscenseur.getContentPane().add(btn2111);
				
				JButton btn3321 = new JButton("3");
				btn3321.setToolTipText("Cliquez ici pour commencer");
				btn3321.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(3);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn3321.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
				btn3321.setBounds(425, 300, 20, 20);
				btn3321.setText("3");
				frmAscenseur.getContentPane().add(btn3321);
				
				JButton btn4421 = new JButton("4");
				btn4421.setToolTipText("Cliquez ici pour commencer");
				btn4421.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(4);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn4421.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
				btn4421.setBounds(400, 300, 20, 20);
				frmAscenseur.getContentPane().add(btn4421);
				
				JButton btn5521 = new JButton("5");
				btn5521.setToolTipText("Cliquez ici pour commencer");
				btn5521.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person3.setEtageTo(5);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person3);
						as.start();
					}
				});
				btn5521.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
				btn5521.setBounds(375, 300, 20, 20);
				frmAscenseur.getContentPane().add(btn5521);
				
				
				// les buttons de garage
				JButton btn3015 = new JButton("0");
				btn.setToolTipText("Cliquez ici pour commencer");
				
				btn3015.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(0);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn3015.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-0-c-15.png")));
				btn3015.setBounds(500, 360, 20, 20);
				frmAscenseur.getContentPane().add(btn3015);
				
				JButton btn31115 = new JButton("1");
				btn31115.setToolTipText("Cliquez ici pour commencer");
				btn31115.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(1);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn31115.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-number-1-20.png")));
				btn31115.setBounds(475, 360, 20, 20);
				btn31115.setText("3");
				frmAscenseur.getContentPane().add(btn31115);
				
				JButton btn21115 = new JButton("2");
				btn21115.setToolTipText("Cliquez ici pour commencer");
				btn21115.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(2);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn21115.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-2-key-18.png")));
				btn21115.setBounds(450, 360, 20, 20);
				frmAscenseur.getContentPane().add(btn21115);
				
				JButton btn33215 = new JButton("3");
				btn33215.setToolTipText("Cliquez ici pour commencer");
				btn33215.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(3);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn33215.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-circled-3-c-18.png")));
				btn33215.setBounds(425, 360, 20, 20);
				btn33215.setText("3");
				frmAscenseur.getContentPane().add(btn33215);
				
				JButton btn44215 = new JButton("4");
				btn44215.setToolTipText("Cliquez ici pour commencer");
				btn44215.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(4);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn44215.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-4-18.png")));
				btn44215.setBounds(400, 360, 20, 20);
				frmAscenseur.getContentPane().add(btn44215);
				
				JButton btn55215 = new JButton("5");
				btn55215.setToolTipText("Cliquez ici pour commencer");
				btn55215.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						person5.setEtageTo(5);
						Ascenseur as = new Ascenseur(pnlAscenseur1, person5);
						as.start();
					}
				});
				btn55215.setIcon(new ImageIcon(Interface.class.getResource("/Icons/icons8-5-key-18.png")));
				btn55215.setBounds(375, 360, 20, 20);
				frmAscenseur.getContentPane().add(btn55215);
				
		JLabel lblNom = new JLabel("BOUJANNA Ayoub");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBackground(new Color(255, 255, 255));
		lblNom.setFont(new Font("Segoe UI Symbol", Font.BOLD, 20));
		lblNom.setBounds(10, 424, 303, 38);
		frmAscenseur.getContentPane().add(lblNom);
		frmAscenseur.setBounds(100, 100, 541, 509);
		frmAscenseur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

