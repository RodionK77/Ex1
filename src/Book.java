public class Book {
    private String author;
    private String name;
    private int yearRelease;
    private int numbersPages;

    Book(){
        author = "заглушка";
        name = "заглушка";
        yearRelease = 0;
        numbersPages = 0;
    }
    Book(String author, String name, int yearRelease, int numbersPages){
        this.author = author;
        this.name = name;
        this.yearRelease = yearRelease;
        this.numbersPages = numbersPages;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getYearRelease(){
        return this.yearRelease;
    }
    public int getNumbersPages(){
        return this.numbersPages;
    }

    public String toString(){
        return "Книга автора " + author + " под названием " + name + " была выпущена в " + yearRelease + " году и имеет объём в " + numbersPages + " страниц.";
    }
}