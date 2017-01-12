package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.google.gson.Gson;
import com.model.EmployeeModel;
import com.utility.devUtility;

import tne.home.practice.EmployeeDetails;
import tne.utility.HibernateSession;

public class EmployeeDetailsAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session = null;
		List employeeDetailsModelList = null;
		EmployeeModel testModel = new EmployeeModel();
		session = HibernateSession.getSessionFactory().openSession();
		List employeeDetailsDOList = session.createCriteria(EmployeeDetails.class).list();

		if(devUtility.validateCollectionForNullSize(employeeDetailsDOList)){
			employeeDetailsModelList = new ArrayList();

			for(Iterator iterator = employeeDetailsDOList.iterator();iterator.hasNext();){
				EmployeeDetails employeeDetails = (EmployeeDetails)iterator.next();
				EmployeeModel employeeModel = setEmployeeDetailsToModel(employeeDetails);
				testModel = employeeModel;
				employeeDetailsModelList.add(employeeModel);
			}
		}
		
		String json = new Gson().toJson(employeeDetailsModelList);
		resp.setContentType("application/json");
		//System.out.println(json);
		resp.getWriter().write(json);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
	
	private EmployeeModel setEmployeeDetailsToModel(EmployeeDetails employeeDetails) {
		EmployeeModel employeeModel = new EmployeeModel();
		
		if(devUtility.validateForNullObject(employeeDetails)){
			
			employeeModel.setEmployeeId(employeeDetails.getEmployeeId());
			
			if(devUtility.validateStringForNullSize(employeeDetails.getFirstName())){
				employeeModel.setFirstName(employeeDetails.getFirstName());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getMiddleName())){
				employeeModel.setMiddleName(employeeDetails.getMiddleName());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getLastName())){
				employeeModel.setLastName(employeeDetails.getLastName());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getEmployeeCode())){
				employeeModel.setEmployeeCode(employeeDetails.getEmployeeCode());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getMobileNo())){
				employeeModel.setMobileNo(employeeDetails.getMobileNo());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getEmailId())){
				employeeModel.setEmailId(employeeDetails.getEmailId());
			}
			
			if(devUtility.validateStringForNullSize(employeeDetails.getWindowsAdsUserId())){
				employeeModel.setWindowsAdsUserId(employeeDetails.getWindowsAdsUserId());
			}
			
			if(devUtility.validateForZero(employeeDetails.getStatusId())){
				employeeModel.setStatusId(employeeDetails.getStatusId());
			}
		
		}
		
		return employeeModel;
	}
}
