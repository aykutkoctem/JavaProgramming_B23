package day50_Exceptions;

public class Rectangle {

    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            throw new  RuntimeException("No Such a Rectangle with a length of: "+length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new  RuntimeException("No Such a Rectangle with a width of: "+width);
        }
        this.width = width;
    }
}
