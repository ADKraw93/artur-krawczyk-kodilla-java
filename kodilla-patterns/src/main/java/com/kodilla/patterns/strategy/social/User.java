package com.kodilla.patterns.strategy.social;

public class User {

    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return socialPublisher.share();
    }
}
