package rainJob.com.exercise;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.BinaryClient;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExerciseJedis {
    
    @Test
    public void testJedis(){
        Jedis jedis = new Jedis("47.93.15.203",6379);
        jedis.auth("Rain0527");
        //----PING  redis 命令----
        System.out.println("jedis.ping() = " + jedis.ping());
        //单个值  set --设置成功  返回ok 想象set集合 或者 字符串
        String name = jedis.set("name", "rain");//redis 命令 set name rain
        String age = jedis.set("age", "12"); //redis 命令 set age 12
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        //-----自增自减运算------- 返回值均是改过key的值
        Long num = jedis.incr("num"); // redis 命令 incr num
        Long incrByAge = jedis.incrBy("age", 12); //redis 命令 incrBy age 12
        System.out.println("num = " + num);
        System.out.println("incrByAge == "+incrByAge+"jedis.get(\"age\")" + jedis.get("age"));
        //------自减-------
        Long num2 = jedis.decr("num2");//redis 命令 decr num
        System.out.println("num2 = " + num2);
        Long num21 = jedis.decrBy("num2", 12);//redis 命令 decr num2 12
        System.out.println("num21 = " + num21);
        //---hash--- 不能包含重复的field -->hashMap
        Long hset = jedis.hset("fieldSet", "name", "rain");//redis 命令 hset fieldSet name rain
        Long hset1 = jedis.hset("fieldSet", "age", "rain1");//redis 命令 hset fieldSet name rain
        System.out.println("hset = " + hset);
        System.out.println("hset1 = " + hset1);
        String hgetName = jedis.hget("fieldSet", "name");
        String hgetAge = jedis.hget("fieldSet", "age");
        System.out.println("hgetName = " + hgetName);//hget fieldSet name
        System.out.println("hgetAge = " + hgetAge);//hget fieldSet age
        Map<String,String> fieldSet2map = new HashMap<>();
        fieldSet2map.put("name","jieke");
        fieldSet2map.put("age","11");
        String fieldSet2 = jedis.hmset("fieldSet2", fieldSet2map);//redis 命令 hmset fieldSet2 name jieke age 11
        System.out.println("fieldSet2 = " + fieldSet2);
        jedis.hmget("fieldSet2","name","age");//redis 命令 hmget fieldSet2 name age
        Map<String, String> fieldSet21 = jedis.hgetAll("fieldSet2"); //redis 命令 hgetAll fieldSet2 显示key及value
        System.out.println("fieldSet21 = " + fieldSet21);
        //显示map keySet.size
        Long countFieldSet2 = jedis.hlen("fieldSet2");
        System.out.println("countFieldSet2 = " + countFieldSet2); // redis命令 hlen fieldSet2
        //是否含有key keySet().contains()
        Boolean hexists = jedis.hexists("fieldSet2", "name"); //redis 命令 hexists fieldSet2 name ->有是1 没有0
        //--hash-- 自增
        Long aLong = jedis.hincrBy("fieldSet2", "age", 11);//redis 命令 hincrby fieldSet2 age 11 -->
        System.out.println("aLong = " + aLong);
        //--hash-- 获取keySet
        Set<String> fieldSet22 = jedis.hkeys("fieldSet2"); //redis 命令 hkeys fieldSet2
        System.out.println("fieldSet22 = " + fieldSet22);
        //--hash-- 获取value values();
        List<String> fieldSet23 = jedis.hvals("fieldSet2");//redis 命令 hvals fieldSet2
        System.out.println("fieldSet23 = " + fieldSet23);
        //--hash--删除
//        Long fieldSet = jedis.hdel("fieldSet"); //redis.clients.jedis.exceptions.JedisDataException: ERR wrong number of arguments for 'hdel' command
//        System.out.println("fieldSet = " + fieldSet);
        Long hdel = jedis.hdel("fieldSet2", "name");//redis 命令 hdel fieldSet2 name 0代表不存在 1代表存在
        System.out.println("hdel = " + hdel);

        // ---链表---
        /**
         * 功能：
         *      两端添加  查看列表 两端弹出 获取元素个数
         */

        //---链表--- 左侧添加
        Long rainList = jedis.lpush("rainList", "1", "2"); //redis 命令 lpush rainList 1 2 从右向左
        System.out.println("rainList = " + rainList); //返回的数组个数
        //---链表--- 右侧添加
        Long rpush = jedis.rpush("rainList", "a", "b", "c");//redis 命令 lpush rainList a b c  从左向右
        System.out.println("rpush = " + rpush); //返回的数组个数

        //---查看链表----
        List<String> rainList1 = jedis.lrange("rainList", 0, -1);//查看 redis 命令  lrange rainList 0 -1 负数倒数第一，同理-2倒数第二位。
        System.out.println("rainList1 = " + rainList1);
        //---两端弹出---
        String rainList2 = jedis.lpop("rainList"); //左侧弹出 弹出后 数组少1  redis 命令 lpop rainList  rainList 链表开头弹出一个，并显示，后链表开头少一位
        System.out.println("rainList2 = " + rainList2);
        String rainList3 = jedis.rpop("rainList");//右侧弹出 弹出后 数组少1 redis命令 rpop rainList  rainList  链表结尾弹出一个 同上 结尾少一位
        System.out.println("rainList3 = " + rainList3);

        Long rainList4 = jedis.llen("rainList"); // redis 命令 llen  rainList  查看rainList 数组个数
        System.out.println("rainList4 = " + rainList4);

        // push 与pushx 的区别是 链表存无，如果不存在，pushx不会加入，push 会加入
        jedis.lpushx("rainList","after","cc"); //redis 命令 (开头加入)lpushx rainList "after" "cc" 表示 如果rainList 右 则加 没有则不管。
        jedis.rpushx("rainListxxx","ccc","sasd");// redis 命令 (结尾加入)rpushx rainList "ccc" "sasd" 同上
        List<String> rainListxxx = jedis.lrange("rainListxxx", 0, -1);// 查看 redis 命令  lrange rainList 0 -1 负数倒数第一，同理-2倒数第二位。
        List<String> rainList5 = jedis.lrange("rainList", 0, -1); // 查看 redis 命令  lrange rainList 0 -1 负数倒数第一，同理-2倒数第二位。
        System.out.println("rainList5 = " + rainList5);
        System.out.println("jedis = " + jedis.llen("rainList"));
        //--链表 插入 -- 插入在指定元素后或者前面 链表不存在 不会产生什么后果
        jedis.linsert("rainList",BinaryClient.LIST_POSITION.AFTER,"1","ac");
        jedis.linsert("rainList",BinaryClient.LIST_POSITION.BEFORE,"1","ACE");
        rainList5 = jedis.lrange("rainList", 0, -1);
        System.out.println("rainList5 = " + rainList5);
        jedis.lpush("rootList","1","1","3","6","sa");
        /**
         * count > 0 : 从表头开始向表尾搜索，移除与 VALUE 相等的元素，数量为 COUNT 。
         * count < 0 : 从表尾开始向表头搜索，移除与 VALUE 相等的元素，数量为 COUNT 的绝对值。
         * count = 0 : 移除表中所有与 VALUE 相等的值。
         */
        Long lrem = jedis.lrem("rootList", 0, "1");
        System.out.println("lrem = " + lrem); //如果删除没有的话是0 ===改变的行数
        //--链表-- 第一个链表最后弹出，第二个链表开头添加
        jedis.rpoplpush("rainList","rootList");//不添加最后的list 也会弹出
        rainList5 = jedis.lrange("rainList", 0, -1);
        System.out.println("rainList5 = " + rainList5);
        rainList5 = jedis.lrange("rootList", 0, -1);
        System.out.println("rainList5 = " + rainList5);
        //删除全部
        jedis.del("rainList");
        jedis.del("rootList");
        //---set---List 类型不同 set集合中不予许重复的集合
        //500mb
        /**
         * 功能： 添加/删除元素  获得集合元素  集合中的差集元素 交集元素 并集
         */
        jedis.sadd("key","诺克","德莱文","火男");// 集合添加元素 sadd key "诺克" "德莱文" "火男"
        jedis.sadd("key2","诺克1","光辉","纳尔","火男"); // 集合中添加元素
        jedis.srem("key","德莱文","火男");//多条删除  srem key "删德莱文" "火男"
        Boolean sismember = jedis.sismember("key", "诺克"); //查看是否存在 sismember key "火男" 1 0
        System.out.println("sismember = " + sismember);
        Set<String> key = jedis.smembers("key"); //现数数据 redis 命令 smembers key 会显示所有元素
        System.out.println("key = " + key);
        jedis.srem("key2","诺克"); //删除空的 返回修改行数 srem key2 "诺克"
        Set<String> sdiff = jedis.sdiff("key2", "key"); //差集 sdiff key2 key  key跟key2比。key2是模板
        System.out.println("sdiff = " + sdiff);
        Set<String> sinter = jedis.sinter("key2", "key");//交集 sinter key2 key
        System.out.println("sinter = " + sinter);
        Set<String> sunion = jedis.sunion("key2", "key");//并集  sunion key2 key
        System.out.println("sunion = " + sunion);
        Long keys = jedis.scard("key2");//查看集合数量 scard key2
        System.out.println("keys = " + keys);
        String key2 = jedis.srandmember("key2"); //集合返回任意随机数 srandmember key2
        System.out.println("key2 = " + key2);
        jedis.sadd("key3","阿卡丽");
        Long sdiffstore = jedis.sdiffstore("key3", "key2");//如果就两个 第一个会被第二个替换掉  sdiffstore key3 key2 key 如果三个就是两个的差集
        Set<String> keys1 = jedis.smembers("key3");// 显示集合 smembers key3
        System.out.println("sdiffstore = " + keys1);
        Long sinterstore = jedis.sinterstore("key4", "key2", "key"); //同上两个的时候 sinterstore  key3 key2 key 如果三个就是后面俩个的交集替换掉第一个
        keys1 = jedis.smembers("key4");
        System.out.println("keys1 = " + keys1);
        Long sunionstore = jedis.sunionstore("key5", "key2", "key"); //同上两个的时候 sunionstore key2 key
        keys1 = jedis.smembers("key5");
        System.out.println("keys1 = " + keys1);
    }

    
}
