package Robot;

public class RobotsGame {

	private Robot[] r;
	
	public RobotsGame(){
		r = new Robot[10];
	}
	
	public int dice(){
		return (int)(Math.random()*(4-1+1))+1;
	}
	
	public int jumpNum(){
		return (int)(Math.random()*(6-1+1))+1;
	}
	
	public void samePlace(int i){
		for (int j = 0; j < r.length; j++){
			if (j == i){
				j++;
			}
			else if(r[i].getIndex() == r[j].getIndex()){
				r[j].setInGame(false);
			}
		}
	}
	
	public String winner(int i){
			if (r[i].getIndex() == 100){
				return r[i].getColor();
			}
			else{
				return null;
			}
	}
	
	public boolean inGame(int i){
		if (r[i].getInGame()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String game(){
		String winner;
		while(true){
			for(int i = 0; i < r.length; i++){
				if (inGame(i)){
					if(dice() == 1){
						r[i].setIndex(r[i].getIndex() + 1);
						samePlace(i);
					}
					else if(dice() == 2){
						r[i].setIndex(r[i].getIndex() - 1);
						samePlace(i);
					}
					else if(dice() == 3){
						r[i].forwardJump(jumpNum());
						samePlace(i);
					}
					else{
						r[i].backJump(jumpNum());
						samePlace(i);
					}
				winner = winner(i);
				if (winner != null){
					return winner;
				}
				}
			}
		}
	}
}