//4*) Подсчитать количество треугольников, у которых стороны заданы целыми числами,
// и площадь которых не больше 100.
//4.1*) Сделать задание так чтобы не было повторяющихся треугольников,
//например (3,4,5) и (5,3,4) - повторяющиеся.
package com.p0n0marenk0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task94 {
    public static final int MAX_SIDE = 200;//12354
    public static final int MAX_SQUARE = 100;

    public static void main(String[] args) {
        int count = 0;
        Set<List<Integer>> triangles = new HashSet<>();
        for (int i = 1; i <= MAX_SIDE; i++) {
            for (int j = 1; j <= MAX_SIDE; j++) {
                for (int k = 1; k <= MAX_SIDE; k++) {
                    if ((checkTriangleForRuleOfTriangle(i, j, k)) &&
                            (calculateSquareOfTriangle(i, j, k) < MAX_SQUARE)) {
                        count++;
                        List<Integer> collectionOfTriangles = Arrays.asList(i, j, k);
                        Collections.sort(collectionOfTriangles);
                        triangles.add(collectionOfTriangles);
                    }
                }
            }
        }
        System.out.println("Количество треугольников: " + count);
        System.out.println("Количество уникальных треугольников: " + triangles.size());
    }

    private static double calculateSquareOfTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean checkTriangleForRuleOfTriangle(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
