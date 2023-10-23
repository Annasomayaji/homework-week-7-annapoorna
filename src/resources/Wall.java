package resources;

/*Wall area*/
public class Wall {
    double width, height;

    public Wall() { //no-args constructor

    }
    public Wall(double width, double height) { //with args constructor
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);// instantiates the variables via the with args constructor
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    public void setWidth(double w) {
        if (w < 0) {
            width = 0;
        } else {
            width = w;
        }
    }

    public void setHeight(double h) {
        if (h < 0) {
            height = 0;
        } else {
            height = h;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return height*width;
    }
}
