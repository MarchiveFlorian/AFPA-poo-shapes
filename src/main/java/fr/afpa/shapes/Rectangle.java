package fr.afpa.shapes;

// TODO implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs
public class Rectangle implements Shape {

    // Attributs
    double length;
    double width;

    // Constructeur
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter & setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", calculateArea()=" + calculateArea()
                + ", calculatePerimeter()=" + calculatePerimeter() + "]";
    }

    @Override
    public double calculateArea() {
        //aire_rectangle = longueur * largeur
        return this.length * this.width;
    }

    @Override
    public double calculatePerimeter() {
        //perimetre_rectangle = 2 * longueur + 2 * largeur
        return 2 * this.length + 2 * this.width;
    }
}