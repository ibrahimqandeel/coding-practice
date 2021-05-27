package code.war.interviews.facebook;
/*
 * Date 14-Feb-2020 ---> Facebook Ireland office with Darren Spring & Humberto Virtudes
 */

/*
Implement the function:

float calculateTaxes(income, brackets)

where "brackets" is a list of pairs, e.g.

Example 1
[
[10000, 0.1],
[20000, 0.2],
[10000, 0.3],
[null, 0.4],
]

This indicates that:

The first $10K is taxed at 10%
The next $20K is taxed at 20%
The next $10K is taxed at 30%
All income above this is taxed at 40%

So, for an income of $50K, the tax would be $1K + $4K + $3K + $4K = $12K.

input:income = 50K, output:tax = 12K
input:income = 35K, output:tax = 6.5K
input:income = 10K, output:tax = 1K

I like to provide this full example since we should not assume the candidate knows anything about marginal tax rate calculations.


//35 k
//public float calculateTaxes(double income, ArrayList brackets){
//if(income < 0){
//return 0;
//}
//
//double remianing;
//float tax;
//for(int i = 0; i < brackets.length; i++){
//remianing = brackets[i]; // null
//if(income >= remaining && remaining != null){
//tax += remianing * brackets[i][0]; //20K * 0.2
//incom = income - remianing; //35K - 10K = 25K | 25K - 20K = 5K
//}else{
// tax+= income * brackets[i][0]; // 5K * 0.3 
// break;
//}
//
//}
// tax = 1K + 4K + 3K + 4K = 12K
//tax  = 1K + 4K + 1.5 K

//return tax;
//}
*/

public class Interview1 {

	public static double calculateTaxes(double income, Double[][] taxRates) {
		// income = 50K
		if (income < 1 || taxRates == null) {
			return 0;
		}

		double tax = 0;
		Double taxedIncome;
		for (int i = 0; i < taxRates.length; i++) {
			taxedIncome = taxRates[i][0]; // 10K, 20K, 10K, null
			if (taxedIncome != null && income >= taxedIncome) { // i = 0, 1, 2
				tax += taxedIncome * taxRates[i][1]; // tax += (10K * 0.1) + (20K * 0.2) + (10K * 0.3)
				income = income - taxRates[i][0]; // income = 50K - 10K = 40K, 40K - 20K = 20K, 20K - 10K = 10K
			} else { // i = 3
				tax += income * taxRates[i][1]; // tax += 10k * 0.4
				break;
			}
		}
		return tax; // 1K + 4k + 3K + 4K
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[][] taxRates = new Double[][] { { 10000d, 0.1d }, { 20000d, 0.2d }, { 10000d, 0.3d }, { null, 0.4d } };
		System.out.println(calculateTaxes(1000, taxRates));
		for (int i = 0; i < taxRates.length; i++) {
			System.out.println(taxRates[i][0] + " ---> " + taxRates[i][1]);
		}
	}

}
