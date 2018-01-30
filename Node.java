class Node{
	int x;
	int y;
	int rgb;
	Node(int x, int y, int rgb){
		this.x = x;
		this.y = y;
		this.rgb = rgb;
	}
	public boolean equals(Node that){
		return this.x==that.x && this.y == that.y && this.rgb == that.rgb;
	}

	public int hashCode(){
		return x*y;
	}
}
