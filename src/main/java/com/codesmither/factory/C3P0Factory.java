package com.codesmither.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @ClassName: JdbcUtils2
 * @Description: ���ݿ����ӹ�����
 * @author: �°�����
 * @date: 2014-10-4 ����6:04:36
 *
 */
public class C3P0Factory {

	private static ComboPooledDataSource dataSource = null;
	// ʹ��ThreadLocal�洢��ǰ�߳��е�Connection����
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	// �ھ�̬������д������ݿ����ӳ�
	static {
		String name = ConfigFactory.getDbConfigName();
		if (name != null && name.trim().length() > 0) {
			dataSource = new ComboPooledDataSource(name);
		}else {
			dataSource = new ComboPooledDataSource();
		}
	}

	/**
	 * @Method: getConnection
	 * @Description: ������Դ�л�ȡ���ݿ�����
	 * @Anthor:�°�����
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		// �ӵ�ǰ�߳��л�ȡConnection
		Connection conn = threadLocal.get();
		if (conn == null) {
			// ������Դ�л�ȡ���ݿ�����
			conn = getDataSource().getConnection();
			// ��conn�󶨵���ǰ�߳�
			threadLocal.set(conn);
		}
		return conn;
	}

	/**
	 * @throws SQLException
	 * @Method: startTransaction
	 * @Description: ��������
	 * @Anthor:�°�����
	 */
	public static void startTransaction() throws SQLException {
		// ��������
		getConnection().setAutoCommit(false);
	}

	/**
	 * @throws SQLException
	 * @Method: rollback
	 * @Description:�ع�����
	 * @Anthor:�°�����
	 *
	 */
	public static void rollback() throws SQLException {
		// �ӵ�ǰ�߳��л�ȡConnection
		Connection conn = threadLocal.get();
		if (conn != null) {
			// �ع�����
			conn.rollback();
		}
	}

	/**
	 * @throws SQLException
	 * @Method: commit
	 * @Description:�ύ����
	 * @Anthor:�°�����
	 *
	 */
	public static void commit() throws SQLException {
		// �ӵ�ǰ�߳��л�ȡConnection
		Connection conn = threadLocal.get();
		if (conn != null) {
			// �ύ����
			conn.commit();
		}
	}

	/**
	 * @throws SQLException 
	 * @Method: close
	 * @Description:�ر����ݿ�����(ע�⣬��������Ĺرգ����ǰ����ӻ������ݿ����ӳ�)
	 * @Anthor:�°�����
	 *
	 */
	public static void close() throws SQLException {
		// �ӵ�ǰ�߳��л�ȡConnection
		Connection conn = threadLocal.get();
		if (conn != null) {
			conn.close();
			// �����ǰ�߳��ϰ�conn
			threadLocal.remove();
		}
	}

	/**
	 * @Method: getDataSource
	 * @Description: ��ȡ����Դ
	 * @Anthor:�°�����
	 * @return DataSource
	 */
	public static DataSource getDataSource() {
		// ������Դ�л�ȡ���ݿ�����
		return dataSource;
	}
}