import carpetCostCalculator.Circle;
import carpetCostCalculator.ComplexNumber;
import carpetCostCalculator.Cylinder;
import composition.*;
import encapsulation.Printer;
import polymorphism.Car;
import polymorphism.Ford;
import polymorphism.Holden;
import polymorphism.Mitsubishi;

public class Main {
    public static void main(String[] args) {

//        ComplexNumber number1 = new ComplexNumber(1.5d,2.5d);
//        ComplexNumber number2 = new ComplexNumber(2.2d,3.4d);
//
//        number2.add(number1);
//
//        System.out.println(number2.getImaginary());
//        System.out.println(number2.getReal());
//
//        number2.subtract(number1);
//
//        System.out.println(number2.getImaginary());
//        System.out.println(number2.getReal());

//        Circle circle = new Circle(2);
//        System.out.println("Area of the circle = " + circle.getArea());
//
//        Cylinder cylinder = new Cylinder(2,2);
//        System.out.println("Volume of the cylinder = " + cylinder.getVolume());

//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//
//        bedRoom.getLamp().turnOn();

//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.getCylinders());
        System.out.println(car.getName());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}