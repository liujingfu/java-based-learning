package org.ljf.aopdemo;

/**
 * description
 *
 * @author ljf 2019/09/16 20:25
 */
public class Test1 {
    public void test(final String message){ //外部类方法

        class Test2{	//内部类

            void print(){ //内部类方法
                System.out.println(message);  //先看这里！！！
            }
        }
    }
    public static void main(String[] args){
        Test1 test1=new Test1();
        test1.test("test");
    }
}


