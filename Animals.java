
public class Animals {
    String name;
    int distRun;
    int distSwim;
    public Animals() {
    }
    public Animals(String name) {
        this.name = name;
    }
    public void animalInfo() {
        System.out.println("Животное :" + name);
    }
    public static class Cat extends Animals {
        public Cat(String name, int distRun, int distSwim) {
            this.name = name;
            this.distRun = distRun;
            this.distSwim = distSwim;
        }
        public void CatInfo() {
            System.out.println("Кот кличка: " + name);
        }

        public void CatRun(int distRun) {
            if (distRun > 0 & distRun <= 200) {
                System.out.println("Кот может пробежать " + distRun);
            } else System.out.println("Кот не может столько пробежать!");
        }

        public void CatSwim(int distSwim) {
            System.out.println("Кот не плавает, совсем ");
        }
    }

    public static class Dog extends Animals {
        public Dog(String name, int distRun, int distSwim) {
            this.name = name;
            this.distRun = distRun;
            this.distSwim = distSwim;
        }

        public void DogInfo() {
            System.out.println("Собака кличка: " + name);
        }

        public void DogRun(int distRun) {
            if (distRun > 0 & distRun <= 500) {
                System.out.println("Собака может пробежать " + distRun);
            } else System.out.println("Собака не может столько пробежать!");
        }

        public void DogSwim(int distSwim) {
            if (distSwim > 0 & distSwim <= 10) {
                System.out.println("Собака может проплыть " + distSwim);
            } else System.out.println("Собака не может столько проплыть!");
        }
    }
        public static void main(String[] args) {
            Animals animal = new Animals("Дикий");
            Animals.Cat cat1 = new Animals.Cat("Барсик", 150, 200);
            Dog dog1 = new Dog("Дик", 200, 30);
            cat1.CatInfo();
            cat1.CatRun(250);
            cat1.CatSwim(50);
            System.out.println();

            dog1.DogInfo();
            dog1.DogRun(500);
            dog1.DogSwim(9);
        }

}