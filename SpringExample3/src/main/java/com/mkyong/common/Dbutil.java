package com.mkyong.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 
 * @ClassName: Dbutil 
 * @author: Hoboson
 * @date: 2017年11月2日 下午2:28:08
 */
public class Dbutil {
    // 定义连接数据库的URL资源
   private  String url;
    // 定义连接数据库的用户名称与密码
   private  String username ;
   private  String password ;
    // 加载数据库连接驱动
   private  String className ;
	 /*
     * 功能：编写一个静态方法用于与数据库建立连接 输入参数：无 返回值：数据库连接对象
     */
    public  Connection getConnection() {
        // 定义一个连接对象
        Connection conn = null;

        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 获取数据库的连接对象
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("数据库连接建立成功...");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 返回连接对象
        return conn;
    }
	
    public static void close(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (Throwable e) {

                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement c) {
        if (c != null) {
            try {
                c.close();
            } catch (Throwable e) {

                e.printStackTrace();
            }
        }
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
    
    
}
    

