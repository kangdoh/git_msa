//1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값,최솟값을 찾아서 반환하는 메소드를
//각각 다음의 형태로 정의하자
//public static int minValue(int[] arr){}
//public static int maxValue(int[] arr){}
//
//단 반복문을 사용할때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는
//새로운 for(enhanced for문)을 사용하기로 하자
package org.example;

public class Exam001 {
    Exam001(){
        int[] arr = {1,2,3,4,5};
        minValue(arr);
        maxValue(arr);
    }

    public int minValue(int[] arr){
        for (int i=0; i<arr.length ;i++){

        }
        return 10;
    }
    public int maxValue(int[] arr){
        for (int i=0; i<arr.length ;i++){

        }
        return 10;
    }
    public static void main(String[] args) {
//  이런식으로 실행할때 minValue가 static 아니라면 실행 불가?
//  인스턴스로 생성해서 사용해야 하나?
        new Exam001();

    }

}