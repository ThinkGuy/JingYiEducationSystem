package com.JES.action;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.JES.dao.StudentDAO;
import com.JES.model.Student;
import com.JES.service.AgentService;
import com.JES.service.StudentService;

public class AgentAddStuAction extends SuperAction{
	private String id;
	private InputStream inputStream;
	private String result;
	private String uid;
	private String uname;
	private String name;
	private String phone;
	private String qq;
	private String email;
	private AgentService agentservice;
	private StudentService studentservice;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AgentService getAgentservice() {
		return agentservice;
	}
	public void setAgentservice(AgentService agentservice) {
		this.agentservice = agentservice;
	}
	public StudentService getStudentservice() {
		return studentservice;
	}
	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	
	public InputStream getInputStream() {  
        return inputStream;  
    }
	public String AddStudent(){
		Student student=new Student();
		//String mid=(String)session.getAttribute("");
		student.setUid(uid);
		student.setUname(uname);
		student.setName(name);
		student.setPhone(phone);
		student.setQq(qq);
		student.setEmail(email);
		//student.setMid(mid);
		student.setMid("我");
		student.setSign("未审核");
		if(agentservice.addStudent(student)){
		JOptionPane.showMessageDialog(null, "成功录入！","提示",  JOptionPane.WARNING_MESSAGE);
		return "haveadd";
		}
		else {
		JOptionPane.showMessageDialog(null, "录入失败,可能该学员已经被录入！","提示",  JOptionPane.WARNING_MESSAGE);
		return "haveadd";
		}
	}
	
	public String cheakUid() throws IOException{
		if(studentservice.cheakId(id)) 
			this.result="block";
		else this.result="block";
		return "SUCCESS";
	}
}
