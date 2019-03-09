package Software_Master_A.client_and_server;

public class Account
{

	String username;
	String password;
	String cookie;
	Department department;
	boolean isAdmin;
	
	String testCredential(String password)
	{
		return null;
	}

	
	/**
	 * @param username
	 * @param password
	 */
	public Account(String username, String password)
	{
		this(username, password, null, false);
	}

	public Account(String username, String password, boolean isAdmin)
	{
		this(username, password, null, isAdmin);
	}


	/**
	 * @param username
	 * @param password
	 * @param cookie
	 * @param department
	 * @param isAdmin
	 */
	public Account(String username, String password, Department department, boolean isAdmin)
	{
		super();
		this.username = username;
		this.password = password;
		this.department = department;
		this.isAdmin = isAdmin;
	}


	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the cookie
	 */
	public String getCookie()
	{
		return cookie;
	}

	/**
	 * @param cookie the cookie to set
	 */
	public void setCookie(String cookie)
	{
		this.cookie = cookie;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment()
	{
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department)
	{
		this.department = department;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin()
	{
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
	
	
	
}