public class Main {
    public static void main(String args[]){
        TheBall();
        System.out.println();
        TheBook();
        TheDog();
    }

    public static void TheBall(){
        Ball b = new Ball(14.5f, "зелёный", "резина");
        System.out.println("Радиус мяча: " + b.getR());
        System.out.println("Цвет мяча: " + b.getColor());
        System.out.println("Материал мяча: " + b.getMaterial() + "\n");

        b.setColor("красный");
        b.setR(5);

        System.out.println(b.toString());

        System.out.println();
        b.action();
        System.out.println();

        System.out.println(b.getV());
    }

    public static void TheBook(){
        Book book = new Book("Тургенев", "Отцы и дети", 1860, 200);

        System.out.println(book.toString());
    }

    public static void TheDog(){
        Dog dog = new Dog("Шарик", 5, "Хаски");
        dog.setAge(6);
        System.out.println("\n" + dog.toString() + " и делает " + dog.action());
    }
}
