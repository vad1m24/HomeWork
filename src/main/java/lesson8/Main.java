package lesson8;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 600, 5);
        Robot murphy = new Robot("Alex Murphy", 2000, 50);
        Cat gav = new Cat("Gav", 300, 3);
        Treadmill fitness = new Treadmill("Fitness");
        Wall wall = new Wall("Great Wall");

        ivan.run(fitness);
        ivan.run(wall);
        ivan.jump(fitness);
        ivan.jump(wall);
        murphy.run(fitness);
        murphy.run(wall);
        murphy.jump(fitness);
        murphy.jump(wall);
        gav.run(fitness);
        gav.run(wall);
        gav.jump(fitness);
        gav.jump(wall);

        System.out.println("-----------------");

        Obstacle [] arrObstacle = new Obstacle[]{fitness, wall};

        Heroes [] arrHeroes = new Heroes[]{ivan, murphy, gav};
        for (int i = 0; i < arrHeroes.length; i++) {
            for (int j = 0; j < arrObstacle.length; j++) {
                arrHeroes[i].run(arrObstacle[j]);
                arrHeroes[i].jump(arrObstacle[j]);
            }
        }
    }
}
