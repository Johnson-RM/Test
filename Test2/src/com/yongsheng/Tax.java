package com.yongsheng;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入工资（为整数）：");
        Scanner in=new Scanner(System.in);
        int salary=in.nextInt();
        int diff=salary-3500;//应纳税所得额
        float tax=0;//要纳的税
        if(diff<0) {//工资小于3500
        	
        }
        else {//工资大于3500
            if(diff-1500<0) {//工资3500到5000
            	tax=(float) (diff*0.03);
            }else {//工资大于4500
            	if(diff-4500<0) {//5000到8000
            		tax=(float) (1500*0.03+(diff-1500)*0.1);
            	}
            	else{//大于8000
            		if(diff-9000<0) {//8000到12500
            			tax=(float) (1500*0.03+3000*0.1+(diff-4500)*0.2);
            		}else {//大于12500
            			if(diff-35000<0) {//12500到38500
            				tax=(float) (1500*0.03+3000*0.1+4500*0.2+(diff-9000)*0.25);
            			}
            			else {//大于38500
            				if(diff-55000<0){//38500到58500
            					tax=(float) (1500*0.03+3000*0.1+4500*0.2+26000*0.25+(diff-35000)*0.3);
            				}
            				else {//大于58500
            				if(diff-80000<0) {//58500到83500
            					tax=(float) (1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(diff-55000)*0.35);
            				}
            				else {//大于83500
            					tax=(float) (1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(diff-80000)*0.45);
            				}
            					
            			}
            			}
            			
            		}
            	}
            }
        }
        System.out.println("所需要缴纳的税费为："+tax);
       
	}
	
}
