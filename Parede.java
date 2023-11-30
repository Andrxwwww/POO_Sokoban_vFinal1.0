package pt.iscte.poo.sokobanstarter;
import pt.iscte.poo.utils.Point2D;

public class Parede extends GameElement implements Interactable{
	
	public Parede(Point2D position){
        super(position);
	}
    
    @Override
    public String getName() {
        return "Parede";
    }

    @Override
    public int getLayer() {
        return 3;
    }

    @Override
    public void interactWith(GameElement ge) {
        
    }



}