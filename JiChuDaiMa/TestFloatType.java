public class TestFloatType
{
	public static void main(String[] args){
		double d = 3.14;//浮点类型常量默认为double类型。
		float f = 6.28F;//因为float类型占用四个字节，所以应将常数转换为float类型使用。

		double d2 = 314e-2;//采用科学记数法的写法。表示314×10^-2
		System.out.println(d2);


	}
}