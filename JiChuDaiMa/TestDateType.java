public class TestDateType
{
	public static void main(String[] args){
		int a = 10;//定义一个变量名叫A，同时对其赋值10
		int a2 = 010;//定一个名叫a2的变量，同时对其赋一个八进制的10，也就是十进制8
		int a3 = 0x10;//定义一个名叫a2的变量，同时对它付一个十六进制的10，也就是十进制的16

		System.out.println(a);//输出这个变量并换行。
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));//将变量a转换成二进制的值。
		System.out.println(Integer.toOctalString(a));//将变量a转换成8进制的值
		System.out.println(Integer.toHexString(a));//将变量a转换成十六进制的值。
	}
}