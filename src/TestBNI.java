/**
 * 身体健康测试
 */

import java.util.Scanner;
public class TestBNI {
    public static  void test(float i){
        if(i<18.5){
            System.out.println("体重过轻");
        }else if(18.5<=i&&i<24){
            System.out.println("体重正常");
        }else if (24<=i&&i<27){
            System.out.println("体重过重");
        }else if (27<=i&&i<30){
            System.out.println("轻度肥胖");
        }else if (30<=i&&i<35){
            System.out.println("中度肥胖");
        }else if (35<=i){
            System.out.println("重度肥胖");
        } else {
            System.out.println("无");
        }
    }
    static float h,kg,BMI;
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    TestBNI zj=new TestBNI();
    System.out.println("请输入个人身高：");
    zj.h=sc.nextFloat();
    System.out.println("请输入个人体重：");
    zj.kg=sc.nextFloat();
    test(zj.BMI=kg/(h*h));






    }



}
