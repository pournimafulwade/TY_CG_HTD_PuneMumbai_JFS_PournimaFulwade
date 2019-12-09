package com.capgemini.exrej;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataVerification {

	public boolean idVer(String userid) {
		Pattern p = Pattern.compile("\\S+");
		Matcher m = p.matcher(userid);
		if(m.matches()) {
			return true;
		} else
		return false;
	}

	public boolean nameVer(String username) {
		Pattern p2 = Pattern.compile("\\w+\\s\\w+");
		Matcher m2 = p2.matcher(username);
		if(m2.matches()) {
			return true;
		}else
		return false;
	}

	public boolean emailVer(String email) {
		Pattern p3 = Pattern.compile("\\S+");
		Matcher m3 = p3.matcher(email);
		if(m3.matches()) {
			return true;
		}else
		return false;
	}

	public boolean passVer(String pass) {
		Pattern p4 = Pattern.compile("\\S+");
		Matcher m4 = p4.matcher(pass);
		if(m4.matches()) {
			return true;
		}else
		return false;
	}

}
