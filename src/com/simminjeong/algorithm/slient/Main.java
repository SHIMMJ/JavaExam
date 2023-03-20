package com.simminjeong.algorithm.slient;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();// 공사 현장의 x 좌표
		int b = scanner.nextInt();// 공사 현장의 y 좌표
		int R = scanner.nextInt();// 공사장 소음의 크기
		int N = scanner.nextInt();


		for (int i = 0; i < N; i++) {
			int x_i = scanner.nextInt();
			int y_i = scanner.nextInt();

			Tree treeLocation = new Tree(x_i, y_i);
			treeLocation.caldistance(new Constructionsite(a, b, R));

		}
	}
}
