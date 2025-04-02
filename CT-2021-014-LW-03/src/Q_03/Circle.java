package Q_03;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

}
