public class main {
    public static void main(String[] args) {

        Apple apple = new Apple(10);
        Human Adam = new Human(70, "Adam", "nam");
        Human Eva = new Human(50, "Eva", "nữ");

        System.out.println("Quả táo năng:" + apple.weight + "kg");
        Adam.say("I'm a Adam");
        System.out.println(Adam.name + " nặng: " + Adam.weight+ "kg," +" giới tính: " +Adam.gender);
        Eva.say("I'm a Eva"+"");
        System.out.println(Eva.name + " nặng: " + Eva.weight+ "kg," +" giới tính: " +Eva.gender+"\n");

        while (apple.isEmpty() != true){
            System.out.println("Adam ăn táo ");
            Adam.eat(apple);
            System.out.println("Quả táo còn :");
            System.out.println(apple.weight + "đv");
            System.out.println("Cân nặng của Adam là : " + Adam.getWeight() + "đv"+"\n");
            System.out.println("Eva ăn táo ");
            Eva.eat(apple);
            System.out.println("Quả táo còn: ");
            System.out.println(apple.weight + "đv");
            System.out.println("Cân nặng của Eva là : " + Eva.getWeight() + "đv"+"\n");
        }
    }
}

