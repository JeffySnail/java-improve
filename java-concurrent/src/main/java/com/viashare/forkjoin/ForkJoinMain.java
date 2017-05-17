package com.viashare.forkjoin;

import java.util.concurrent.*;

/**
 * Created by Jeffy on 16/01/12.
 */
public class ForkJoinMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> future = forkJoinPool.submit(new CountTask(1, 5));
        System.err.println(future.get());

    }

    static class CountTask extends RecursiveTask<Integer> {

        private static final int Threshold = 3;

        private int start;

        private int end;

        public CountTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int sum = 0;
            int temp = end - start;
            System.err.println(temp);
            if (temp <= Threshold) {
                for (int i = start; i <=end; i++) {
                    sum += i;
                }
            } else {
                int millde = (end+start)/Threshold;
                CountTask task1 = new CountTask(start, millde);
                CountTask task2 = new CountTask(millde+1, end);
                task1.fork();
                task2.fork();

                int sum1 = task1.join();
                int sum2 = task2.join();
                System.err.println("sum1  "+sum1);
                System.err.println("sum2  "+sum2);
                sum = sum1 + sum2;
            }

            return sum;
        }
    }
}
