import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       String pattern="@";
       
       int count =0;
       String str=s.nextLine();
       int test =s.nextInt();
       int length = str.length();
       for(int i=0 ;i<length;i++){
       		for(int j=i+1;j<(length+1);j++){
       			String substr = str.substring(i,j);
       			String temp=str;
       			temp=temp.replaceAll(substr,"X");
       			if(!pattern.contains("@"+temp+"@")){
       				int flag =0;
       				char[] ch = temp.toCharArray();
       				if(ch[0]=='X')
       						flag=1;
       				  for(int p=0;p<temp.length()-1;p++){
       					  	if(ch[p]!='X' && ch[p+1]=='X'){
       						  	flag++;
       							  if(flag==test){
      					             count ++;
      					      }
       						}
       				  }
       			  }
       			  pattern=pattern.concat(temp+"@");
       			
       		}
       		
       
       }
       System.out.println(count);
    }
}
