package com.codesmither.model;

/**
 * ���ֶ�
 * 
 * @author Administrator
 * 
 */
public class TableColumn {
	
	public String name;// ԭ����
	public String type;// �ֶ���������
	public String remark;// �ֶ�ע��
	public int lenght;//�г���
	public int typeInt;//���ݿ�������
	public String fieldName;//java �ֶ�
	public String fieldNameUpper;// ����ĸ��д
	public String fieldNameLower;// ����ĸСд
	public String fieldType;//java �ֶ�����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getTypeInt() {
		return typeInt;
	}
	public void setTypeInt(int typeInt) {
		this.typeInt = typeInt;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldName_u() {
		return fieldNameUpper;
	}
	public void setFieldName_u(String fieldName_u) {
		this.fieldNameUpper = fieldName_u;
	}
	public String getFieldName_l() {
		return fieldNameLower;
	}
	public void setFieldName_l(String fieldName_l) {
		this.fieldNameLower = fieldName_l;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	
	
}
