package com.basic.pkg;

class Chocolate
{
 public static void main(String[]args)
 {
  Chocolate ch= new Chocolate();
    ch.wrapper_Count(15,15,1);
 }
 void wrapper_Count(int amount, int wrapCount, int price)
  {
   wrapCount=amount/price;
   int chocCount=wrapCount;
   int a=0;
    while(wrapCount<=15 && wrapCount>=0)
     {
       if(wrapCount>=3)
        {
         wrapCount=wrapCount-3;
          a++;
         wrapCount=wrapCount+1;
        }
          chocCount=chocCount+a;
     }
   System.out.println(chocCount);
  }
}



