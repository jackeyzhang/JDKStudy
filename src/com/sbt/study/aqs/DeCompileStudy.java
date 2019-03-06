package com.sbt.study.aqs;


public class DeCompileStudy {

  public DeCompileStudy() {
  }

  public static void main( String[] args ) {
    String s = "";
    for(int i = 0; i < 10; i++){
      //will see the +="" is string builder append
      s+= "123";
    }
    System.out.println( s );
  }
  
  //will see synchronized is moniterenter
  public  void method(){
    synchronized(this){
      System.out.println( "123" );
    }
  }

}
