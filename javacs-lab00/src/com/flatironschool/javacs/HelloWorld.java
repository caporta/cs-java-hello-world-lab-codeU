package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {

      //return Double.parseDouble(System.getProperty("java.specification.version");

      String version = System.getProperty("java.version");
      int i = version.indexOf('.');
      i = version.indexOf('.', i+1);

      return Double.parseDouble(version.substring(0, i));

    }

    public static void main(String[] args) {

      System.out.println(getVersion());

    }
}
