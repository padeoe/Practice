import java.util.ArrayList;
import java.util.Scanner;

//计算分段税率的税务  表驱动编程
public class Calculate_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入工资");
		Scanner in=new Scanner(System.in);
		double salary=in.nextDouble();
		System.out.println("税收是"+calculate_tax(salary));
		
	}
	static double calculate_tax(double salary){
		double bounds[]={0,10000,20000,30000,40000,50000,60000};
		double percentage[]={0,10,12,14,16,18,20};
		double tax=0;
		for(int i=1;i<bounds.length;i++){
			if(salary>=bounds[i]){
				tax+=(bounds[i]-bounds[i-1])*percentage[i]/100;
			}
			else{
				tax+=(salary-bounds[i-1])*percentage[i]/100;
				break;
			}
		}
		return tax;
		
	}

	static double calculate_tax2(double salary){
		double bounds[]={0,10000,20000,30000,40000,50000,60000};
		double percentage[]={0,10,12,14,16,18,20};
		ArrayList bounds_list=new ArrayList();
		bounds_list.add(bounds);
		ArrayList percentage_list=new ArrayList();
		percentage_list.add(percentage);
		double tax=0;
		
		
		
		
		for(int i=1;i<bounds.length;i++){
			if(salary>=bounds[i]){
				tax+=(bounds[i]-bounds[i-1])*percentage[i]/100;
			}
			else{
				tax+=(salary-bounds[i-1])*percentage[i]/100;
				break;
			}
		}
		return tax;
		
	}
}
