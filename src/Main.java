import cache.Cache;
import cache.factories.CacheFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cache<Integer, Integer> cache= new CacheFactory().defaultCache(3);
        cache.put(1,2);
        cache.put(2,2);
        cache.put(4,4);
        cache.put(5,4);
        System.out.println( cache.get(1));
    }
}