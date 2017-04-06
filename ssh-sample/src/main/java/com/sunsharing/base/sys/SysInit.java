package com.sunsharing.base.sys;

import com.sunsharing.component.resvalidate.config.ConfigContext;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

/**
 *<pre><b><font color="blue">SysInit</font></b></pre>
 *
 *<pre><b>&nbsp;--系统初始化--</b></pre>
 * JDK版本：JDK1.0-SNAPSHOT.0
 * @author  <b>李自立</b> 
 */
public class SysInit extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/** 记录日志 */
	private static Logger logger = Logger.getLogger(SysInit.class);



	public void init(){
		
		ServletContext sc = this.getServletContext();
		logger.info("系统开始初始化...");
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
		ServiceLocator.init(ctx);
		logger.info("系统初始化上下文结束...");

		ConfigContext.instancesBean(SysParam.class);
		
		logger.info("初始化其它参数...");
		
		//初始化配置文件信息和数据库全局参数信息
		String sysPath = this.getClass().getClassLoader().getResource("/").getPath();
        logger.info("初始化其它参数结束...");
	}

	//系统刷新
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	public void destroy() {
		super.destroy();
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
