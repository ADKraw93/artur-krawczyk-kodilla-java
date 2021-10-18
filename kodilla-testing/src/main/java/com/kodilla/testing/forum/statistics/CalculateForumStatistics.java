package com.kodilla.testing.forum.statistics;

public class CalculateForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics (Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgPostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
        avgCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        avgCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
    }

    public String showStatistics(){
        return  "Number of users: " + numberOfUsers + "\n" +
                "Number of posts: " + numberOfPosts +"\n" +
                "Number of comments: " + numberOfComments + "\n" +
                "Average number of posts per user: " + avgPostsPerUser + "\n" +
                "Average number of comments per user: " + avgCommentsPerUser + "\n" +
                "Average number of comments per post: " + avgCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

}
