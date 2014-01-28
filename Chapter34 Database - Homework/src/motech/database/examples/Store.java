package motech.database.examples;

public class Store
{
	private int StoreID;
	private String StoreName;
	
	public int getStoreId() 
	{
		return StoreID;
	}
	public void setStoreId(int storeId) 
	{
		StoreID = storeId;
	}
	
	public String getStoreName() 
	{
		return StoreName;
	}
	public void setStoreName(String storeName) 
	{
		StoreName = storeName;
	}
	
	@Override
	public String toString()
	{
		return StoreName;
	}
}
