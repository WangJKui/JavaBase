package com.wjk.java.base.jc;
/**
 * 继承
 * 向上转型
 * @author h
 *
 *  https://blog.csdn.net/eqiang8271/article/details/20717613
 */
public class Son extends Father{
	protected String name="儿子属性";  

	public String getName() {
		return name;
	}

	public void method() {  
		System.out.println("子类方法，对象类型：" + this.getClass());  
	}  
	public void methodSon() {  
		System.out.println("methodSon子类方法，对象类型：" + this.getClass());  
	} 
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {  
		Father sample = new Son();//向上转型   
		System.out.println("调用的成员："+sample.name);  
		System.out.println("调用的成员get："+sample.getName());  

		System.out.println("调用的方法：");  
		sample.method();
		sample.methodFather();
		//error 不能调用子类独有方法
		//sample.methodSon();

		
		
		/**
		 * https://www.cnblogs.com/dolphin0520/p/3780005.html
		 */
		
		/**
		 * 在通过valueOf方法创建Integer对象的时候，如果数值在[-128,127]之间，便返回指向IntegerCache.cache中已经存在的对象的引用；否则创建一个新的Integer对象。
		 */
		Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
         
        System.out.println(i1==i2);
        System.out.println(i3==i4);
		
		Double d1 = 100.0;
		Double d2 = 100.0;
		Double d3 = 200.0;
		Double d4 = 200.0;

		System.out.println(d1==d2);
		System.out.println(d3==d4);

		/**
		 * 注意，Integer、Short、Byte、Character、Long这几个类的valueOf方法的实现是类似的。

　　　		　　Double、Float的valueOf方法的实现是类似的。
		 */
		Boolean b1 = false;
		Boolean b2 = false;
		Boolean b3 = true;
		Boolean b4 = true;

		System.out.println(b1==b2);
		System.out.println(b3==b4);


		/**
		 * ：当 "=="运算符的两个操作数都是 包装器类型的引用，则是比较指向的是否是同一个对象，
		 * 而如果其中有一个操作数是表达式（即包含算术运算）则比较的是数值（即会触发自动拆箱的过程）。
		 */
		/***
		 * 　第一个和第二个输出结果没有什么疑问。
		 * 第三句由于  a+b包含了算术运算，因此会触发自动拆箱过程（会调用intValue方法），因此它们比较的是数值是否相等。
		 * 第四句而对于c.equals(a+b)会先触发自动拆箱过程，再触发自动装箱过程，也就是说a+b，会先各自调用intValue方法，
		 * 得到了加法运算后的数值之后，便调用Integer.valueOf方法，再进行equals比较。同理对于后面的也是这样，
		 * 不过要注意倒数第二个和最后一个输出的结果（如果数值是int类型的，装箱过程调用的是Integer.valueOf；如果是long类型的，装箱调用的Long.valueOf方法）。
		 */
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;
		Long h = 2L;

		System.out.println(c==d);//true
		System.out.println(e==f);//false
		System.out.println(c==(a+b));//true
		System.out.println(c.equals(a+b));//true
		System.out.println(g==(a+b));//true
		System.out.println(g.equals(a+b));//false
		System.out.println(g.equals(a+h));//true 为不同的类型的对象，所以输出false；
		//源码
		//obj 必须为 Long的的实例时才返回数值 
		//如果传入的类型不是Long,那么全部返回false,这就是原因
		/* public boolean equals(Object obj) {
		        if (obj instanceof Long) {
		            return value == ((Long)obj).longValue();
		        }
		        return false;
		    }*/
		/**
		 * 对于a+h，先自动触发拆箱，就变成了int类型和long类型相加，这个会触发类型晋升，结果是long类型的，然后会触发装箱过程，就变成Long了。因此比较结果是true。
		 */
		
		 /*public boolean equals(Object obj) {
		        if (obj instanceof Integer) {
		            return value == ((Integer)obj).intValue();
		        }
		        return false;
		    }*/
		System.out.println(d.equals(g));//false 为不同的类型的对象，所以输出false；

	}








}
