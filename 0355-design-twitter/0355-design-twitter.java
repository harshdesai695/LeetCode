import java.util.*;

class Twitter {

    HashMap<Integer, Set<Integer>> followMap = new HashMap<>();
    HashMap<Integer, List<Tweet>> postMap = new HashMap<>();
    int timeStamp = 0;

    static class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    public Twitter() {}

    public void postTweet(int userId, int tweetId) {
        postMap.computeIfAbsent(userId, k -> new ArrayList<>())
               .add(new Tweet(tweetId, timeStamp++));
    }

    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> users = new HashSet<>();
        users.add(userId);
        if (followMap.containsKey(userId)) {
            users.addAll(followMap.get(userId));
        }
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>(
            (a, b) -> b.time - a.time
        );
        for (int uid : users) {
            List<Tweet> tweets = postMap.get(uid);
            if (tweets != null) {
                maxHeap.addAll(tweets);
            }
        }
        List<Integer> feed = new ArrayList<>();
        int n = 0;
        while (!maxHeap.isEmpty() && n < 10) {
            feed.add(maxHeap.poll().id);
            n++;
        }
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        followMap.computeIfAbsent(followerId, k -> new HashSet<>())
                 .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            Set<Integer> followsSet = followMap.get(followerId);
            followsSet.remove(followeeId);
            if (followsSet.isEmpty()) {
                followMap.remove(followerId);
            }
        }
    }
}
