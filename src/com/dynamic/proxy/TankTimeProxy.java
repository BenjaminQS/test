package com.dynamic.proxy;
public class TankTimeProxy implements Moveable{
Moveable t;
public TankTimeProxy(Moveable t) {
super();
this.t = t;
}
@Override
public void move() {
long start = System.currentTimeMillis();
System.out.println("start...");
t.move();
long end = System.currentTimeMillis();
System.out.println("time: " + (end-start));
}
}