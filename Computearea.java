//import java.util.Date;

import java.util.Scanner;

public class Computearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Բ�İ뾶���㰸��
		//������������
		//�ӿ���̨�������
		System.out.println("������Բ�İ뾶");
		final double PI = 3.1415926;
		Scanner input = new Scanner(System.in); 
		double radius = input.nextDouble();
		double area;
		area = radius * radius * PI;
		System.out.println("the area for the crcyle of radius " + radius + "is" + area);*/
		
		
		/*//��������ƽ�������㰸��
		System.out.println("please enter three numbers");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average = (number1 + number2 + number3) / 3;
		System.out.println("those numbers for" + "number1" + "number2" + "number3" +
		"of average is" + average);*/
		
		/*//��ʾʱ�亯��
		Date date = new Date();
		System.out.println(date);*/
		
		/*//�����������У�Ȼ����������������
		System.out.println("��������������");
		Scanner input = new Scanner(System.in);
		String city1 = input.nextLine();
		String city2 = input.nextLine();
		if(city1.compareTo(city2)>0)
		{
			System.out.println("˳��Ϊ��" + city1 + city2);
		}
		else
		{
			System.out.println("˳��Ϊ��" + city2 + city1);
		}*/
		
		//��һ��Բ��Ϊ��0,0���뾶Ϊ4��Բ�����ȡ�����㣬�������������������ε������ǵĶ���
		double jiaodu1 = (int)(Math.random() * 360);
		//System.out.printf("%3.0f\n",jiaodu1);
		double a1 = 4 * Math.cos(Math.toRadians(jiaodu1));
		double b1 = 4 * Math.sin(Math.toRadians(jiaodu1));
		System.out.println("�����һ���������ֵ");
		System.out.printf("(%7.3f %7.3f)\n",a1,b1);
		
		double jiaodu2 = (int)(Math.random() * 360);
		double a2 = 4 * Math.cos(Math.toRadians(jiaodu2));
		double b2 = 4 * Math.sin(Math.toRadians(jiaodu2));
		System.out.println("����ڶ����������ֵ");
		System.out.printf("(%7.3f %7.3f)\n",a2,b2);
		
		double jiaodu3 = (int)(Math.random() * 360);
		double a3 = 4 * Math.cos(Math.toRadians(jiaodu3));
		double b3 = 4 * Math.sin(Math.toRadians(jiaodu3));
		System.out.println("����������������ֵ");
		System.out.printf("(%7.3f %7.3f)\n",a3,b3);
		//AB ֮��ľ���a
		double a = Math.sqrt(Math.pow((a2 -a1),2) + Math.pow((b2 -b1),2));
		//AC ֮��ľ���a
		double b = Math.sqrt(Math.pow((a3 -a1),2) + Math.pow((b3 -b1),2));
		//CB ֮��ľ���a
		double c = Math.sqrt(Math.pow((a3 -a2),2) + Math.pow((b3 -b2),2));
		System.out.printf("AB�ߣ�%7.3f AC�ߣ�%7.3f CB�ߣ�%7.3f\n", a,b,c);
		double jiaoA = Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double jiaoB = Math.acos((b*b-a*a-c*c)/(-2*a*c));
		double jiaoC = Math.acos((c*c-b*b-a*a)/(-2*b*a));
		System.out.printf("��A��B��C��ֵ�ֱ�Ϊ��%4.2f %4.2f %4.2f",jiaoA,jiaoB,jiaoC);
	}

}
