import Lesson_7.ThreeAngle;

public class Calculation3 {
    public static class Circle implements Сalculation{
        private double radius;
        private String fillColor;
        private String borderColor;
        public Circle(double radius){
            this.radius=radius;
        }
        @Override
        public double calcPerimetr(){
            return 2*3.14*radius;
        }
        @Override
        public double calcArea(){
            return 3.14*radius*radius;
        }
        @Override
        public void setBorderColor(String color) {
            this.borderColor=color;

        }
        @Override
        public void setFillColor(String color) {
            this.fillColor=color;

        }
        public void printInfo(){
            System.out.println("Фигура - Прямоугольник :");
            System.out.println("Периметр :"+calcPerimetr());
            System.out.println("Площадь :"+calcArea());
            System.out.println("цвет заливки :"+fillColor);
            System.out.println("цвет линии :"+borderColor);
            System.out.println();
        }
    }
    public static class Rectangle implements Сalculation{
        private double heights;
        private double width;
        private String fillColor;
        private String borderColor;
        public Rectangle(double heights, double width){
            this.heights=heights;
            this.width=width;
        }
        @Override
        public double calcPerimetr(){
            return 2*heights+2*width;
        }
        @Override
        public double calcArea(){
            return heights*width;
        }
        @Override
        public void setBorderColor(String color) {
            this.borderColor=color;

        }
        @Override
        public void setFillColor(String color) {
            this.fillColor=color;

        }
        public void printInfo(){
            System.out.println("Фигура - Круг :");
            System.out.println("Периметр :"+calcPerimetr());
            System.out.println("Площадь :"+calcArea());
            System.out.println("цвет заливки :"+fillColor);
            System.out.println("цвет линии :"+borderColor);
            System.out.println();
        }

    }

    public static class Threeangle implements Сalculation{
        private double part1;
        private double part2;
        private double part3;
        private String fillColor;
        private String borderColor;

        public Threeangle(double part1, double part2, double part3){
            this.part1=part1;
            this.part2=part2;
            this.part3=part3;
        }
        @Override
        public double calcPerimetr(){
            return part1+part2+part3;
        }
        @Override
        public double calcArea(){
            double p=(part1+part2+part3)/2;
            return Math.sqrt(p*(p-part1)*(p-part2)*(p-part3));         //S = √p · (p — a)(p — b)(p — c)
        }
        @Override
        public void setBorderColor(String color) {
            this.borderColor=color;

        }
        @Override
        public void setFillColor(String color) {
            this.fillColor=color;

        }

        public void printInfo(){
            System.out.println("Фигура - Треугольник :");
            System.out.println("Периметр :"+calcPerimetr());
            System.out.println("Площадь :"+calcArea());
            System.out.println("цвет заливки :"+fillColor);
            System.out.println("цвет линии :"+borderColor);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Circle circle = new Circle(5);
        circle.setFillColor("Red");
        circle.setBorderColor("white");
        circle.printInfo();

        Rectangle angle = new Rectangle(4,4);
        angle.setFillColor("Green");
        angle.setBorderColor("Red");
        angle.printInfo();

        ThreeAngle triangle = new ThreeAngle(1,3,5);
        triangle.setFillColor("blue");
        triangle.setBorderColor("Red");
        triangle.printInfo();
    }
}
