/////////////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//CSE2
//Lab 2

/*Cyclometer.java inputs time elapsed and tire rotations.for 2 trips 
  and outputs: 
    a. number of minutes per trip
    b. number of counts per trip
    c. distance of each trip in miles
and d. the distance for the two trips combined*/ 

public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {

    // input data:
int secsTrip1=480;  // Trip 1 seconds
int secsTrip2=3220;  // Trip 2 seconds
int countsTrip1=1561;  // Trip 1 counts
int countsTrip2=9037; // Trip 2 counts

        //intermediate variables and output data
        double wheelDiameter=27.0,  // diameter of front tire
  	    PI=3.14159, // pi
  	    feetPerMile=5280,  // 5280 feet per mile
    	inchesPerFoot=12,   // 12 inches per foot
  	    secondsPerMinute=60;  // 60 seconds per minute
    	double distanceTrip1, distanceTrip2, totalDistance;  //

            System.out.println("Trip 1 took "+
               	        (secsTrip1/secondsPerMinute)+" minutes and had "+
               	          countsTrip1+" counts.");
            System.out.println("Trip 2 took "+
                   	     (secsTrip2/secondsPerMinute)+" minutes and had "+
                 	      countsTrip2+" counts.");
                 	      
                 			//
		//This runs the calculations and stores the values
		//
		//
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	//distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip2+distanceTrip1; 
    
	//Print out the output data.
	System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	
   	}
}

	

