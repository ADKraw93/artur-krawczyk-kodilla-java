package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            resultList.add(String.valueOf(n));
        }
        return resultList;
    }

    @Test
    void testCalculateAdvStatisticsZeroPosts() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(1000);
        int numberOfPosts = 0;
        int numberOfComments = 13;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(0, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(13, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.013, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(1000);
        int numberOfPosts = 200;
        int numberOfComments = 500;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(200, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(500, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.2, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.5, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(2.5, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsZeroComments() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(1000);
        int numberOfPosts = 200;
        int numberOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(200, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.2, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(0, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThanComments() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(1000);
        int numberOfPosts = 200;
        int numberOfComments = 100;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(200, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(100, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.2, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.1, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(0.5, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(1000);
        int numberOfPosts = 100;
        int numberOfComments = 250;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(1000, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(100, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(250, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.1, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.25, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(2.5, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsZeroUsers() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = new ArrayList<>();
        int numberOfPosts = 10;
        int numberOfComments = 13;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(0, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(10, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(13, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(1.3, calculateStatistics.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        //Given
        CalculateForumStatistics calculateStatistics = new CalculateForumStatistics();
        List<String> listOfUsers = generateListOfUsers(100);
        int numberOfPosts = 10;
        int numberOfComments = 13;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        System.out.println(calculateStatistics.showStatistics());
        Assertions.assertEquals(100, calculateStatistics.getNumberOfUsers());
        Assertions.assertEquals(10, calculateStatistics.getNumberOfPosts());
        Assertions.assertEquals(13, calculateStatistics.getNumberOfComments());
        Assertions.assertEquals(0.1, calculateStatistics.getAvgPostsPerUser());
        Assertions.assertEquals(0.13, calculateStatistics.getAvgCommentsPerUser());
        Assertions.assertEquals(1.3, calculateStatistics.getAvgCommentsPerPost());
    }
}
