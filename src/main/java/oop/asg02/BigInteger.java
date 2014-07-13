package oop.asg02;
public class BigInteger
{
	private long number ;
	public long getNumber()
	{
		return number;
	}
	public void setNumber(int i)
	{
		this.number = i;
	}
	public BigInteger(int init){
		this.number = init;
	}
	public BigInteger(String init){
	try{
		this.number = Long.valueOf(init);
		} catch(Exception ex){ System.out.println("vuot qua gioi han cua kieu");}
	}
	public String toString(){
		return String.valueOf(this.number);
	}
	public boolean equals(Object other){
		return toString().equals(other.toString());
	}
	public long toLong(){
		return Long.valueOf(this.number);
	}
	public BigInteger add(BigInteger other){
		this.number+= other.getNumber();
		return this;
	}
	public BigInteger subtract(BigInteger other){
		this.number -= other.getNumber();
		return this;
	}
}