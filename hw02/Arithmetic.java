//Ian Udvarhelyi
//isu217
//9/9/14
//hw02

//create public class
public class Arithmetic {
    //create main method
    public static void main (String[] args) {
        
        //number of scoks
        int nSocks=3;
        //cost per pair of socks in dollars
        double sockCost=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass in dollars
        double glassCost=2.29;
        
        //number of boxes of envelopes 
        int nEnvelopes=1;
        //cost per box of envelopes in dollars
        double envelopeCost=3.25;
        double taxPercent=0.06;
        
        //total cost of socks before tax
        double totalSockCost=nSocks*sockCost;
        //cast values integers to make 2 decimal places
        totalSockCost=totalSockCost*100;
        totalSockCost=(int)totalSockCost;
        totalSockCost=totalSockCost/100;
        //total cost of tax on socks
        double totalSockTax=totalSockCost*taxPercent;
        //cast values integers to make 2 decimal places
        totalSockTax=totalSockTax*100;
        totalSockTax=(int)totalSockTax;
        totalSockTax=totalSockTax/100;
        //total cost for buying socks post tax
        double totalSockCostTax=totalSockTax+totalSockCost;
        //cast values integers to make 2 decimal places
        totalSockCostTax=totalSockCostTax*100;
        totalSockCostTax=(int)totalSockCostTax;
        totalSockCostTax=totalSockCostTax/100;
        
        double totalGlassCost=nGlasses*glassCost;
        //cast values integers to make 2 decimal places
        totalGlassCost=totalGlassCost*100;
        totalGlassCost=(int)totalGlassCost;
        totalGlassCost=totalGlassCost/100;
        //total cost of glasses
        double totalGlassTax=totalGlassCost*taxPercent;
        //cast values integers to make 2 decimal places
        totalGlassTax=totalGlassTax*100;
        totalGlassTax=(int)totalGlassTax;
        totalGlassTax=totalGlassTax/100;
        //total cost of tax on glasses
        double totalGlassCostTax=totalGlassCost+totalGlassTax;
        //cast values integers to make 2 decimal places
        totalGlassCostTax=totalGlassCostTax*100;
        totalGlassCostTax=(int)totalGlassCostTax;
        totalGlassCostTax=totalGlassCostTax/100;
        //total cost for buying glasses post tax
        
        double totalEnvelopeCost=nEnvelopes*envelopeCost;
        //cast values integers to make 2 decimal places
        totalEnvelopeCost=totalEnvelopeCost*100;
        totalEnvelopeCost=(int)totalEnvelopeCost;
        totalEnvelopeCost=totalEnvelopeCost/100;
        //total cost of envelopes
        double totalEnvelopeTax=totalEnvelopeCost*taxPercent;
        //cast values integers to make 2 decimal places
        totalEnvelopeTax=totalEnvelopeTax*100;
        totalEnvelopeTax=(int)totalEnvelopeTax;
        totalEnvelopeTax=totalEnvelopeTax/100;
        //total cost of tax on envelopes
        double totalEnvelopeCostTax=totalEnvelopeCost+totalEnvelopeTax;
        //cast values integers to make 2 decimal places
        totalEnvelopeCostTax=totalEnvelopeCostTax*100;
        totalEnvelopeCostTax=(int)totalEnvelopeCostTax;
        totalEnvelopeCostTax=totalEnvelopeCostTax/100;
        //total cost for buying envelopes post tax
        
        //Amount paid before taxes
        double totalAmountPaid=totalEnvelopeCost+totalGlassCost+totalSockCost;
        //cast values integers to make 2 decimal places
        totalAmountPaid=totalAmountPaid*100;
        totalAmountPaid=(int)totalAmountPaid;
        totalAmountPaid=totalAmountPaid/100;
        //total amount paid due to sales tax
        double totalTax=totalSockTax+totalGlassTax+totalEnvelopeTax;
        //cast values integers to make 2 decimal places
        totalTax=totalTax*100;
        totalTax=(int)totalTax;
        totalTax=totalTax/100;
        //total amount paid after taxes
        double totalAmountPaidTaxes=totalSockCostTax+totalGlassCostTax+totalEnvelopeCostTax;
        //cast values integers to make 2 decimal places
        totalAmountPaidTaxes=totalAmountPaidTaxes*100;
        totalAmountPaidTaxes=(int)totalAmountPaidTaxes;
        totalAmountPaidTaxes=totalAmountPaidTaxes/100.0;
        
        //print out all the data
        System.out.println("Total Cost of socks before tax was $" +totalSockCost+ 
        " and the total cost after tax was $" +totalSockCostTax+ " so we owed $" +totalSockTax+
        " in taxes");
        System.out.println("Total cost of glasses before tax was $" +totalGlassCost+ 
        " and the total cost after tax was $" +totalGlassCostTax+ " so we owed $" +totalGlassTax+
        " in taxes");
        System.out.println("Total cost of buying envelopes was $" +totalEnvelopeCost+
        " and the total cost after tax was $" +totalEnvelopeCostTax+ " so we owed $" +totalEnvelopeTax+
        " in taxes");
        System.out.println("Total cost of all items before tax was $" +totalAmountPaid+
        " and the total cost of everything after tax was $" +totalAmountPaidTaxes+
        " so we owed $" +totalTax+ " in taxes");
    }
}