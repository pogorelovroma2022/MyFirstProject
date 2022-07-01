//package level4.lesson4.part3;
//
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class WaitNotifyExample {
//    public static void main(String[] args) {
////        Store store = new Store();
//        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>();
//        Producer producer = new Producer(queue);
//        Consumer consumer = new Consumer(queue);
//
//        producer.start();
//        consumer.start();
//
//        // deadlock = взаимная блокировка
//    }
//}
//
////class Store {
////    int product;
////
////    Lock lock = new ReentrantLock();
////    Condition producerLock = lock.newCondition();
////    Condition consumerLock = lock.newCondition();
////
////    synchronized void buy() throws InterruptedException {
////        while (product >= 3) {
////            producerLock.await();
////        }
////        System.out.println("Магазин покупает продукты");
////        product++;
////        System.out.println("Количество продуктов: " + product);
////        consumerLock.signalAll();
////    }
////
////    synchronized void sell() throws InterruptedException {
////        while (product == 0) {
////            consumerLock.await();
////        }
////        System.out.println("Магазин продаёт продукты");
////        product--;
////        System.out.println("Количество продуктов: " + product);
////        producerLock.signalAll();
////    }
////}
//
//class Producer extends Thread{
//    BlockingQueue<Integer> queue;
//
//    public Producer(BlockingQueue<Integer> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                queue.put(i);
//            } catch (InterruptedException e) {}
//        }
//    }
//}
//
//class Consumer extends Thread {
//    Store store;
//
//    public Consumer(Store store) {
//        this.store = store;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            try {
//                store.sell();
//                // queue.take();
//            } catch (InterruptedException e) {}
//        }
//    }
//}