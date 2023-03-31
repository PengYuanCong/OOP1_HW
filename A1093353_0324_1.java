import java.util.Scanner;


class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Speed: " + speed + " m/min");
    }

    public double distance(double x, double y) {
        return x * y * speed;
    }

    public double distance(double x) {
        return x * speed;
    }
}


public class A1093353_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Animal("安那", 1.7, 48, 120);
        animals[3] = new Animal("愛沙", 1.7, 50, 120);

        for (Animal animal : animals) {
            animal.show();
        }

        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.println("請輸入你的時間(分鐘)和加速度" + animal.name + ": ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double distance = animal.distance(x, y);
            System.out.println(animal.name + " 跑了 " + distance + " m.");
        }
    }
}