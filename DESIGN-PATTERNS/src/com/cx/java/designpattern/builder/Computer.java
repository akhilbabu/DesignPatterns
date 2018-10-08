
package com.cx.java.designpattern.builder;


public class Computer
{
	
	// Required properties.
	private String hdd;
	private String ram;
	
	//Optional properties
	private boolean isBluetoothEnabled;
	private boolean isGraphicCardEnabled;
	
	public Computer(ComputerBuilder builder)
	{
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
	}

	public static class ComputerBuilder
	{
		// Required properties.
		String hdd;
		String ram;
		
		//Optional properties
		boolean isBluetoothEnabled;
		boolean isGraphicCardEnabled;
		public ComputerBuilder(final String hdd, final String ram)
		{
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setIsGraphicCardEnabled(boolean isGraphicCardEnabled)
		{
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		/**
		 * @param isBluetoothEnabled the isBluetoothEnabled to set
		 */
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled)
		{
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build()
		{
			return new Computer(this);
		}
		
	}
	@Override
	public String toString()
	{
		return "{ "+this.hdd+" "+this.ram+" "+this.isGraphicCardEnabled+" "+this.isBluetoothEnabled+" }";
	}

}
