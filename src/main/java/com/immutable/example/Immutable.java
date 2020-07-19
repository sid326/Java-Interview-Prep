package com.immutable.example;

public final class Immutable{

	final int id;
	final String name;
	 
	public Immutable(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("[ ID:\t"+id);
		sb.append(" Name:\t"+name+"]");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return 0;
	}
}


