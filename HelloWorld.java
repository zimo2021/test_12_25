package javatest;

/*public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hello world");
        //字符串常量
        System.out.println("张三");
        System.out.println("______________________");
        //数值常量
        System.out.println(666);
        System.out.println(3.14);
        //字符常量
        System.out.println('A');
        System.out.println('0');
        System.out.println('我');//只能填一个字符 如果填‘我是’就会报错
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量
        //System.out.println(null);空常量不可输出

    }
}*/
/*
public class HelloWorld{
    public static void main(String[] args){
        //变量的定义和输出
        int a=10;
        System.out.println(a);//10
        a=20;
        System.out.println(a);//20
        //变量使用的注意事项
        //long类型数据使用时 为了防止数据类型过大 要在数据后加L
        */
/*long l=100000000000000000;//报错 java: 整数太大 此处100000000000000000默认为int类型 而不是long类型
        java中整形数据都默认为int类型
        System.out.println(l);*//*

        //解决
        long l=100000000000000000L;//可以了
        System.out.println(l);
        //float类型定义时 为了防止类型不兼容 要在数据后加F
        */
/*float f=3.14;
        System.out.println(f);//报错 java: 不兼容的类型: 从double转换到float可能会有损失*//*

        //解决
        float f=3.14F;
        System.out.println(f);//可以了

    }
}*/
//类型转换
/*
public class HelloWorld{
    public static void main(String[] args){
        //自动类型转换（从可储存数据范围大的到可储存类型小的转换）
        byte b=10;
        int a=b;
        short c=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int m=(int)3.14;
        System.out.println(m);//3
    }
}*/
//算数运算符
/*public class HelloWorld{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println(a+b);//30
        char m='A';
        System.out.println(m+a);//75 ASCII码转换
    }
}*/

//public class HelloWorld{
//    public static void main(String[] args){
//        int a=1;
//        System.out.println("a="+a);//a=10 这样输出的
//        //逻辑运算符(包括'&' '|' '&&' '||')在a++&b++和a++|b++中不论a怎么样 b++都要执行 而在a++&&b++和a++||b++中 如果前者a++为假 则b++
//        //不执行 后者a++为真 b++不执行
//        int b=1;
//        System.out.println(a++>10&b++>10);//false a=2 b=2
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("---------------------");//false a=3 b=3
//        System.out.println(a++>10|b++>10);
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("---------------------");//false a=4 b=3
//        System.out.println(a++>10&&b++>10);
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("---------------------");//false a=5 b=3
//        System.out.println(a++<10||b++>10);
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.out.println("---------------------");
//        int a=1,b=2;
//        System.out.println(a+" "+b);//1 2 用加号相隔
//    }
//}
//public class HelloWorld{
//    public static void main(String[] args){
//        //三目运算符
//        int a=10,b=20;
//        int c=a>b?a:b;
//        System.out.println(c);//20
//    }
//}
//数据的输入
//分为三步导包（在public前导包）(import java.util.Scanner;)
//创建对像（scanner 对象名 = new scanner(System.in);）
//输入数据(int 变量名=对象名.nextInt();)
//import java.util.Scanner;
//public class HelloWorld{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();//输入10
//        System.out.println("x="+x);//x=10
//    }
//}
//import java.util.Scanner;
//public class HelloWorld{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println("a="+a);
//        a=sc.nextInt();
//        System.out.println("a="+a);
//    }
//}
//输入三个值 并求出其中最大的数
//import java.util.Scanner;
//public class HelloWorld{
//    public static void main(String[] args){
//        int a,b,c;
//        Scanner sc=new Scanner(System.in);
//        a=sc.nextInt();
//       b=sc.nextInt();
//        c=sc.nextInt();
//        if(a<b)a=b;
//        if(a<c)a=c;
//        System.out.println("最大值为："+a);//可以了
//        if(a%2==0)System.out.println(a+"是偶数");
//        else{
//            System.out.println(a+"是奇数");
//        }
//        switch(a)
//        {
//            case 1:
//                System.out.println(a);
//                break;
//            case 2:
//                System.out.println(a);
//                break;
//            case 3:
//                System.out.println(a);
//                break;
//            default:
//                System.out.println(a);
//                break;
//        }
//    }
//}
//switch case 和c++相同
//for循环
//public class HelloWorld{
//    public static void main(String[] args){
//        for(int i=0;i<5;i++){
//            System.out.println("hello world!");//OK
//        }
//    }
//}
//用for循环计算1到100之间的偶数和
//public class HelloWorld{
//    public static void main(String[] args){
//        int sum=0;
//        for(int i=0;i<=100;i+=2){
//            sum+=i;
//        }
//        System.out.println("1到100的所有偶数和为："+sum);
//    }
//}


//Random 用于产生一个随机数
//import java.util.Random;
//public class HelloWorld{
//    public static void main(String[] args){
//        Random ra=new Random();
//        int num=ra.nextInt(10);//随机产生一个0到9的数字
//        System.out.println("num="+num);
//        int a=ra.nextInt(100)+1;//随机产生一个1到100的数
//        System.out.println("a="+a);
//    }
//}
//快捷键 psvm+enter 快速生成public static void main(String[] args)
//sout+enter 快速生成System.out.println();
//ctrl+alt+L 格式化  即使格式更美观
//ctrl+alt+space(空格）：内容辅助键（内容提示，代码补全等）
//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.println(111);
//    }
//}
//数组
//public class HelloWorld{
//    public static void main(String[] args) {
//        int[] arr=new int [3];
//        System.out.println(arr);//[I@10f87f48  代表arr数组的地址
//        System.out.println(arr[0]);//0
//        System.out.println(arr[1]);//0
//        System.out.println(arr[2]);//0  代表初始化为0
//    }
//}
//public class HelloWorld{
//    public static void main(String[] args) {
//        int[] a=new int [3];
//        for(int i=0;i<3;i++){
//            a[i]=i;
//            System.out.println(a[i]);//0 1 2
//        }
//    }
//}

