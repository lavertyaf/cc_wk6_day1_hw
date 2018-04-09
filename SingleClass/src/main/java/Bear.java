public class Bear {
    private String name;
    private int age;
    private double weight;
    private char gender;

    public Bear(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean isAsleep() {
      return (this.weight >= 700.0) ;

    }

    public char getGender() {
        return this.gender;
    }

}
