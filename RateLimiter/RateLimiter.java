package DesignPattern.RateLimiter;

import java.util.HashMap;

public class RateLimiter {
    
    HashMap<User,SlidingWindow> mapUserRequests;

    public RateLimiter() {
        mapUserRequests = new HashMap<>();
    }

    public Boolean grantAccess(User user) {
        SlidingWindow slidingWindow;
        if(mapUserRequests.containsKey(user)) {
            slidingWindow = mapUserRequests.get(user);
        }
        else {
            slidingWindow = new SlidingWindow(4,1 );
            mapUserRequests.put(user,slidingWindow);
        }
        return slidingWindow.allowRequest();
    }
}
