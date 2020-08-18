package org.debanjana.spring;

import java.util.List;

public class Triangle {
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point point : points) {
			System.out.println("Point: (" + point.getX() +"," + point.getY() + ")");
		}
		//System.out.println("Point A: (" + getPointA().getX() + "," + getPointA().getY() + "), Point B: (" + getPointB().getX() + "," + getPointB().getY() + "), Point C: (" + getPointC().getX() + "," + getPointC().getY() + ")");
	}
}

//private String type;
//private int height;
//
//public Triangle(String type) {
//	this.type = type;
//}
//
//public Triangle(String type, int height) {
//	this.type = type;
//	this.height = height;
//}
//
//public String getType() {
//	return type;
//}
//
//public void setType(String type) {
//	this.type = type;
//}
//
//public int getHeight() {
//	return height;
//}
//
//public void setHeight(int height) {
//	this.height = height;
//}
//
//public void draw() {
//	System.out.println(this.getType() + " Triangle drawn of height " + this.getHeight());
//}
