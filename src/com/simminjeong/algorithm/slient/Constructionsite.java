package com.simminjeong.algorithm.slient;

public class Constructionsite implements Location{
	
	private int noiser;
	private int xPoint;
	private int yPoint;
	
	
	public Constructionsite(int noiser, int xPoint, int yPoint) {
		super();
		this.noiser = noiser;
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}


	public int getNoiser() {
		return noiser;
	}


	public void setNoiser(int noiser) {
		this.noiser = noiser;
	}


	public int getxPoint() {
		return xPoint;
	}


	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}


	public int getyPoint() {
		return yPoint;
	}


	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}

	
	

	

	
	
	

}
