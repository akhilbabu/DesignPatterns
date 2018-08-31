package com.cx.java.designpattern.builder;

/**
 * @author cerin.cx
 * @since  Aug 7, 2018
 * @version 1.0
 */
public class TestBuilderPattern
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Computer computer = new Computer.ComputerBuilder("120GB", "4GB").setBluetoothEnabled(true).setIsGraphicCardEnabled(true).build();
		System.out.println(computer);
	}

}
