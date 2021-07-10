import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: hkp
 * @create: 2021/06/02/20:20
 * @Description: what is it !
 * @Param:
 */
public class RedisTestConnec {
    public static void main(String[] args) {
        Jedis  jedis=new Jedis("localhost");
        System.out.println(jedis.ping());
        jedis.set("name","晓红");
        jedis.set("age","22");
        jedis.set("address","河南信阳");
        jedis.set("sex","女");
        System.out.println("name="+jedis.get("name")+",age="+jedis.get("age")+"\n"+"address="+jedis.get("address")+"\nsex="+jedis.get("sex"));
        System.out.println("--------------------List主例---------------");
        jedis.lpush("CacheDataBase","redis","zookeeper","mongodb","kafka","Activemq","RabbitMp");
        List<String> cacheDataBase  = jedis.lrange("CacheDataBase", 0, 5);
        for (String s : cacheDataBase) {
            System.out.println(s);
        }
        System.out.println( "-----------------hash------------------");
        Map<String,String> map=new HashMap<>();
        map.put("f1","java");
        map.put("f2","c++");
        map.put("f3","c##");
        map.put("f4","php");
        map.put("f5","python");
        map.put("f5","go");

        jedis.hmset("programLanguage",map);
        Map<String, String> programLanguage = jedis.hgetAll("programLanguage");
        for (Map.Entry<String, String> entry : programLanguage.entrySet()) {
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        System.out.println("--------------SetTest--------------------");
        jedis.sadd("红包","1元","5元","10元");
        Set<String> redBao = jedis.smembers("红包");
        for (String s : redBao) {
            System.out.println(s);
        }
        System.out.println("-----------Zset遍历------------");
        Map  map1=new HashMap<String,Double>();
        map1.put("萝卜",5.0);
        map1.put("白菜",8.0);
        map1.put("西红柿",12.5);
        map1.put("鸡蛋",15.4);
        jedis.zadd("vegetable",map1);
        Long vegetable = jedis.zcount("vegetable", 5.0, 12.4);
        System.out.println(vegetable);


    }
}
