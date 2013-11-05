import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 05.11.13
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */

public class MyMapTest {
    @Test
    public void testSize() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        assertEquals("Beginner size is wrong.",0,map.size());
        map.put(1, "one");
        assertEquals("Size after adding is wrong", 1, map.size());
        map.remove(1);
        assertEquals("Size after removing is wrong",0,map.size());
    }
    @Test
    public void testIsEmpty() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        assertTrue(map.isEmpty());
        map.put(1,"one");
        assertFalse(map.isEmpty());
        map.remove(1);
        assertTrue(map.isEmpty());
    }
    @Test
    public void testContainsKey() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        assertFalse(map.containsKey(2));
        map.put(1,"one");
        map.put(2,"two");
        assertFalse(map.containsKey(4));
        assertTrue(map.containsKey(1));
    }
    @Test
    public void testContainsValue() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        assertFalse(map.containsValue(""));
        map.put(1,"one");
        map.put(2,"two");
        assertFalse(map.containsValue(""));
        assertTrue(map.containsValue("one"));
    }
    @Test
    public void testGet() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        assertNull(map.get(4));
        assertEquals("one", map.get(1));
    }

    @Test
    public void testRemove() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        map.remove(2) ;
        assertFalse(map.containsKey(2));
    }
    @Test
    public void testPutAll() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        MyMap<Integer,String> map1 = new MyMap<Integer, String>();
        map1.put(3,"three");
        map1.putAll(map);
        map1.put(4,"four");
        assertTrue(map1.containsKey(1));
        assertTrue(map1.containsKey(2));
        assertTrue(map1.containsKey(3));
        assertTrue(map1.containsKey(4));
    }
    @Test
    public void testClear() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        map.clear();
        assertEquals(0, map.size());
        map.clear();
        assertEquals(0,map.size());
    }
    @Test
    public void testKeySet() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        Set<Integer> expected  = new HashSet<Integer>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, map.keySet());
        map.clear();
        assertEquals(0,map.keySet().size());
    }
    @Test
    public void testValues() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        Collection<String> expected  = new LinkedList<String>();
        expected.add("one");
        expected.add("two");
        assertEquals(expected,map.values());
        map.clear();
        assertEquals(0, map.values().size());
    }
    @Test
    public void testEntrySet() throws Exception {
        MyMap<Integer,String> map = new MyMap<Integer, String>();
        map.put(1,"one");
        map.put(2,"two");
        Set<Map.Entry<Integer,String>> expected  = new HashSet<Map.Entry<Integer, String>>();
        expected.add(new AbstractMap.SimpleEntry<Integer, String>(1,"one"));
        expected.add(new AbstractMap.SimpleEntry<Integer, String>(2,"two"));
        assertEquals(expected,map.entrySet());
        map.clear();
        assertEquals(0,map.entrySet().size());
    }
}
