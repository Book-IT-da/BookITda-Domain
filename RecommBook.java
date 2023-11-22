package db5;

public class RecommBook {
    String title;
    String author;
    String cover_path;
    Double avgstar;
    
    public RecommBook(String title, String author, String cover_path, Double avgstar) {
        super();
        this.title = title;
        this.author = author;
        this.cover_path = cover_path;
        this.avgstar = avgstar;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover_path() {
        return cover_path;
    }

    public void setCover_path(String cover_path) {
        this.cover_path = cover_path;
    }

    public Double getAvgstar() {
        return avgstar;
    }

    public void setAvgstar(Double avgstar) {
        this.avgstar = avgstar;
    }
}
