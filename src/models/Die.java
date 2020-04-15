package models;

public class Die {
	private int faceValue;

	public int getFace() {
		return faceValue;
	}

	public void setFace(int face) {
		this.faceValue = face;
	}
	
	public Die(int face) {
		this.faceValue = face;
	}

	public int roll() {
		int range = (this.faceValue - 1) + 1;     
		return (int)(Math.random() * range) + 1;
	}
}
