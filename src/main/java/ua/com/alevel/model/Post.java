package ua.com.alevel.model;

public class Post {
    private int id;
    //максимальная длина 100 символов
    private String title;
    //максимальная длина 1000 символов
    private String content;
    //автор сатьи
    private User author;
    //модератор (тот кто апрувит статью)
    private User moderator;
    //рейтинг статьи, может быть как отрицательный так и положительный
    private int rating;
    //статус
    private PostStatus status;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", moderator=" + moderator +
                ", rating=" + rating +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getModerator() {
        return moderator;
    }

    public void setModerator(User moderator) {
        this.moderator = moderator;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }

    public Post() {
    }

    public Post(int id, String title, String content, User author, User moderator, int rating, PostStatus status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.moderator = moderator;
        this.rating = rating;
        this.status = status;
    }

    public Post(String title, String content, User author, User moderator, int rating, PostStatus status) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.moderator = moderator;
        this.rating = rating;
        this.status = status;
    }
}
