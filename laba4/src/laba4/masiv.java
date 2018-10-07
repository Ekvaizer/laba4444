package laba4;

import java.util.Random;
import java.util.Scanner;

public class masiv {
	static Scanner scn = new Scanner(System.in);
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������� ����� ����");
		System.out.println(
				"1 - ��� ������ �� ����� ����� A(n), ��� n=1,25. ����������\r\n"
						+ "�������� ������� ��� ������������ � ����������� �������.");
		System.out.println(
				"2 - ��� ������ �� ����� ����� B(n), ��� n=1,25. ����������\r\n"
						+ "����������� ������ �� �����������.");
		System.out.println(
				"3 - ��� ������ �� ����� ����� �(n), ��� n=1,20. ����������\r\n"
						+ "����� ������� �������� � ������� ��� �� �������.");
		System.out.println(
				"4 - ��� ������ �� ����� ����� D(n), ��� n=1,30. ����������\r\n"
						+ "����� ������ � �������� ��������� �������.");
		System.out.println(
				"5 - �������� ���������, ��������� �� ������� ������� 3�5\r\n"
						+ "��������� ��������� (a(i,j)< 10).");
		System.out.println(
				"6 - �������� ��������� 1 ���, ����� ��� �������� �� �������\r\n"
						+ "��� � ������������ ������� (� ������� �������� ������ ������,\r\n"
						+ "�������� maxX())");
		System.out.println(
				"7 - ���� 5 ����� s1, s2, s3, s4 � s5, �� ������ �������: ����\r\n"
						+ "������ s4 ����� ������ s5, ����� ������� ������ s1 � s2, �����\r\n"
						+ "����� ������� ������ s1 � s3.");

		int number = scn.nextInt();

		switch (number) {
			case 1 : {
				namber1();
				break;
			}
			case 2 : {
				namber2();
				break;
			}
			case 3 : {
				namber3();
				break;
			}
			case 4 : {
				namber4();
			}
			case 5 : {
				namber5();
				break;
			}
			case 6 : {
				namber6();
				break;
			}
			case 7 : {
				namber7();
				break;
			}

		}

	}

	private static void namber6() {
		int max = 0;
		int min = 0;
		int[] mas = new int[25];
		int maxI = 0;
		int minI = 0;
		for (int i = 0; i < 25; i++) {
			mas[i] = i;
		}
		for (int i = 0; i < 25; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxI = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				minI = i;
			}

		}

		int temp = mas[maxI];
		mas[maxI] = min;
		mas[minI] = max;

		System.out.println("����������� ������� " + min + " � ������������ "
				+ max + "���������� �������.");

		System.out.println();

	}
	private static void namber1() {
		// TODO Auto-generated method stub

		int max = 0;
		int min = 0;
		int[] mas = new int[25];
		int maxI = 0;
		int minI = 0;
		for (int i = 0; i < 25; i++) {
			mas[i] = i;
		}
		for (int i = 0; i < 25; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxI = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				minI = i;
			}

		}

		int temp = mas[maxI];
		mas[maxI] = min;
		mas[minI] = max;

		System.out.println("����������� ������� " + min + " � ������������ "
				+ max + "���������� �������.");

		System.out.println();

	}

	private static void namber2() {
		// TODO Auto-generated method stub

		Random rd = new Random();
		int[] array = new int[26];
		int temp = 0;
		for (int i = 0; i < 25; i++) {
			array[i] = rd.nextInt(105);
		}

		for (int i = 0; i < 25; i++) {
			System.out.print(array[i] + " ");

		}

		// ���������� ���������
		for (int i = 25; i >= 0; i--)
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}

		System.out.println();
		for (int i = 0; i < 25; i++) {
			System.out.print(array[i] + " ");

		}
	}

	private static void namber4() {
		// TODO Auto-generated method stub

		int[] mas = new int[31];
		int g = 0;
		int t = 0;
		for (int i = 1; i < 31; i++) {
			mas[i] = i;
			if (mas[i] % 2 == 0) {
				g = mas[i] + g;

			} else if (mas[i] % 2 != 0) {
				t = mas[i] + t;

			}
		}
		System.out.println("����� ������ - " + g);
		System.out.println("����� �������� - " + t);
		System.out.println("����� ������ - " + (t + g));

	}

	private static void namber3() {
		// TODO Auto-generated method stub
		int[] mas = new int[21];
		double g = 0;
		double rovno = 0;
		for (int i = 1; i < 21; i++) {
			mas[i] = i;

		}
		for (int s : mas) {
			g = (g + s);
			rovno = g / 20;
		}
		System.out.println("������� �������� = " + rovno);
	}

	private static void namber5() {
		// TODO Auto-generated method stub
		int mas[][] = new int[3][5];
		Random rd = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rd.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void namber7() {
		// TODO Auto-generated method stub
		String s1 = "1-������";
		String s2 = "2-������";
		String s3 = "3-������";
		System.out.println("������� ������ ����� 4");
		String s = scn.nextLine(); /// ��� ���� ����� ��������� ���������, ���
									/// ��� ����� ������ 4 ������� ���������
		/// ������ ��� �� ����������� 5 �������
		String s4 = scn.nextLine();
		System.out.println("������� ������ ����� 5");
		String s5 = scn.nextLine();

		if (s4.equals(s5)) {
			System.out.println(s1 + " � " + s2);
		} else {
			System.out.println(s1 + " � " + s3);
		}
	}

}
