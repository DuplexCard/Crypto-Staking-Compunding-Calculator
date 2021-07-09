class main
{

public static void main(String arg[])	// main program or test
  {
      final double returnRate = 0.055;
    final double principle = 1000;
    final double monthlyContributions = 100;
    final double timesContributedInYear = 12;
    final double time = 5; //in years
    double temporaryPercentage;
    double accumulated = principle;

    //root contributed a year of 1+apy ) - 1
    temporaryPercentage = Math.pow(1+returnRate, 1/timesContributedInYear) ;
    for(int year = 1; year <= time; year++){
        for (int month = 1; month <= timesContributedInYear; month++){
            accumulated = (accumulated*temporaryPercentage) + monthlyContributions;
        }
    }
    System.out.println(accumulated);

    }

}
        
    