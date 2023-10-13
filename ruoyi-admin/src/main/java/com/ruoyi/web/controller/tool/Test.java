package com.ruoyi.web.controller.tool;


import com.extend.erp.ErpTest;
import com.extend.erp.domain.ErpWlbgmx;

public class Test {
  public static void main(String[] args){
    ErpTest erptest = new ErpTest();
    ErpWlbgmx erpObj = new ErpWlbgmx();
    String resultString = erptest.helloTest();
    String resultString2 = erptest.helloTest2();
    System.out.println(resultString);
    System.out.println(resultString2);
    System.out.println(erpObj.toString());
    System.out.println("hello test");
  }
}
