
public class Ball {
    private double r;
    private String color;
    private String material;

    Ball(float r, String color, String material){
        this.r = r;
        this.color = color;
        this.material = material;
    }

    public void setR(double r){
        this.r = r;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    public double getR(){
        return this.r;
    }
    public String getColor(){
        return this.color;
    }
    public String getMaterial(){
        return this.material;
    }

    public void action(){
        System.out.println("мячик прыгает!");
    }
    public String toString(){
        return ("Мяч радиуса " + r + " выполнен из материала " + material + " имеет цвет " + color);
    }
    public double getV(){
        return 4/3.0 * Math.PI * Math.pow(r,3);
    }
}