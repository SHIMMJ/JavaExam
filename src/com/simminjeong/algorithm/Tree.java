package com.simminjeong.algorithm;

public class Tree implements Location {
	
	
	private int treexPoint;
	private int treeyPoint;

	public Tree(int treexPoint, int treeyPoint) {
		super();
		this.treexPoint = treexPoint;
		this.treeyPoint = treeyPoint;
	}


	public void caldistance(Constructionsite con) {

		double distance = Math.pow(con.getxPoint() - treexPoint , 2) + Math.pow(con.getxPoint() - treeyPoint, 2);
		if (distance >= Math.pow(con.getNoiser(), 2)) {
			System.out.println("silent");
		} else {
			System.out.println("noisy");
		}
	}



}