//public class HelloWorld{
//    public static void main(String[] args) {
//        int[] a=new int [3];
//        int[] b=a;
//        for(int i=0;i<3;i++){
//            b[i]=i;
//            System.out.println(a[i]);//0 1 2 相当于引用
//        }
//
//    }
//}
//数组的静态初始化
//public class HelloWorld{
//    public static void main(String[] args) {
//        int[] arr=new int[]{1,2,3};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        //简化版
//        int[] a={1,2,3};//以后就用这个
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        for(int i=0;i<a.length;i++){//数组可以用数组名。length
//            System.out.println(a[i]);
//        }
//    }
//}


//方法（类似于函数）
//public class HelloWorld{
//    public static void main(String[] args) {
//        isevennumber();//主函数调用
//    }
//    public static void isevennumber(){
//        int num=10;
//        if(num%2==0){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//    }
//
//}
//方法的传参调用
//public class HelloWorld{
//    public static void main(String[] args) {
//        getmax(10,20);
//        int a=10;
//        int b=20;
//        getmax(a,b);//带变量
//    }
//    public static void getmax(int a,int b){
//        if(a>b){
//            System.out.println(a);
//        }
//        else{
//            System.out.println(b);//20
//        }
//    }
//}

//带返回值的方法调用
//public class HelloWorld{
//    public static void main(String[] args) {
//        int ret=getmax(10,20);
//        System.out.println(ret);//20
//    }
//    public static int getmax(int a,int b){
//        if(a>b){
//            return a;
//        }
//        else{
//            return b;
//        }
//    }
//}

//方法重载
/*
方法重载
多个方法在同一个类中
多个方法方法名相同
多个方法参数，类型，或数量不同（与方法返回值无关）
 */
//public class HelloWorld{
//    public static void main(String[] args) {
//        System.out.println(sum(10,20));//30
//        System.out.println(sum(10,20,30));//60
//
//        sum((byte)10,(byte)20);//byte int数据类型比byte大 可以直接强转
//        sum(10L,20L);//long  int类型比long小 需声明10和20为long类型
//
//    }
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    public static void sum(byte a,byte b){
//        System.out.println("byte");
//    }
//    public static void sum(long a,long b){
//        System.out.println("long");
//    }
//}


//引用传递
//public class HelloWorld{
//    public static void main(String[] args) {
//       int a=10;
//        change(a);
//        System.out.println(a);//10无用
//    }
//    public static void change(int a){//不行
//        a=100;
//    }
//}

//class demo{
//    int a;//相当于类
//}
//public class HelloWorld{
//    public static void main(String[] args) {
//        demo d=new demo();//demo相当于自定义类型
//        d.a=10;
//        change(d);//这里传的是地址
//        System.out.println(d.a);//100
//        int[] arr={1,2,3};
//        change(arr);//这里传的是arr的首地址
//        System.out.println(arr[0]);//100
//    }
//    public static void change(demo d){
//        d.a=100;
//    }
//    public static void change(int[] a){
//        a[0]=100;
//    }
//}



/*
System.out.print(内容);//输出内容不换行
System.out.println(内容）;//输出内容并换行
System.out.println();//可以起换行作用
 */
//public class HelloWorld{
//    public static void main(String[] args) {
//        int[] a={1,2,3};
//        for(int i=0;i<a.length;i++)
//        {
//            if(i==a.length-1)
//            {
//                System.out.println(a[i]);
//            }else{
//                System.out.print(a[i]+", ");//1, 2, 3
//            }
//
//        }
//    }
//}

//import java.util.Scanner;
//import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

//        int a,b,c;
//        Scanner sc=new Scanner(System.in);
//        a=sc.nextInt();
//       b=sc.nextInt();
//        c=sc.nextInt();
//输入两个值并比较大小
//import java.util.Scanner;
/*
导包：
1.自动导包 手动输入：import java.unit.Scanner;
2.快捷键导包：若没有导包 则Scanner为红色 我们可以选中他 按alt+enter 在选择导入类即可
3.在没有导包的情况下输入Scanner过程中就直接按enter补全 系统会自动导包
 */
//public class HelloWorld{
//    public static void main(String[] args) {
//        int a,b;
//        Scanner sc=new Scanner(System.in);
//        a=sc.nextInt();
//
//        b=sc.nextInt();
//        System.out.println(getmax(a,b));
//    }
//    public static int getmax(int a,int b){
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
//}


//类的声明和使用
//public class phone{//
//
//}//错误  不能在HelloWorld类中声明其他类  需要在当前包内新建另一个类phone
//public class HelloWorld{
//    public static void main(String[] args) {
//        phone p=new phone();
//        System.out.println(p);
//        System.out.println(p.brand);//null
//        System.out.println(p.price);//0
//        p.brand="小米";
//        p.price=1000;
//        System.out.println(p.brand);//小米
//        System.out.println(p.price);//1000
//        p.call();//打电话
//        p.sendmessage();//发短信
//        //phone[] a=new phone[3];
////        System.out.println(a[0].brand);//不行  输不出来
////        System.out.println(a[1].price);//不行  输不出来
//        int[] arr=new int[10];
//        System.out.println(arr[1]);//0
//    }
//}

//private关键字的使用

//public class HelloWorld{
//    public static void main(String[] args) {
//        student s=new student();
//        s.set(10);
//        System.out.println(s.getage());//10
//        s.set(20);
//        System.out.println(s.getage());
//    }
//}

//this的应用
//this关键字的使用














