package com.sap2;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;


public class FinalTest  {
	 public static void main(String[] args){
	    ThreadTest t = new ThreadTest();
	    new ThreadTest().start();   
	    new ThreadTest().start();   
	  }
}
