package com.record_product_accepting;

public record Product(int pid,String pname) {
	
	public  Product {
		if(pid<=0)
		{
			throw new  IllegalArgumentException("Pid is Zero or null");
		}
	}
}
