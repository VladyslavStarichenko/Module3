package ua.com.alevel.model;

public class Subscriptions {
    private int subscription_id;
    private User user_id;
    private User follower_id;
    private User subscriber_id;

    @Override
    public String toString() {
        return "Subscriptions{" +
                "subscription_id=" + subscription_id +
                ", user_id=" + user_id +
                ", follower_id=" + follower_id +
                ", subscriber_id=" + subscriber_id +
                '}';
    }

    public int getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(int subscription_id) {
        this.subscription_id = subscription_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public User getFollower_id() {
        return follower_id;
    }

    public void setFollower_id(User follower_id) {
        this.follower_id = follower_id;
    }

    public User getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(User subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public Subscriptions() {
    }

    public Subscriptions(User user_id, User follower_id, User subscriber_id) {
        this.user_id = user_id;
        this.follower_id = follower_id;
        this.subscriber_id = subscriber_id;
    }
}
