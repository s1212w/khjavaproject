package com.kh.day10.zoointerface;

public class ZooRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooKeeper zk = new ZooKeeper();
		zk.feed();
		zk.feed(new Tiger());
		zk.feed(new Lion());
		zk.feed(new Bear());

	}

}
