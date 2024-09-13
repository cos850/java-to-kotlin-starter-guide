package com.lannstark.lec04;

import com.lannstark.lec04.JavaMoney;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);

    /**
     * 연산자 오버로딩 예시
     */
    System.out.println(money1.plus(money2));

    /**
     * Lazy 연산
     */
    System.out.println(lazy("AAA") || lazy("AAA"));
  }

  public static boolean lazy(String s) {
    System.out.println("call lazy()");
    return s.startsWith("A");
  }

}
