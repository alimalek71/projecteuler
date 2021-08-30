package ir.alimalek.euler;

import java.util.*;

public class Euler014_LongestCollatzSequence {

    private static final boolean CACHE_ENABLE = true;
    private static Map<Long, Integer> cache = new HashMap<>();
    private static final long CACHE_HIT_COUNT = -1;

    public static void main(String[] args) {
        cache.put(CACHE_HIT_COUNT, 0);
        System.out.println(longestCollatzSequence(10_000_000));
    }

    private static void saveCache(long key, int value) {
        if (CACHE_ENABLE)
            cache.put(key, value);
    }

    private static int longestCollatzSequence(int maxSeqNum) {
        var start = System.currentTimeMillis();
        int longest = Integer.MIN_VALUE;
        int value = Integer.MIN_VALUE;
        for (var i = 2; i < maxSeqNum; i++) {
            int size = countCollatzSequence(i);
            if (size > longest) {
                longest = size;
                value = i;
            }
        }
        System.out.println(
                "value: " + value +
                ", size: " + longest +
                        ", time: " + (System.currentTimeMillis() - start) + " ms, cacheHit: " +
                        cache.get(CACHE_HIT_COUNT));
        return value;
    }

    private static int countCollatzSequence(int seqNum) {
        if (seqNum < 1)
            return 0;
        if (seqNum == 1)
            return 1;

        var count = 0;
        long value = seqNum;

        while (value != 1) {
            if (CACHE_ENABLE && cache.containsKey(value)) {
                cache.put(CACHE_HIT_COUNT, cache.get(CACHE_HIT_COUNT) + 1);
                count = count + cache.get(value);
                break;
            }

            if (value % 2 == 0)
                value = value / 2;
            else
                value = value * 3 + 1;

            count++;
        }

        saveCache(seqNum, count);

        return count;
    }

}
