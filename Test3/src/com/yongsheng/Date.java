package com.yongsheng;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 boolean year=false;//判断是否是闰年	
	 System.out.println("请输入日期:");	
     Scanner scanner=new Scanner(System.in);
     String date=scanner.nextLine();
     String[] a=date.split("\\-");//将日期分离
     int judgeYear=Integer.parseInt(a[0]);
     int month=Integer.parseInt(a[1]);
     int day=Integer.parseInt(a[2]);
     if(judgeYear%4==0||judgeYear%400==0) {//闰年
    	 year=true;
     }
     if(a[1].equals("01")||a[1].equals("03")||a[1].equals("05")||a[1].equals("07")||a[1].equals("08")||a[1].equals("10")||a[1].equals("12")) {
    	 //大月单独判断
    	 if(day>31) {
    		 System.out.println("您输入的日期不存在");
    	 }
    	 else if (day==31) {
    		if(month==12) {//跨年
    			judgeYear++;
    			month=1;
    			day=1;
    			System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    		}
    		else {
			month++;
			day=1;
			System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    		}
		}
    	 else {
    		 day++;
    		 System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    	 }
    	 
     }
     else if(a[1].equals("02")){
    	 if(year) {//闰年
    		 if(day>29) {
        		 System.out.println("您输入的日期不存在");
        	 }
        	 else if (day==29) {
        		
    			month++;
    			day=1;
    			System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    		}
        	 else {
        		 day++;
        		 System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
        	 }
        	 
    	 }
    	 else {//非闰年
    		 if(day>28) {
        		 System.out.println("您输入的日期不存在");
        	 }
        	 else if (day==28) {
        		
    			month++;
    			day=1;
    			System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    		}
        	 else {
        		 day++;
        		 System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
        	 }
    	 }
    	 
     }
     else {//其它小月
    	 if(day>30) {
    		 System.out.println("您输入的日期不存在");
    	 }
    	 else if (day==30) {
    		
			month++;
			day=1;
			System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
		}
    	 else {
    		 day++;
    		 System.out.println("下一天为："+judgeYear+"-"+month+"-"+day);
    	 }
     }

}
}