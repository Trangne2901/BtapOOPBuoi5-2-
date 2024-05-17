public class Human {
    int weight;
    String name;
    String gender;
    public Human (int weight, String name, String gender){
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public boolean checkApple(Apple apple){
      return apple.isEmpty();
    }
    public void eat(Apple apple){
        apple.decrease();
        this.weight++;
    }
    public void say( String something){
        System.out.println(something);
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

