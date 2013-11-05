import org.junit.Test;

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
        map.put(1,"one");
        assertEquals("Size after adding is wrong",1,map.size());
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

    }
    @Test
    public void testContainsValue() throws Exception {

    }
    @Test
    public void testGet() throws Exception {

    }
    @Test
    public void testPut() throws Exception {

    }
    @Test
    public void testRemove() throws Exception {

    }
    @Test
    public void testPutAll() throws Exception {

    }
    @Test
    public void testClear() throws Exception {

    }
    @Test
    public void testKeySet() throws Exception {

    }
    @Test
    public void testValues() throws Exception {

    }
    @Test
    public void testEntrySet() throws Exception {

    }
}
