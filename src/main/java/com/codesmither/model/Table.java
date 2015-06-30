package com.codesmither.model;

import java.util.List;

public class Table {

	public String className;// ԭ������
	public String classNameCamel;// ���շ�����
	public String classNameUpper;// ����ȫ��д
	public String classNameLower;// ����ȫСд

	public String name;// ԭ������
	// public String tableName_u;// ��д������
	// public String tableName_l;// Сд������

	public String remark;// �ֶ�ע��

	public TableColumn idColumn; // ID��

	public String getClassNameCamel() {
		return classNameCamel;
	}

	public void setClassNameCamel(String classNameCamel) {
		this.classNameCamel = classNameCamel;
	}

	public String getClassNameUpper() {
		return classNameUpper;
	}

	public void setClassNameUpper(String classNameUpper) {
		this.classNameUpper = classNameUpper;
	}

	public String getClassNameLower() {
		return classNameLower;
	}

	public void setClassNameLower(String classNameLower) {
		this.classNameLower = classNameLower;
	}

	// public String modelPackage;// pojo������
	// public String daoPackage;// dao������
	// public String daoImplPackage;// imp������
	// public String servicePackage;// ext������
	// public String serviceImplPackage;// xml������
	// public List<TableIndex> tableIndexs;// ������
	// public List<TableBind> tableBinds;// �������
	public List<TableColumn> columns;// ���ֶ�

	public TableColumn getIdColumn() {
		return idColumn;
	}

	public void setIdColumn(TableColumn idColumn) {
		this.idColumn = idColumn;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<TableColumn> getColumns() {
		return columns;
	}

	public void setColumns(List<TableColumn> columns) {
		this.columns = columns;
	}

	// public Set<String> importPojos;// ��Ҫ�����POJO

	// public String stringCarrayNames1;// ","ƴ�Ӵ�д�ֶ�
	// public String stringCarrayNames2;// int id ,String userCord ,..
	// public String stringCarrayNames3;// ","ƴ��ԭ�ֶ�
	// public String stringCarrayNames4;// "#{%s},"ƴ��Сд�ֶ�
	// public String stringCarrayNames5;// "%s=#{%s},"ƴ��ԭ�ֶ�-Сд�ֶ�

}
