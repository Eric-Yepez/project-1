package com.csc205.project1;

public class Point {
   private double x;
    private double y;

    public Point() {
        double x;
        double y;
    }

    public void setPoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }
    public Point(double x, double y) {
        this.setPoint(x,y);
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point p) {
        double a = Math.sqrt(Math.pow(p.getY() - this.getY(),2) + Math.pow(p.getX() - this.getX(), 2));
        return a;
    }
    public void shiftX(double e) {
        this.setX(this.getX() + e);
    }
    public void shiftY(double e) {
        this.setY(this.getY() + e);
    }
    public void rotate(double angle) {
        this.setX(this.getX() * Math.cos(angle) - this.getY() * Math.sin(angle));
        this.setY(this.getX() * Math.sin(angle) + this.getY() * Math.cos(angle));
    }
    public String toString() {
        String coordinatesString = new String();
        coordinatesString = "(" + String.valueOf(this.getX()) + "," + String.valueOf(this.getY()) + ")";
        return coordinatesString;
    }
}
