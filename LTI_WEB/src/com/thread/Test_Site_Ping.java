package com.thread;

import java.net.InetAddress;

public class Test_Site_Ping {
	public static void main(String[] args) {
		try {
			String site="www.google.com";
			InetAddress inetAddress=InetAddress.getByName(site);
			System.out.println("Sending ping request to " + site +" IP Address: "+inetAddress.getHostAddress());
			if(inetAddress.isReachable(5000)) {
				System.out.println(site+" is reachable.");
			}else {
				System.out.println(site+" NOT reachable.");
			}
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		//new Thread(new PingGoogle()).start();
		//new Thread(new PingSite("www.google.com")).start();
		new Thread(new PingSite("www.google.com",5)).start();
	}
}

/*class PingSite implements Runnable{
	private String site;
	public PingSite(String site) {
		this.site = site;
	}
	@Override
	public void run() {
		try {
			String site="www.google.com";
			InetAddress inetAddress=InetAddress.getByName(site);
			System.out.println("Sending ping request to " + site +" IP Address: "+inetAddress.getHostAddress());
			if(inetAddress.isReachable(5000)) {
				System.out.println(site+" is reachable.");
			}else {
				System.out.println(site+" NOT reachable.");
			}
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}}*/

class PingSite implements Runnable{
	private String site;
	private int count;
	public PingSite(String site,int count) {
		this.site = site;
		this.count=count;
	}
	@Override
	public void run() {
		for(int index=0; index<count;index++) {
		try {
			String site="www.google.com";
			InetAddress inetAddress=InetAddress.getByName(site);
			System.out.println("Sending ping request to " + site +" IP Address: "+inetAddress.getHostAddress());
			if(inetAddress.isReachable(5000)) {
				System.out.println(site+" is reachable.");
			}else {
				System.out.println(site+" NOT reachable.");
			}
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}}}





