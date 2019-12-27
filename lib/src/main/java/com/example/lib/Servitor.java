package com.example.lib;

import java.util.Scanner;

public class Servitor {
    private Scanner scanner = new Scanner(System.in);
    private String employeeID;
    private String Name;
    private String wage;
    private String WorkHour;
    private String salary;

    public void setemployeeID(String setemployeeID){
        employeeID = setemployeeID; }
    public void setName(String setName){
        Name = setName; }
    public void setwage(String setwage){
        wage = setwage; }
    public void setWorkHour(String setWorkHour){
        WorkHour = setWorkHour; }
    public void setMonthlyIncome(String setsalary){
        salary = setsalary; }
    public void setAllVariable(){
        System.out.println("請輸入員工編號");
        setemployeeID(scanner.next());
        System.out.println("請輸入姓名");
        setName(scanner.next());
        System.out.println("請輸入時薪");
        setwage(scanner.next());
        System.out.println("請輸入本月工作時數");
        setWorkHour(scanner.next());
    }
    public void calc(){
        int SPH,WH,MI;
        SPH = Integer.parseInt(wage);
        WH = Integer.parseInt(WorkHour);
        setMonthlyIncome(String.valueOf(SPH*WH));
        System.out.printf("員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月薪是: %s \n",employeeID,Name,wage,WorkHour,salary);
    }
    public void printAllType(){
        System.out.printf("員工編號: %s 姓名: %s 時薪: %s 工作時數: %s 月收入: %s \n",employeeID,Name,wage,WorkHour,salary);
    }
}
