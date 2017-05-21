import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Twitter {
	
    HashMap<Integer, HashSet<Integer>> followMap;
    HashMap<Integer, Stack<Integer>> tweetMap;
    
    /** Initialize your data structure here. */
    public Twitter() {
         followMap = new HashMap<Integer, HashSet<Integer>>();
         tweetMap = new HashMap<Integer, Stack<Integer>>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        pushTweetMap(userId, tweetId);
        if(followMap.containsKey(userId)){
            HashSet<Integer> x = followMap.get(userId);
            Integer[] list = x.toArray(new Integer[x.size()]);
            for(int i=0;i<list.length;i++)
                pushTweetMap(list[i], tweetId);       
        }
    }
    
    public void pushTweetMap(int userId, int tweetId){
        Stack<Integer> tempStack;
        if(tweetMap.containsKey(userId))
            tempStack = tweetMap.get(userId);
        else
            tempStack = new Stack<Integer>();
        tempStack.push(tweetId);
        tweetMap.put(userId, tempStack);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new ArrayList<Integer>();
        int feedCount = 0;
        if(tweetMap.containsKey(userId)){
            Stack<Integer> tempStack = tweetMap.get(userId);
            while(tempStack.isEmpty() &&feedCount<10){
                newsFeed.add(tempStack.pop());
                feedCount++;
            }
        }
        return newsFeed;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        HashSet<Integer> tempSet;
        if(followMap.containsKey(followeeId))
            tempSet = followMap.get(followeeId);
        else
            tempSet = new HashSet<Integer>();
        tempSet.add(followerId);
        followMap.put(followeeId, tempSet);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        HashSet<Integer> tempSet;
        if(followMap.containsKey(followeeId)){
            tempSet = followMap.get(followeeId);
            tempSet.remove(followerId);
            followMap.put(followeeId, tempSet);
        }
    }

	public static void main(String[] args) {
		Twitter obj = new Twitter();
		obj.postTweet(1,5);
		List<Integer> param_1 = obj.getNewsFeed(1);
		obj.follow(1,2);
		obj.postTweet(2,6);
		List<Integer> param_2 = obj.getNewsFeed(1);
		obj.unfollow(1,2);
		List<Integer> param_3 = obj.getNewsFeed(1);

	}

}
