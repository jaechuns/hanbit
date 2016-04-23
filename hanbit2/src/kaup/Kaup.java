package kaup;
public class Kaup {
	private double weight,height;
	private String name;
	
	//---------------
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight (){
		return height;
	}
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	
	
     public String getResult2 ( double weight, double height) {  
     //public String getResult2 (double~~~)은
           
            // 여기서 부터 코드//
            double idx = ( double)( weight/( height* height))*10000 ;
     String result="";
     if (idx>=30) {
                 result = "비만입니다" ;
           } else if (( idx>=24 && idx<30)) {
             result = "과체중입니다" ;
            } else if (( idx>=20 && idx<24)){
             result = "정상입니다" ;
            } else if (( idx>=15 && idx<20)){
             result = "저체중입니다" ;
            } else if (( idx>=13 && idx<15)){
             result = "마름입니다" ;
            } else if (( idx>=10 && idx<13)){
             result = "영양실조입니다" ;
            } else {
             result = "소모증입니다" ; }
       
     return result;
     }    
}
