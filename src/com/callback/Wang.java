package com.callback;

public class Wang implements CallBack{

	private Li li;
	
	public Wang(Li li){
		this.li = li;
	}
	
	public void askQuestion(final String question){
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				li.executeMessage(Wang.this, question);
			}
		}).start();
		
		play();
	}
	
	public void play() {
		System.out.println("小王去玩了");
	}
	@Override
	public void solve(String result) {
		System.out.println("小李告诉小王的答案是--->" + result); 
	}
}
