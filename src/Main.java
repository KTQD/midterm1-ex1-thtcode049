public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("Từng là", "nhạc tình", "MP301", 10000, 240);

        mp3.showInfo();

        Book book = new Book("Nhà giả kim", "hành trình tìm ra kho báu cuộc đời", "NEU01", 69000, "...", 500, "truyện");

        book.showInfo();
    }
}
