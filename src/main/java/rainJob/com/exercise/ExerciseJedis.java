package rainJob.com.exercise;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class ExerciseJedis {
    
    @Test
    public void testJedis(){
        Jedis jedis = new Jedis("47.93.15.203",6379);
        // PING  redis 命令
        System.out.println("jedis.ping() = " + jedis.ping());
        //单个值  set --设置成功  返回ok
        String name = jedis.set("name", "rain");//redis 命令 set name rain
        String age = jedis.set("age", "12"); //redis 命令 set age 12
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        //自增自减运算
        Long num = jedis.incr("num");
        Long incrByAge = jedis.incrBy("age", 12);
        System.out.println("num = " + num);
        System.out.println("incrByAge == "+incrByAge+"jedis.get(\"age\")" + jedis.get("age"));

    }
    
}
