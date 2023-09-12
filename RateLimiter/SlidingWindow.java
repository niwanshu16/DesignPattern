package DesignPattern.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SlidingWindow {
    
    Queue<Long> queue;
    int maximumRequestAllowed;
    int timeAllowedInSeconds;
    long timeAllowedInMilliSeconds;

    public SlidingWindow(int maximumRequestAllowed, int timeAllowedInSeconds) {
        this.maximumRequestAllowed = maximumRequestAllowed;
        this.timeAllowedInSeconds = timeAllowedInSeconds;
        this.timeAllowedInMilliSeconds = timeAllowedInSeconds*1000;
        queue = new ConcurrentLinkedDeque<>();
    }

    public boolean allowRequest() {
        return grantAccess();
    }

    private boolean grantAccess() {
        long currentTime = System.currentTimeMillis();
        long window = currentTime - timeAllowedInMilliSeconds;

        while(!queue.isEmpty()) {
            if(queue.peek() < window) 
                queue.poll();
            else
                break;
        }

        if(queue.size() < maximumRequestAllowed) {
            queue.add(currentTime);
            return true;
        }

        return false;
    }
}
