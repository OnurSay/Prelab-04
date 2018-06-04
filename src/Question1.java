import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		    System.out.print("Enter Radar Coordinates [-50 to 50]: ");
	        int n1, n2;
	        n1 = keyboard.nextInt ();
	        n2 = keyboard.nextInt ();
	        System.out.println("\n"+"Enter Ship Coordinates [-100 to 100]: ");
	        int d1, d2;
	        d1 = keyboard.nextInt ();
	        d2 = keyboard.nextInt ();
		     
		     
	    
	    double distance = Math.sqrt(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)));
	    
	    final double km2nmi = 0.539;
	    int cellco = 0;
	    double distancenmi = distance*km2nmi;
	    double x,y,ifx=0,ify=0;
	    x = Math.floor(distance*100)/100;
	    y = Math.floor(distancenmi*100)/100;
	   if(x <= 50.0){
		   ifx = 50.0;
		   ify = 26.95;
	   }else if(x >= 50.0 && x <= 100.0){
		   ifx =100.0;
		   ify = 53.9;
	   }else if (x > 100.0){
		   ifx = 150.0;
		   ify = 80.855;
	   }
	    if(x>150.0){
	    	System.out.println("\n"+"No Ship at close range...");
	    	System.exit(1);
	    }
	   
	 
	    
	    
	    if(x<=50.0){
	    	System.out.println("Detected Ship within 50.0 km, 26.95 nmi");
	    }else if(x>50 && x <=100.0){
	    	System.out.println("Detected Ship within 100.0 km, 53.9 nmi");
	    }else if(x>100.0 && x <=150.0){
	    	System.out.println("Detected Ship within 150.0 km, 80.85 nmi");
	    }
	  

	  
	   
	   
	   System.out.println("Ship distance:"+x+" km, "+y+" nmi");
	   System.out.println("Ship in world-coordinates :("+d1+","+d2+")");		
	   System.out.println("Ship in radar-coordinates :("+(d1-n1)+","+(d2-n2)+")");
	   		if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) >100.0*100.0){
		           System.out.println("Ship in cell-coordinate :0");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 50.0*50.0 && (d1-n1)<0.0 && (d2-n2)>0.0){
	   			System.out.println("Ship in cell-coordinate :1");	   			
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 50.0*50.0 && (d1-n1)<0.0 && (d2-n2)<0.0){
	   			System.out.println("Ship in cell-coordinate :2");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 50.0*50.0 && (d1-n1)>0.0 && (d2-n2)<0.0){
	   			System.out.println("Ship in cell-coordinate :3");	   		
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 50.0*50.0 && (d1-n1)>0.0 && (d2-n2)>0.0){
	   			System.out.println("Ship in cell-coordinate :4");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) > 50.0*50.0 &&((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 100.0*100.0 && (d1-n1)<0.0 && (d2-n2)>0.0){
	   			System.out.println("Ship in cell-coordinate :5");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) > 50.0*50.0 &&((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 100.0*100.0 && (d1-n1)<0.0 && (d2-n2)<0.0){
	   			System.out.println("Ship in cell-coordinate :6");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) > 50.0*50.0 &&((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 100.0*100.0 && (d1-n1)>0.0 && (d2-n2)<0.0){
	   			System.out.println("Ship in cell-coordinate :7");
	   		}else if(((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) > 50.0*50.0 &&((n1-d1)*(n1-d1))+((n2-d2)*(n2-d2)) <= 100.0*100.0 && (d1-n1)>0.0 && (d2-n2)>0.0){
	   			System.out.println("Ship in cell-coordinate :8");
	   		}
	   		
		
	

	   		
	    }
	}