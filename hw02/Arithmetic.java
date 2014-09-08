//////////////////////////////////////////////////////////////////////////////////
//Chase Menna
//hw02
//Arithmetic 
//
// Main Start of prog:
public class Arithmetic {
    
    public static void main(String[] args) {
            
        //input data:
        int nSocks=3;   //# of socks
        double sockCost$=2.58;  //sock cost
        int nGlasses=6;  //# of glasses
        double glassCost$=2.29;  //glass cost
        int nEnvelopes=1;   //# of envelopes
        double envelopeCost$=3.25;  //envelopes cost
        double taxPercent=0.06; //taxes
        double taxHundred=1.06; //tax +1
        
       
        //total cost of item NO TAX
        double totalCostsocks=nSocks*sockCost$;
        double totalCostglass=glassCost$*nGlasses;
        double totalCostenv=envelopeCost$*nEnvelopes;
        
        //TOTAL ITEM COST WITH TAX
        double masssocks=totalCostsocks*taxHundred;
        double massglass=totalCostglass*taxHundred;
        double massenv=totalCostenv*taxHundred;
        
        double envtaxhundred, sockstaxhundred, glasstaxhundred;
        
         //cost of items TAX
        double socksTax=totalCostsocks*taxPercent;
        sockstaxhundred =(int)(socksTax* 100);
        double glassTax=totalCostglass*taxPercent;
        glasstaxhundred =(int)(glassTax* 100);
        double envTax=totalCostenv*taxPercent;
        envtaxhundred =(int)(envTax* 100);
        
        //DIvide by 100
        double finalsockstax=sockstaxhundred/100;
        double finalenvtax=envtaxhundred/100;
        double finalglasstax=glasstaxhundred/100;
        
        //total costs without tax
        double beforeTax=(totalCostenv+totalCostglass+totalCostsocks-.000000000000004);
        
        //Total tax
        double totaltax=finalglasstax+finalenvtax+finalsockstax;
        
        //total cost WITH TAX
        double afterTax=beforeTax+totaltax;
        
        
        //output
        System.out.println("Total cost of socks $" +totalCostsocks);
        System.out.println("Tax of socks $" +finalsockstax);
        System.out.println("Total cost of envelopes $" +totalCostenv);
        System.out.println("Tax of envelopes $" +finalenvtax);
        System.out.println("Total cost of glass $" +totalCostglass);
        System.out.println("Tax of glass $" +finalglasstax);
        System.out.println("---------------------------------------");
        System.out.println("Total cost before tax $" +beforeTax);
        System.out.println("---------------------------------------");
        System.out.println("Total tax $" +totaltax);
        System.out.println("---------------------------------------");
        System.out.println("Total cost after tax $" +afterTax);
        
        }
}