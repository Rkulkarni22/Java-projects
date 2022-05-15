import java.util.Scanner;

class Cars
{
	String type;
	double cc;
	String Transmission;
	int Price;

	Cars(double cc,String Transmission,int Price)
	{
		this.cc = cc;
		this.Transmission = Transmission;
		this.Price = Price;

		System.out.println("cc:- "+cc);
		System.out.println("Transmission:- "+Transmission);
		System.out.println("Price:- "+Price);
	}
}


//***********************Sedan*******************************


class Sedan extends Cars
{
	String type;
	Sedan(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Mercedes_Benz_sclass extends Sedan
{
	Mercedes_Benz_sclass(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Audi_A8 extends Sedan
{
	Audi_A8(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Lexus_Ls extends Sedan
{
	Lexus_Ls(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Toyota_Camry extends Sedan
{
	Toyota_Camry(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Honda_Civic extends Sedan
{
	Honda_Civic(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Maruti_Suzuki_Ciaz extends Sedan
{
	Maruti_Suzuki_Ciaz(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


//************************JDM**********************************
class JDM extends Cars
{
	String type;
	JDM(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Nissan_Skyline extends JDM
{
	Nissan_Skyline(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Toyota_Supra_MKIV extends JDM
{
	Toyota_Supra_MKIV(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Mitsubishi_Lancer_EVOIV extends JDM
{
	Mitsubishi_Lancer_EVOIV(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Mazda_RX_7 extends JDM
{
	Mazda_RX_7(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Honda_Civic_Hatchback extends JDM
{
	Honda_Civic_Hatchback(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Lexus_SC300 extends JDM
{
	Lexus_SC300(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


//****************************American_muscle****************************************

class American_Muscle extends Cars
	{
	String type;
	American_Muscle(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
    }


class Dodge_Charger extends American_Muscle
{
	Dodge_Charger(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


class Ford_Mustang extends American_Muscle
{
	Ford_Mustang(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Chevy_Camaro extends American_Muscle
{
	Chevy_Camaro(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Dodge_Challenger extends American_Muscle
{
	Dodge_Challenger(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}


// *************************Pickups*************************************


class Pickup extends Cars
{
	String type;
	Pickup(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Toyota_Hilux extends Pickup
{
	Toyota_Hilux(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Ford_F150 extends Pickup
{
	Ford_F150(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Mahindra_camper extends Pickup
{
	Mahindra_camper(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

class Isuzu_Dmax extends Pickup
{
	Isuzu_Dmax(double cc,String Transmission,int Price)
	{
		super(cc,Transmission,Price);
	}
}

//*******************Driver*************************
class main1
{
	public static void main(String [] args)
	{
		System.out.println("Welcome To Ride For Life Automotives");
		System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("All types of Cars and Mods Are Available");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("Please select below options accordingly");
		System.out.println("1.Sedan \n 2.JDM \n 3.American_Muscle \n 4.Pickup");

	Scanner sc= new Scanner(System.in);
	int type=sc.nextInt();

/*------------------------Start of switches------------------*/

/* ----------------------Sedan switch case-------------------*/
switch (type)
{

case 1:System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       System.out.println("Heartly Welcome to Sedan department");
	   System.out.println("Select The car from the list given below");
	   System.out.println("1.Mercedes_Benz_sclass \n 2.Audi_A8 \n 3.Lexus_Ls \n 4.Toyota_Camry \n 5.Honda_Civic \n 6.Maruti_Suzuki_Ciaz");
	   int Sedan_Model=sc.nextInt();

/*---------------------------cars inside Sedan case-----------------*/
	   switch (Sedan_Model)
	   {
		   case 1:
		   System.out.println("It's a Mercedes Benz sclass ");
		   System.out.println("\n Luxury Model");
		   Mercedes_Benz_sclass ref4=new Mercedes_Benz_sclass(3896.0,"v8-9-speed automatic ",17000000);
           System.out.println("\n Standard Model");
		   Mercedes_Benz_sclass ref5=new Mercedes_Benz_sclass(2900.0," V-6 Diesel 9-speed Automatic ",8500000);

		   break;

		   case 2:
		   System.out.println("It's a Audi A8");
		   System.out.println("\n Single variant");
		   Audi_A8 ref6=new Audi_A8(2995.0,"Petrol V-6 Automatic",157000000);
		   
		   break;

		   case 3:
		   System.out.println("It's a Lexus Ls");
		   System.out.println("\n Ultra luxury variant");
		   Lexus_Ls ref7=new Lexus_Ls(3456.0,"4 -speed Torque Converter Auto and 6-step CVT Auto",22624547);
		   System.out.println("\n Standard variant");
		   Lexus_Ls ref8=new Lexus_Ls(3456.0,"4 -speed Torque Converter Auto and 6-step CVT Auto",22209000);

		   break;


		   case 4:
	       System.out.println(" It's a Toyota Camry");
		   System.out.println("\n Single variant");
		   Toyota_Camry ref9=new Toyota_Camry(2487.0,"Petro-electric Hybrid Automatic(CVT)",4300000);

		   break;

		   case 5:
		   System.out.println("It's a Honda Civic");
		   System.out.println("\n Base varient");
		   Honda_Civic ref10=new Honda_Civic(1799.0,"4-cyliner Petrol Manual",1500000);
		   System.out.println("\n Top variant");
		   Honda_Civic ref11=new Honda_Civic(1799.0,"4-cyliner Automatic",1944900);

		   break;


		   case 6:
		   System.out.println("It's a Maruti Suzuki ciaz");
		   System.out.println("\n Base variant ");
		   Maruti_Suzuki_Ciaz ref12=new Maruti_Suzuki_Ciaz(1462.0,"4-cylinder petrol manual",887000); 
		   System.out.println("\n Top varient");
		   Maruti_Suzuki_Ciaz ref13=new Maruti_Suzuki_Ciaz(1462,"4-cylinder petrol automatic",1360787); 
            
		   break;

		   default: System.out.println("Invalid Input");
      }
	  break;
/***********************************JDM case*******************************************/
	  case 2:
	  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
	  System.out.println("Heartly welcome to JDM department");
	  System.out.println("Select your JDM from  list give below");
	  System.out.println("1.Nissan_Skyline \n 2.Toyota_Supra_MKIV \n 3.Mitsubishi_Lancer_EVOIV  \n 4.Mazda_RX_7 \n 5.Honda_Civic_Hatchback \n 6.Lexus_SC300 ");
	  int JDM_Model=sc.nextInt();
	  
	  switch (JDM_Model)
		  {
		  case 1:
			  System.out.println("It's a Nissan Skyline R34");
			  System.out.println("1999 model ");
	          Nissan_Skyline ref14=new Nissan_Skyline(2600,"2.6L 24v inline 6 Gasoline engine",6000000);
	          break;
		
		case 2:
		System.out.println("Toyota Supra MKIV");
		System.out.println("1998 2JZ-GTE Model");
		Toyota_Supra_MKIV ref15=new Toyota_Supra_MKIV(3000.0,"6 speed manual or 4 speed automatic",3000000);
		break;

		case 3:
		System.out.println("it's Mitsubishi_Lancer_EVOIV ");
		System.out.println(" 1998 evo IV");
		Mitsubishi_Lancer_EVOIV ref16=new Mitsubishi_Lancer_EVOIV(2000.0,"2.0L turbocharge 5-speed manual",5000000);
		break;

		case 4:
		System.out.println("It's a mazda rx7");
		System.out.println(" 1980 First generation");
		Mazda_RX_7 ref17=new Mazda_RX_7(1100.0,"1.1 /1.3L Turbocharged 4/5-speed manual and 3/4-speed automatic",1500000);
		break;

		case 5:
        System.out.println("It's a Honda Civic Hatchback");
		System.out.println(" Honda civic 5th genration");
		Honda_Civic_Hatchback ref18=new Honda_Civic_Hatchback(1300.0,"4-speed s24A automatic and 5-speed s20 manual",750000);
		break;

		case 6:
	    System.out.println("It's a Lexus_SC300");
		System.out.println(" 1990 model ");
		Lexus_SC300 ref19=new Lexus_SC300(3000.0,"3.0 liter 6-cylinder 5-speed automatic and manual",800000);
		break;

		default: System.out.println("Invalid input");

	}
	break;
	/*---------------------------American muscle----------------------------*/
	
	case 3:
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Heartly welcome  to American muscle department ");
	System.out.println("1.Dodge_Charger \n 2.Ford_Mustang \n 3.Chevy_Camaro \n 4.Dodge_Challenger");
	int American_Model=sc.nextInt();

	switch (American_Model)
{
	case 1:
	System.out.println("It's a Dodge charger");
	System.out.println("2011 Seventh edition");
	Dodge_Charger ref20=new Dodge_Charger(3500.0,"V-6 8-speed automatic",13500000);
	break;

	case 2:
    System.out.println("It's a Ford mustang ");
	System.out.println("All new Iconic Ford mustang");
	Ford_Mustang ref21 =new Ford_Mustang(4951.0,"5.0 litre petrol  V8 Autiomatic ",7500000);
	break;

	case 3:
	System.out.println("It's a Chevy camaro");
	System.out.println("All new 2022 model");
	Chevy_Camaro ref22=new Chevy_Camaro(6200.0,"6.2 litre active fuel management  engine",5000000);
	break;

	case 4:
	System.out.println("It's a Dodge challenger");
	System.out.println("Get Your ride home");
	Dodge_Challenger ref23=new Dodge_Challenger(6200,"supercharged 6.2L High output HEMI V8 ",2100000);
	break;
	default : System.out.println("Invalid Input");

    }
	break;









}


	}


}





