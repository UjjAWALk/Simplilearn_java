package com.lession3;

public class ThreadCreationEX implements Runnable{
	 
    public static int myCount = 0;
    public ThreadCreationEX(){
         
    }
    public void run() {
        while(ThreadCreationEX.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++ThreadCreationEX.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        ThreadCreationEX mrt = new ThreadCreationEX();
        Thread t = new Thread(mrt);
        t.start();
        while(ThreadCreationEX.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++ThreadCreationEX.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
