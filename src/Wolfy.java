import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.Timer;

@SuppressWarnings("serial")
public class Wolfy extends JPanel{
	private static int sp=1;
	
	
	//aurientation du sprite
	private static boolean droite =true;
	private static boolean haut =false;
	//savoir si le sprite marche et si il marche a l'envers
	private static boolean marche=false;
	private static boolean moonwalk =false;
	//savoir vers si le sprite se deplace vers une direction
	private static boolean dd =false;
	private static boolean dg =false;
	private static boolean dh =false;
	private static boolean db =false;
	//coordonées du sprite
	private int x;
	private int y;
	//permet de vider/remplir la barre de vie
	public int hp=75;

	//on initialise le JPanel
	public Wolfy(){
		this.setFocusable(true);
		this.setPreferredSize(new Dimension(1500,800));
		new KeyWolfy(this);
		this.setBackground(Color.black);
		this.requestFocusInWindow();
	}


	//permet d'afficher les sprites
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		BufferedImage image;
		
	//Affiche les sprites 
		try {
			if(!haut){
				//A l'arret vers le bas gauche
				if(!marche && !droite){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/sprite 1.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/sprite 2.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/sprite 3.png"));
					else 
						image = ImageIO.read(new File("Sprite/sprite 2.png"));

					g.drawImage(image,x+10,y,175,190, null);
				}
				//A l'arret vers le bas droit
				else if(!marche && droite){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/sprite 1c.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/sprite 2c.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/sprite 3c.png"));
					else 
						image = ImageIO.read(new File("Sprite/sprite 2c.png"));

					g.drawImage(image,x+10,y,175,190, null);
				}
				//En marche vers le bas gauche a l'endroit
				else if(marche && !droite && !moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdep1.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdep2.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdep3.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdep4.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdep5.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdep6.png"));
					g.drawImage(image,x+35,y,150,200, null);
				}
				//En marche vers le bas droit a l'endroit
				else if(marche && droite  && !moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdep1c.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdep2c.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdep3c.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdep4c.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdep5c.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdep6c.png"));
					g.drawImage(image,x+15,y,150,200, null);
				}
				//En marche vers le bas gauche a l'envers
				else if(marche && !droite && moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdep6.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdep5.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdep4.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdep3.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdep2.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdep1.png"));
					g.drawImage(image,x+35,y,150,200, null);
				}
				//En marche vers le bas droit a l'envers
				else if(marche && droite  && moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdep6c.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdep5c.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdep4c.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdep3c.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdep2c.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdep1c.png"));
					g.drawImage(image,x+15,y,150,200, null);
				}
			}
			else {
				//A l'arret vers le haut gauche
				if(!marche && !droite){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/sprite1d.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/sprite2d.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/sprite3d.png"));
					else 
						image = ImageIO.read(new File("Sprite/sprite2d.png"));

					g.drawImage(image,x+50,y,115,190, null);
				}
				//A l'arret vers le haut droit
				else if(!marche && droite){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/sprite1dc.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/sprite2dc.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/sprite3dc.png"));
					else 
						image = ImageIO.read(new File("Sprite/sprite2dc.png"));

					g.drawImage(image,x+20,y,115,190, null);
				}
				//En marche vers le haut gauche a l'endroit
				else if(marche && !droite && !moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdepd1.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdepd2.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdepd3.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdepd4.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdepd5.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdepd6.png"));
					g.drawImage(image,x+35,y,100,200, null);
				}
				//En marche vers le haut droit a l'endroit
				else if(marche && droite && !moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdepd1c.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdepd2c.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdepd3c.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdepd4c.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdepd5c.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdepd6c.png"));
					g.drawImage(image,x+35,y,100,200, null);
				}
				//En marche vers le haut gauche a l'envers
				else if(marche && !droite && moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdepd6.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdepd5.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdepd4.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdepd3.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdepd2.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdepd1.png"));
					g.drawImage(image,x+35,y,100,200, null);
				}
				//En marche vers le haut droit a l'envers
				else if(marche && droite  && moonwalk){
					if (sp==1)
						image = ImageIO.read(new File("Sprite/pdepd6c.png"));
					else if(sp==2)
						image = ImageIO.read(new File("Sprite/pdepd5c.png"));
					else if(sp==3)
						image = ImageIO.read(new File("Sprite/pdepd4c.png"));
					else if(sp==4)
						image = ImageIO.read(new File("Sprite/pdepd3c.png"));
					else if(sp==5)
						image = ImageIO.read(new File("Sprite/pdepd2c.png"));
					else 
						image = ImageIO.read(new File("Sprite/pdepd1c.png"));
					g.drawImage(image,x+35,y,100,200, null);
				}
				
			}
			//Affichage barre de vie
			g.setColor(new Color(100,0,0));
			g.fillRect(163, 39, 320, 11);
				g.setColor(new Color(255,0,0));
				g.fillRect(163, 39, (int)(hp/100.0*320), 11);
			
			image = ImageIO.read(new File("Sprite/interface6bis.png"));
			g.drawImage(image,0,-200,600,400, null);
			

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	//initialise la position du depart du sprite au milleux de l'ecran
	public void initialise(){
		this.x=this.getWidth()/2-110;
		this.y=this.getHeight()/2-100;
		sprite();
	}

	//Permet de deplacer la position du sprite
	public void deplacement(int a,int b){
		x+=a;
		y+=b;
	}

	//permet de choisir quelle deplacement faire en fonction de vers où on se deplace
	public void seDeplacer(){
		if(dd)	deplacement(5, 5);
		if(dg)	deplacement(-5, -5);
		if(db)	deplacement(-5, 5);
		if(dh)	deplacement(5, -5);
	}
	
	//fonction qui se repete en boucle pour afficher le bon sprite
	public void sprite(){
		//savoir si le sprite a arreter de marcher
		if (!db && !dd && !dh && !dg){
			Wolfy.setMarche(false);
		}
		//permet de faire la boucle des sprites
		sp++;
		//si il est immobile
		if(!marche){
			if (sp>4)
				sp=1;
		}
		//si il marche
		if(marche){
			if (sp>6)
				sp=1;
		}
		
		//permet de boucler cette methode
		Timer time=new Timer();

		time.schedule(new TimerTask(){

			
			public void run() {
				seDeplacer();
				sprite();
				repaint();
			}

		}, 125);
	}



	public static boolean isMarche() {
		return marche;
	}



	public static void setMarche(boolean marche) {
		Wolfy.marche = marche;
	}



	public static boolean isDroite() {
		return droite;
	}



	public static void setDroite(boolean droite) {
		Wolfy.droite = droite;
	}



	public static boolean isHaut() {
		return haut;
	}



	public static void setHaut(boolean haut) {
		Wolfy.haut = haut;
	}



	public static boolean isMoonwalk() {
		return moonwalk;
	}



	public static void setMoonwalk(boolean moonwalk) {
		Wolfy.moonwalk = moonwalk;
	}



	public static boolean isDd() {
		return dd;
	}



	public static void setDd(boolean dd) {
		Wolfy.dd = dd;
	}



	public static boolean isDg() {
		return dg;
	}



	public static void setDg(boolean dg) {
		Wolfy.dg = dg;
	}



	public static boolean isDh() {
		return dh;
	}



	public static void setDh(boolean dh) {
		Wolfy.dh = dh;
	}



	public static boolean isDb() {
		return db;
	}



	public static void setDb(boolean db) {
		Wolfy.db = db;
	}









}
