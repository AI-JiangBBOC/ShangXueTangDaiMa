public class TestDateType
{
	public static void main(String[] args){
		int a = 10;//����һ����������A��ͬʱ���丳ֵ10
		int a2 = 010;//��һ������a2�ı�����ͬʱ���丳һ���˽��Ƶ�10��Ҳ����ʮ����8
		int a3 = 0x10;//����һ������a2�ı�����ͬʱ������һ��ʮ�����Ƶ�10��Ҳ����ʮ���Ƶ�16

		System.out.println(a);//���������������С�
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));//������aת���ɶ����Ƶ�ֵ��
		System.out.println(Integer.toOctalString(a));//������aת����8���Ƶ�ֵ
		System.out.println(Integer.toHexString(a));//������aת����ʮ�����Ƶ�ֵ��
	}
}