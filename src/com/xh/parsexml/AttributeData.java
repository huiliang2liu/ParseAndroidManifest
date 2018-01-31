package com.xh.parsexml;

public class AttributeData {

	public int nameSpaceUri;
	public int name;
	public int valueString;
	public int type;
	public int data;
	private ParseXml xml;

	public AttributeData(ParseXml xml) {
		// TODO Auto-generated constructor stub
		this.xml = xml;
	}

	public String getNameSpaceUri() {
		if (nameSpaceUri < 0) {
			return "";
		}
		return xml.getStringContent(nameSpaceUri);
	}

	public String getName() {
		if (name < 0) {
			return "";
		}
		return xml.getStringContent(name);
	}

	public String getData() {
		if (data < 0) {
			return "";
		}
		return xml.getStringContent(data);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nameSpaceUri=" + getNameSpaceUri() + " name=" + getName()
				+ " data=" + getData();
	}
}
