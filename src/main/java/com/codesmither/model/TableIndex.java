package com.codesmither.model;

import java.util.List;
import java.util.Map;

/**
 * ������
 * @author Administrator
 */
public class TableIndex {
	public String indexName; // ��������
	public List<String> carrayNames;// ԭ�����ֶ�
	public List<String> carrayNames_d;// ��д�����ֶ�
	public List<String> carrayNames_x;// Сд�����ֶ�
	public List<Map<String, String>> carrayNameMaps;// ԭ�ֶ�+Сд�ֶ�
	public String stringCarrayNames1;// ֱ��ƴ�Ӵ�д�ֶ�
	public String stringCarrayNames2;// ","ƴ�Ӵ�д�ֶ�
	public String stringCarrayNames3;// ����+ ","ƴ�Ӵ�д�ֶ�
	public String stringCarrayNames4;// ","ƴ��Сд�ֶ�
	public String stringCarrayNames5;// sqlMap��sql�õ� ԭ�ֶ�-Сд�ֶ�
	public boolean unique; // �Ƿ�Ψһ����
}
