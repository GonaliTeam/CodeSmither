package com.codesmither.model;

import java.util.List;

public class Table {
	
	public String className;// ԭ������
//	public String className_u;// ��д������
//	public String className_l;// Сд������
	
	public String name;// ԭ������
//	public String tableName_u;// ��д������
//	public String tableName_l;// Сд������

	public String remark;// �ֶ�ע��

//	public String modelPackage;// pojo������
//	public String daoPackage;// dao������
//	public String daoImplPackage;// imp������
//	public String servicePackage;// ext������
//	public String serviceImplPackage;// xml������
//	public List<TableIndex> tableIndexs;// ������
//	public List<TableBind> tableBinds;// �������
	public List<TableColumn> columns;// ���ֶ�

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

//	public Set<String> importPojos;// ��Ҫ�����POJO

//	public String stringCarrayNames1;// ","ƴ�Ӵ�д�ֶ�
//	public String stringCarrayNames2;// int id ,String userCord ,..
//	public String stringCarrayNames3;// ","ƴ��ԭ�ֶ�
//	public String stringCarrayNames4;// "#{%s},"ƴ��Сд�ֶ�
//	public String stringCarrayNames5;// "%s=#{%s},"ƴ��ԭ�ֶ�-Сд�ֶ�

	
}
