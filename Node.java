class Node{
	int x;
	int y;
	int rgb;
	Node(int x, int y, int rgb){
		this.x = x;
		this.y = y;
		this.rgb = rgb;
	}
	int getX(){
		return x;
	}
	
	void setX(int x){
		this.x = x;
	}
	
	int getY(){
		return y;
	}
	
	void setY(int y){
		this.y = y;
	}
			
	public boolean equals(Node that){
		return this.x==that.x && this.y == that.y && this.rgb == that.rgb;
	}

	public int hashCode(){
		return x*y;
	}
}
