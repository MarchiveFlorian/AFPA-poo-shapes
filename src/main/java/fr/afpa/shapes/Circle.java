package fr.afpa.shapes;

// TODO implémenter la classe Circle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs
public class Circle implements Shape {

    // Attributs
    double radius;

    // Constructeur
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", calculateArea()=" + calculateArea() + ", calculatePerimeter()="
                + calculatePerimeter() + "]";
    }

    @Override
    public double calculateArea() {
        //aire_cercle = π * rayon^2
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        //périmètre du cercle = 2 * π * rayon
        return 2 * Math.PI * this.radius;
    }

}