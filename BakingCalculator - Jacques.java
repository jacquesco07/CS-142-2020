
// Jacques Co

public class BakingCalculator {
	public static int bagsOfFlour(int cookieCount, int loafCount) {
		int poundsOfFlourPerBag = 5;
		double cupsOfFlourPerPound = (3.0 + (1.0/3.0));
		double cupsOfFlourNeeded = (cookieCount / 48.0) * 2.25 + (loafCount * 1.5);
		double poundsOfFlourNeeded = cupsOfFlourNeeded / cupsOfFlourPerPound;
		double bagsOfFlour = Math.ceil(poundsOfFlourNeeded / poundsOfFlourPerBag);
		return (int) bagsOfFlour; 
	}
	
	public static int containersOfSalt(int cookieCount, int loafCount) {
		int ozOfSaltPerContainer = 26;
		double teaspoonOfSaltPerOz = 6;
		double teaspoonsOfSaltNeeded = ((double)cookieCount / 48) * 1 + (loafCount * 0.125);
		double ozOfSaltNeeded = teaspoonsOfSaltNeeded / teaspoonOfSaltPerOz;
		double containersOfSalt = Math.ceil(ozOfSaltNeeded / ozOfSaltPerContainer);
		return (int)containersOfSalt;
	}
	
	public static int boxesOfBakingSoda(int cookieCount, int loafCount) {
		int ozOfBakingSodaPerBox = 16;
		double teaspoonOfBakingSodaPerOz = 6;
		double teaspoonOfBakingSodaNeeded = ((double)cookieCount / 48) * 1 + (loafCount * 1);
		double ozOfBakingSodaNeeded = teaspoonOfBakingSodaNeeded / teaspoonOfBakingSodaPerOz;
		double boxesOfBakingSoda = Math.ceil(ozOfBakingSodaNeeded / ozOfBakingSodaPerBox);
		return (int) boxesOfBakingSoda; 
	}
	
	public static int bottlesOfVanilla(int cookieCount, int loafCount) {
		int liquidOzOfVanillaExtractPerBottle = 1;
		double teaspoonsOfVanillaPerLiquidOz = 6;
		double teaspoonsOfVanillaNeeded = ((double)cookieCount / 48) * 1 + (loafCount * 1);
		double ozOfVanillaNeeded = teaspoonsOfVanillaNeeded / teaspoonsOfVanillaPerLiquidOz;
		double bottlesOfVanilla = Math.ceil(ozOfVanillaNeeded / liquidOzOfVanillaExtractPerBottle);
		return (int) bottlesOfVanilla; 
	}
	
	public static int cartonsOfEggs(int cookieCount, int loafCount) {
		int numberOfEggsPerCartonOfEggs = 12;
		double numberOfEggsNeeded = ((double)cookieCount / 48) * 2 + (loafCount * 1);
		double cartonsOfEggs = Math.ceil(numberOfEggsNeeded / numberOfEggsPerCartonOfEggs);
		return (int) cartonsOfEggs; 
	}
	
	public static int bagsOfSugar(int cookieCount, int loafCount) {
		int poundsOfSugarPerBag = 1;
		double cupsOfSugarPerPound = 2;
		double cupsOfSugarNeeded = ((double)cookieCount / 48) * 1.5 + (loafCount * .75);
		double poundsOfSugarNeeded = cupsOfSugarNeeded / cupsOfSugarPerPound;
		double bagsOfSugar = Math.ceil(poundsOfSugarNeeded / poundsOfSugarPerBag);
		return (int) bagsOfSugar; 
	}
	
	public static int packagesOfButter(int cookieCount, int loafCount) {
		int sticksOfButterPerPackage = 4;
		double cupsOfButterPerStick = .5;
		double cupsOfButterNeeded = ((double)cookieCount / 48) * 1 + (loafCount * .334);
		double sticksOfButterNeeded = cupsOfButterNeeded / cupsOfButterPerStick;
		double packagesOfButter = Math.ceil(sticksOfButterNeeded / sticksOfButterPerPackage);
		return (int) packagesOfButter; 
	}
	
	public static int bananas(int cookieCount, int loafCount) {
		double bananas = (cookieCount * 0) + (loafCount * 3);
		return (int)bananas; 
	}
	
	public static int bagsOfChocolateChips(int cookieCount, int loafCount) {
		int cupsOfChocolateChipsPerBag = 2;
		double cupsOfChocolateChipsNeeded = ((double)cookieCount / 48) * 2.5 + (loafCount * 0);
		double bagsOfChocolateChips = Math.ceil(cupsOfChocolateChipsNeeded / cupsOfChocolateChipsPerBag);
		return (int)bagsOfChocolateChips; 
	}
	
	public static double totalCost(int cookieCount, int loafCount) {
		double costOfBagOfFlour = 1.79;
		double costOfContainerOfSalt = 1.09;
		double costOfBoxOfBakingSoda = 1.09;
		double costOfBottleOfVanilla = 3.99;
		double costOfCartonOfEggs = 2.19;
		double costOfBagOfSugar = 1.99;
		double costOfPackageOfButter = 4.49;
		double costOfBananas = .32;
		double costOfBagOfChocolateChips = 3.29;
		double totalCost = (bagsOfFlour(cookieCount, loafCount) * costOfBagOfFlour) + (containersOfSalt(cookieCount, loafCount) * costOfContainerOfSalt)
				+ (boxesOfBakingSoda(cookieCount, loafCount) * costOfBoxOfBakingSoda) + (bottlesOfVanilla(cookieCount, loafCount) * costOfBottleOfVanilla)
				+ (cartonsOfEggs(cookieCount, loafCount) * costOfCartonOfEggs) + (bagsOfSugar(cookieCount, loafCount) * costOfBagOfSugar)
				+ (packagesOfButter(cookieCount, loafCount) * costOfPackageOfButter) + (bananas(cookieCount, loafCount) * costOfBananas)
				+ (bagsOfChocolateChips(cookieCount, loafCount) * costOfBagOfChocolateChips);
		return totalCost; 
	}
	
	public static void main(String[]args) {
		int cookieCount = 2;
		int loafCount = 2;
		System.out.println("Bags of Flour: "+bagsOfFlour(cookieCount, loafCount));
		System.out.println("Containers of Salt: "+containersOfSalt(cookieCount, loafCount));
		System.out.println("Boxes of Baking Soda: "+boxesOfBakingSoda(cookieCount, loafCount));
		System.out.println("Bottles of Vanilla: "+bottlesOfVanilla(cookieCount, loafCount));
		System.out.println("Cartons of Eggs: "+cartonsOfEggs(cookieCount, loafCount));
		System.out.println("Bags of Sugar: "+bagsOfSugar(cookieCount, loafCount));
		System.out.println("Packages of Butter: "+packagesOfButter(cookieCount, loafCount));
		System.out.println("Bananas: "+bananas(cookieCount, loafCount));
		System.out.println("Bags of Chocolate Chips: "+bagsOfChocolateChips(cookieCount, loafCount));
		System.out.println("The total cost of making "+cookieCount+" cookies and "+loafCount+" loaves of banna bread is $"+totalCost(cookieCount, loafCount));
	
	}

}