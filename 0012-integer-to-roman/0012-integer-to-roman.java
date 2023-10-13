class Solution {
public String intToRoman(int num) {
// String Roman = "";
// Object [][] storeIntRoman = {{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}};
// for (int i = 0; i < storeIntRoman.length; i++) {
// while (num >= (int)storeIntRoman[i][0]) {
// Roman += (String)storeIntRoman[i][1];
// num -= (int)storeIntRoman[i][0];
// }
// }
// return Roman;
 String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        
        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
}
}

