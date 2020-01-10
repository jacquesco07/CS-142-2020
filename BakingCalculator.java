
// Jonathan Etheredge
public class BakingCalculator {
	public static int bagsOfFlour(int cookieCount, int loafCount) {
		int cookiesPerRecipe = 48;
		int loavesPerRecipe = 1;
		double cupsPerCookieRecipe = 2.25;
		double cupsPerCookie = cupsPerCookieRecipe / cookiesPerRecipe; 
		double cupsPerLoaf = 1.5 * loavesPerRecipe;
		double cookies = (cookieCount * cupsPerCookie);
		double loaves = (loafCount * cupsPerLoaf);
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/4;
	}

	public static int containersOfSalt(int cookieCount, int loafCount) {
		double saltPerCookie = 1/48;
		double saltPerLoaf = 1/8.0;
		double saltPerCookieRecipe = saltPerCookie * 48;
		double saltPerLoafRecipe = saltPerLoaf;
		double cookies = cookieCount * saltPerCookie;
		double loaves = loafCount * saltPerLoafRecipe;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves));
	}

	public static int boxesOfBakingSoda(int cookieCount, int loafCount) {
		double bakingSodaPerCookie = 1/48.0; //tsp
		double bakingSodaPerLoaf = 1.0; //tsp
		double bakingSodaPerCookieRecipe = bakingSodaPerCookie * 48.0;
		double bakingSodaPerLoafRecipe = bakingSodaPerLoaf; 
		double cookies = cookieCount * bakingSodaPerCookie;
		double loaves = loafCount * bakingSodaPerLoaf;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/2;
	}

	public static int bottlesOfVanilla(int cookieCount, int loafCount) {
		double vanillaPerCookie = 1/48.0;
		double vanillaPerLoaf = 1.0;
		double vanillaPerCookieRecipe = vanillaPerCookie * 48.0;
		double vanillaPerLoafRecipe = vanillaPerLoaf;
		double cookies = cookieCount * vanillaPerCookie;
		double loaves = loafCount * vanillaPerLoaf; 
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/2;
	}

	public static int cartonsOfEggs(int cookieCount, int loafCount) {
		double eggsPerCookie = 2.0 / 12.0;
		double eggsPerLoaf = 1.0 / 12.0;
		double eggsPerCookieRecipe = eggsPerCookie * 12.0;
		double eggsPerLoafRecipe = eggsPerLoaf * 12.0;
		double cookies = cookieCount * eggsPerCookie;
		double loaves = loafCount * eggsPerLoaf;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/5;
	}

	public static int bagsOfSugar(int cookieCount, int loafCount) {
		double sugarPerCookie = 1.5 / 48.0;
		double sugarPerLoaf = 0.75;
		double sugarPerCookieRecipe = sugarPerCookie * 48.0;
		double sugarPerLoafRecipe = sugarPerLoaf;
		double cookies = cookieCount * sugarPerCookie;
		double loaves = loafCount * sugarPerLoaf;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/2;
		
	}

	public static int packagesOfButter(int cookieCount, int loafCount) {
		double butterPerCookie = 1.0/2.0;
		double butterPerLoaf = (1.0/3.0);
		double butterPerCookieRecipe = butterPerCookie * 2.0;
		double butterPerLoafRecipe = butterPerLoaf;
		double cookies = cookieCount * butterPerCookieRecipe; 
		double loaves = loafCount * butterPerLoafRecipe;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves))/25;
	}

	public static int bananas(int cookieCount, int loafCount) {
		double bananasPerCookie = 0;
		double bananasPerLoaf = 3.0;
		double cookies = cookieCount * bananasPerCookie;
		double loaves = loafCount * bananasPerLoaf;
		return (int)(Math.ceil(cookies) + Math.ceil(loaves));
	}

	public static int bagsOfChocolateChips(int cookieCount, int loafCount) {
		double chipsPerCookie = 2.5 / 48.0;
		double chipsPerLoaf = 0;
		double cookies = cookieCount * chipsPerCookie;
		double loaves = chipsPerLoaf * loafCount;
		return (int)(Math.ceil(cookies + 1) + Math.ceil(loaves))/2;
	}

	public static double totalCost(int cookieCount, int loafCount) {
		return 1.79*bagsOfFlour(cookieCount, loafCount) + 1.09*containersOfSalt(cookieCount , loafCount) + 1.09*boxesOfBakingSoda(cookieCount, loafCount) + 3.99*bottlesOfVanilla(cookieCount, loafCount) + 2.19*cartonsOfEggs(cookieCount, loafCount) + 1.99*bagsOfSugar(cookieCount, loafCount) + 4.49*packagesOfButter(cookieCount, loafCount) + 0.32*bananas(cookieCount, loafCount) + 3.29*bagsOfChocolateChips(cookieCount, loafCount);
	}
}
