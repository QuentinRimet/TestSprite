
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//permet de gerer l'appuie sur les touches du clavier
public class KeyWolfy implements KeyListener{
	
	public KeyWolfy(Wolfy pan){
		pan.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		//appuyer sur espace permet de marcher a l'envers avant d'avancer
		if(e.getKeyCode()==32 && !Wolfy.isDb()&& !Wolfy.isDd()&& !Wolfy.isDg()&& !Wolfy.isDh()){
			Wolfy.setMoonwalk(true);
		}
		//appuyer sur la fleche de droite deplace le sprite vers la droite et change son orientation
		if (e.getKeyCode()==39 ){
			if(!Wolfy.isMoonwalk()){
				Wolfy.setDroite(true);
				Wolfy.setHaut(false);
				
			}
			else {
				Wolfy.setHaut(true);
				Wolfy.setDroite(false);
			}
			Wolfy.setDd(true);
			Wolfy.setDg(false);	
			Wolfy.setDb(false);	
			Wolfy.setDh(false);	
			Wolfy.setMarche(true);
		}
		//appuyer sur la fleche de gauche deplace le sprite vers la gauche et change son orientation
		if (e.getKeyCode()==37 ){
			if(!Wolfy.isMoonwalk()){
				Wolfy.setDroite(false);
				Wolfy.setHaut(true);
			}
			else {
				Wolfy.setHaut(false);
				Wolfy.setDroite(true);
			}
			Wolfy.setDg(true);
			Wolfy.setDd(false);	
			Wolfy.setDb(false);	
			Wolfy.setDh(false);	
			Wolfy.setMarche(true);
		}
		//appuyer sur la fleche du bas deplace le sprite vers le bas et change son orientation
		if (e.getKeyCode()==40 ){
			if(!Wolfy.isMoonwalk()){
				Wolfy.setDroite(false);
				Wolfy.setHaut(false);
			}
			else {
				Wolfy.setHaut(true);
				Wolfy.setDroite(true);
			}
			Wolfy.setDb(true);
			Wolfy.setDg(false);
			Wolfy.setDh(false);	
			Wolfy.setDd(false);	
			Wolfy.setMarche(true);
		}

		//appuyer sur la fleche du haut deplace le sprite vers le haut et change son orientation
		if (e.getKeyCode()==38 ){
			if(!Wolfy.isMoonwalk()){
				Wolfy.setDroite(true);
				Wolfy.setHaut(true);
			}
			else {
				Wolfy.setHaut(false);
				Wolfy.setDroite(false);
			}

			Wolfy.setDh(true);
			Wolfy.setDg(false);
			Wolfy.setDd(false);	
			Wolfy.setDb(false);	
			Wolfy.setMarche(true);
		}

		//appuyer sur la touche "a" remplit la barre de vie
		if (e.getKeyChar()=='a' ){if(((Wolfy)e.getSource()).hp!=0)
			((Wolfy)e.getSource()).hp+=-5;
		}
		//appuyer sur la touche "e" vide la barre de vie
		if (e.getKeyChar()=='e' ){
			if(((Wolfy)e.getSource()).hp!=100)
			((Wolfy)e.getSource()).hp+=5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//le fait d'appuyer sur espace arrette le deplacement du sprite à l'envers
		if(e.getKeyCode()==32){
			Wolfy.setMoonwalk(false);
		}
		//le fait d'appuyer sur une fleche arrette le deplacement du sprite
		if(e.getKeyCode()==38){
			Wolfy.setDh(false);
		}
		if(e.getKeyCode()==39){
			Wolfy.setDd(false);
			
		}
		if(e.getKeyCode()==37){
			Wolfy.setDg(false);
		}
		if(e.getKeyCode()==40){
			Wolfy.setDb(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}



}
