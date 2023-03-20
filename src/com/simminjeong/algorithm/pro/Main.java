package com.simminjeong.algorithm.pro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        Constructionsite con = new Constructionsite(R, new Position(a, b));

        List<Tree> treeset = new ArrayList<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Tree tree = new Tree(new Position(x, y));
            treeset.add(tree);

        }

        for (Tree tree : treeset) {
            double distance = Calculator.calculatorDistance(tree.getTreePosition().getX(),
                    tree.getTreePosition().getY(), con.getPosition().getX(),
                    con.getPosition().getY());

            if (con.getNoisyr() < distance) {
                System.out.println("slient");
            } else {
                System.out.println("noisy");
            }
        }



    }

}
