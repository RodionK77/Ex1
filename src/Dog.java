public class Dog {
    private String name;
    private String breed;
    private int age;

    Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getBreed(){
        return this.breed;
    }

    public String action(){
        return"ГАВ-ГАВ";
    }

    public String toString(){
        return "Собака по породы " + breed + " с именем " + name + " имеет возраст " + age;
    }

}