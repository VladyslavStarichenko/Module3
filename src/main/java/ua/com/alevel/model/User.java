package ua.com.alevel.model;

import java.util.List;

public class User {
    //уникальный идентификатор
    private int user_id;
    private String fullName;
    //должен быть уникальным, не null
    private String login;
    //должен быть уникальным и содержать символ '@'
    private String email;
    //не меньше 18
    private int age;
    //подписки
    private List<User> subscriptions;
    //является ли данный пользователь автором (у пользователя должно быть 1 или более публикаций)

    public Boolean isAuthor;

    public Boolean getIsAuthor() {
        return isAuthor;
    }

    public void setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
    }

    //может ли пользователь модерировать статьи
    private Boolean isModerator;

    public Boolean getIsModerator() {
        return isModerator;
    }

    public void setIsModerator(Boolean isModerator) {
        this.isModerator = isModerator;
    }

    //0 если пользователь не "автор"
    private List<User> followers;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 18){
            this.age = age;
        }else {
            throw new RuntimeException("Age is not enough");
        }

    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }


    public Boolean getAuthor() {

        return isAuthor;
    }

    public void setAuthor(Boolean author) {
        isAuthor = author;
    }

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public User() {
    }

    public User(String fullName, String login, String email, int age) {
        this.fullName = fullName;
        this.login = login;
        this.email = email;
        this.age = age;
    }

    public User(String fullName, String login, String email, int age,
                List<User> subscriptions, Boolean isAuthor, Boolean isModerator,
                List<User> followers) {
        this.fullName = fullName;
        this.login = login;
        this.email = email;
        this.age = age;
        this.subscriptions = subscriptions;
        this.isAuthor = isAuthor;
        this.isModerator = isModerator;
        this.followers = followers;
    }
}
