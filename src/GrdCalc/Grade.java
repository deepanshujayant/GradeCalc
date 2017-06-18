/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrdCalc;

/**
 *
 * @author Prajesh Mehta
 */
public class Grade {
    int num1;
    int num2;
    int num3;
public String XGrade(int n1, int n2, int n3){
    int result;
    result=(n1+n2+n3)/3;
    String grade;
    
    if (result > 80){
       grade="A";
       System.out.println(grade);
    }
    else if  (result <= 80 && result>70){
        grade="B";
    
    System.out.println(grade);
    }
    else if (result <=70 && result>60){ 
    grade="C";
    
    System.out.println(grade);
    }   
    else if (result <=60 && result>50){
        grade="D";
        System.out.println(grade);
    }
    else {
        grade="E";
        System.out.println(grade);}
    
    return grade;
}

}
    
