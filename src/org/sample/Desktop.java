package org.sample;

public class Desktop extends Computer{
private void desktoSize() {
System.out.println("Desktop size is 24inch");
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktoSize();
	d.computerModel();
}
}
