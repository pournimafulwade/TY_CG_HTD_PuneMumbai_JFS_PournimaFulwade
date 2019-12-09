package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataVerification {

	public boolean idVer(String userid)
	{
		Pattern pat =Pattern.compile("\\d+");
		Matcher mat=pat.matcher(userid);
		if(mat.matches() ==true)
		{
			return true;
		}else
			return false;
	}
	
	public boolean nameVer(String username)
	{
		Pattern pat =Pattern.compile("\\D+");
		Matcher mat=pat.matcher(username);
		if(mat.matches() ==true)
		{
			return true;
		}else
			return false;
	}
	
	public boolean emailVer(String email)
	{
		Pattern pat =Pattern.compile("\\w+\\@\\w+\\.\\w+");
		Matcher mat=pat.matcher(email);
		if(mat.matches() ==true)
		{
			return true;
		}else
			return false;
	}
	
	public boolean passVer(String password)
	{
		Pattern pat =Pattern.compile("\\S+");
		Matcher mat=pat.matcher(password);
		if(mat.matches() ==true)
		{
			return true;
		}else
			return false;
	}
	
}
