import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Сергей
 * Date: 04.11.13
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
public class MyMap<Tkey,Tvalue> implements Map<Tkey,Tvalue> {
    private ArrayList<Tkey> keys;
    private ArrayList<Tvalue> values;
    private int size;

    public MyMap(){
        keys = new ArrayList<Tkey>();
        values = new ArrayList<Tvalue>();
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean containsKey(Object key) {
        return keys.contains(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return values.contains(value);
    }

    @Override
    public Tvalue get(Object key) {
        if(keys.contains(key) && !isEmpty()){
            return values.get(keys.indexOf(key));
        }
        return null;
    }

    @Override
    public Tvalue put(Tkey key, Tvalue value) {
        if(keys.contains(key))
            return null;
        keys.add(key);
        values.add(value);
        size++;
        return value;
    }

    @Override
    public Tvalue remove(Object key) {
        if(!isEmpty() && keys.contains(key)){
            size--;
            Tvalue res = values.remove(keys.indexOf(key));
            keys.remove(key);
            return res;
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void putAll(Map<? extends Tkey, ? extends Tvalue> m) {
//        Iterator<Entry<Tkey,Tvalue>> itr = (Iterator<Entry<Tkey, Tvalue>>) m.entrySet().iterator();
//        while (itr.hasNext()){
//            Entry<Tkey,Tvalue> t = itr.next();
//            this.put(t.getKey(),t.getValue());
//            size++;
//        }
        for(Entry<? extends Tkey, ? extends Tvalue> x : m.entrySet()){
            this.put(x.getKey(),x.getValue());
            size++;
        }
    }

    @Override
    public void clear() {
        keys = new ArrayList<Tkey>();
        values = new ArrayList<Tvalue>();
        size = 0;
    }

    @Override
    public Set<Tkey> keySet() {
        Set<Tkey> res = new HashSet<Tkey>();
        for(Tkey x : keys){
            res.add(x);
        }
        return res;
    }

    @Override
    public Collection<Tvalue> values() {
        return values;
    }

    @Override
    public Set<Entry<Tkey, Tvalue>> entrySet() {
        Set<Entry<Tkey,Tvalue>> res = new HashSet<Entry<Tkey, Tvalue>>();
        Iterator<Tkey> kitr = keys.iterator();
        Iterator<Tvalue> vitr = values.iterator();
        while (kitr.hasNext() && vitr.hasNext()){
            res.add(new AbstractMap.SimpleEntry<Tkey, Tvalue>(kitr.next(),vitr.next()));
        }

        return res;
    }
}
