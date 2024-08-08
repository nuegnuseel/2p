package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (!input.equals("x")) {

            System.out.print("Input Your Name: ");

            String name = scanner.nextLine();
            System.out.println("ToDo List 중 하나 선택 하세요!");
            System.out.println("1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담");

            System.out.print("title 번호: ");
            String num = scanner.nextLine();
            System.out.println("Status:  완료");
            int num02 = Integer.parseInt(num);


            System.out.print("종료 여부: ");
            input = scanner.nextLine();



        }
    }
}