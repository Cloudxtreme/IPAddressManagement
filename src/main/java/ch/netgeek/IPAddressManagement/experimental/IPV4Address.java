package ch.netgeek.IPAddressManagement.experimental;

/**
 * @author Ruben Knaus
 * Defines the basic elements of an IPv4 address
 */
public interface IPV4Address {
	
	/**
	 * @param addressA first octet of IP address
	 * @param addressB second octet of IP address
	 * @param addressC third octet of IP address
	 * @param addressD fourth octet of IP address
	 * @throws IllegalArgumentException if an octet doesn't match the rules of an IP address
	 */
	public void setAddress(int addressA, int addressB, int addressC, int addressD) throws IllegalArgumentException;
	
	/**
	 * 
	 * @param maskA first octet of mask
	 * @param maskB first octet of mask
	 * @param maskC first octet of mask
	 * @param maskD first octet of mask
	 * @throws IllegalArgumentException if an octet doesn't match the rules of the mask
	 */
	public void setMask(int maskA, int maskB, int maskC, int maskD) throws IllegalArgumentException;
	
	/**
	 * @return The address as String
	 */
	public String getAddress();
	
	/**
	 * @return The mask as String
	 */
	public String getMask();
	
	/**
	 * @return the CIDR notation of the mask
	 */
	public int getCIDRNotation();
	
	/**
	 * @return true if the IP address is a network address
	 */
	public boolean isNetworkAddress();
	
	/**
	 * @return true if the IP address is a broadcast address
	 */
	public boolean isBroadcastAddress();

}
