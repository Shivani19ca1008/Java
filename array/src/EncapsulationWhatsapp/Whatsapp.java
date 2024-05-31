package EncapsulationWhatsapp;

import Encapsulation.Student;

public class Whatsapp {
 
	private int phn_no;
	private String status;
	private String bio;
	
	Whatsapp(int phn_no ,String status ,String bio){
		this.phn_no = phn_no;
		this.status = status;
		this.bio = bio;
	}
	public int getphnNo() {
		return phn_no;
	}
	public void setphnNo() {
		this.phn_no = phn_no;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus() {
		this.status = status;
	}
	public String getBio() {
		return bio;
	}
	public void setbio() {
		this.bio = bio;
	}
	public static void main(String[] args) {
//		Whatsapp w = new Whatsapp(345,"sdfrgyh","sdfg");
//		System.out.println(w.getBio());
	}
}

