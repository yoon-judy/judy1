package java_hello;

class Song {
    String title;
    String singer;
    int year;
    String country;
    
    public Song() {}
    
    Song(String title, String singer, int year, String country) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }
    
    void show() {
        System.out.print(year + "년 ");
        System.out.print(country + " 국적의 ");
        System.out.print(singer + "가 부른 ");
        System.out.print(title);
    }
}
 
public class circle {
    public static void main(String[] args) {
 
        Song myFavorite = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        myFavorite.show();
        
    }
}