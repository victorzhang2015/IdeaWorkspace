package scheduleTest;

import redis.clients.jedis.Jedis;

import java.util.Random;
import java.util.UUID;
/**
 * Created by Administrator on 2017-3-27.
 */
public class TaskProducer implements Runnable{
    Jedis jedis = new Jedis("192.168.41.155",6379);

    public void run() {
        Random random = new Random();
        while(true){
            try{
                Thread.sleep(random.nextInt(600) + 600);
                // 模拟生成一个任务
                UUID taskid = UUID.randomUUID();
                //将任务插入任务队列：task-queue
                jedis.lpush("task-queue", taskid.toString());
                System.out.println("插入了一个新的任务： " + taskid);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}