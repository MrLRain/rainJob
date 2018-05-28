package rainJob.com.exercise;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExerciseLock {
    Lock lock= new ReentrantLock();
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
//    public static void main(String[] args) {
//        final ExerciseLock exerciseLock  = new ExerciseLock();
//        new Thread(){
//            public void run() {
//                exerciseLock.insert(Thread.currentThread());
//            };
//        }.start();
//
//        new Thread(){
//            public void run() {
//                exerciseLock.insert(Thread.currentThread());
//            };
//        }.start();
//    }

    public void insert(Thread thread) {
        if(lock.tryLock()) {
            try {
                System.out.println(thread.getName()+"得到了锁");
                for(int i=0;i<5;i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }finally {
                System.out.println(thread.getName()+"释放了锁");
                lock.unlock();
            }
        } else {
            System.out.println(thread.getName()+"获取锁失败");
        }
    }

}
