package com.tfo.event;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<Event> eventList = new ArrayList<>();
		List<Stage> stageList = new ArrayList<>();
		
		Event e1 = new Event("01", -1);
		Event e2 = new Event("02", -1);
		Event e3 = new Event("05", -1);
		Event e4 = new Event("03", -1);
		Event e5 = new Event("03", -1);
		Event e6 = new Event("01", -1);
		Event e7 = new Event("04", -1);
		Event e8 = new Event("01", -1);
		eventList.add(e1);
		eventList.add(e2);
		eventList.add(e3);
		eventList.add(e4);
		eventList.add(e5);
		eventList.add(e6);
		eventList.add(e7);
		eventList.add(e8);
		
		Stage s1 = new Stage("01");
		Stage s2 = new Stage("02");
		Stage s3 = new Stage("03");
		stageList.add(s1);
		stageList.add(s2);
		stageList.add(s3);
		
		
		
	}

}
