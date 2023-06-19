package Bai_1;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract double dienTich();
    public abstract double chuVi();
}