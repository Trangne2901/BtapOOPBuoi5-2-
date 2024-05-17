public class Human {
    int weight;
    String name;
    boolean gender;
    public Human (int weight, String name, boolean gender){
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }
    public boolean isMale(){
        if(this.gender){
            return true;
        }else {
            return false;
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    } public boolean checkApple(Apple){
        return Apple.isEmpty;
    }
    public void eatApple(Apple){
        if (Apple.getWeight()>0){
            Apple.decrease();
            this.weight++;

        }else {
            System.out.println("Táo đã ăn hết");
        }
    }
    public void say(String){

    }
    public String getName(){

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
