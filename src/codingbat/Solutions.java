package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solutions {

	// Warmup-1
	public boolean sleepIn(boolean weekday, boolean vacation) {

		if (!weekday && !vacation) {
			return true;
		}

		if (!weekday || vacation) {
			return true;
		}

		return false;
	}

	public int diff21(int n) {

		if (n > 21) {
			return Math.abs(n - 21) * 2;
		}

		return Math.abs(n - 21);
	}

	public boolean parrotTrouble(boolean talking, int hour) {

		if ((talking && hour < 7) || (talking && hour > 20)) {
			return true;
		}
		return false;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}

		return false;
	}

	public boolean nearHundred(int n) {
		if ((Math.abs(100 - n)) <= 10 || (Math.abs(200 - n)) <= 10) {
			return true;
		}

		return false;
	}

	public boolean posNeg(int a, int b, boolean negative) {

		if (negative) {
			if (a < 0 && b < 0) {
				return true;
			}
		} else {
			if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
				return true;
			}
		}

		return false;
	}

	public String notString(String str) {
		if (str.length() >= "not".length() && str.substring(0, 3).equals("not")) {
			return str;
		}

		return "not " + str;
	}

	public String missingChar(String str, int n) {

		return str.substring(0, n) + str.substring(n + 1, str.length());
	}

	public String frontBack(String str) {
		if (str.length() > 1) {
			String tmp = str.substring(1, str.length() - 1);

			return str.charAt(str.length() - 1) + tmp + str.charAt(0);
		}
		return str;
	}

	public String front3(String str) {
		String front;
		if (str.length() < 3) {
			front = str;
			return front + front + front;
		}

		front = str.substring(0, 3);

		return front + front + front;
	}

	public String backAround(String str) {
		char c = str.charAt(str.length() - 1);

		return c + str + c;
	}

	public boolean or35(int n) {
		if (n > 0 && n % 3 == 0 || n % 5 == 0) {
			return true;
		}

		return false;
	}

	public String front22(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2) + str + str.substring(0, 2);
		}
		return str + str + str;
	}

	public boolean startHi(String str) {
		if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
			return true;
		}

		return false;
	}

	public boolean icyHot(int temp1, int temp2) {
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		}

		return false;
	}

	public boolean in1020(int a, int b) {
		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
			return true;
		}

		return false;
	}

	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		}

		return false;
	}

	public boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
			return false;
		}

		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
			return true;
		}

		return false;
	}

	public String delDel(String str) {
		if (str.length() == 4 && str.substring(1, 4).equals("del")) {
			return "" + str.charAt(0);
		}

		if (str.length() > 4 && str.substring(1, 4).equals("del")) {
			return str.charAt(0) + str.substring(4, str.length());
		}

		return str;
	}

	public boolean mixStart(String str) {
		if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
			return true;
		}

		return false;
	}

	public String startOz(String str) {
		if (str.length() > 2) {
			if (str.substring(0, 2).equals("oz")) {
				return "oz";
			}
			if (str.charAt(0) == 'o') {
				return "" + str.charAt(0);
			}
			if (str.charAt(1) == 'z') {
				return "" + str.charAt(1);
			}

			return "";
		}

		return str;
	}

	public int intMax(int a, int b, int c) {
		int max = a;

		if (max < b) {
			max = b;
		}

		if (max < c) {
			max = c;
		}

		return max;
	}

	public int close10(int a, int b) {
		if (Math.abs(10 - a) < Math.abs(10 - b)) {
			return a;
		}

		if (Math.abs(10 - a) > Math.abs(10 - b)) {
			return b;
		}

		return 0;
	}

	public boolean in3050(int a, int b) {
		if ((a >= 30 && a <= 40 && b >= 30 && b <= 40)
				|| (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
			return true;
		}

		return false;
	}

	public int max1020(int a, int b) {
		if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
			return Math.max(a, b);
		}
		if ((a >= 10 && a <= 20)) {
			return a;
		}
		if ((b >= 10 && b <= 20)) {
			return b;
		}

		return 0;
	}

	public boolean stringE(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				cnt++;
			}
		}

		if (cnt >= 1 && cnt <= 3) {
			return true;
		}

		return false;
	}

	public boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10) {
			return true;
		}

		return false;
	}

	public String endUp(String str) {
		if (str.length() >= 4) {
			return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
		}

		return str.toUpperCase();
	}

	public String everyNth(String str, int n) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < str.length(); i += n) {
			s.append(str.charAt(i));
		}

		return String.valueOf(s);
	}

	// Warmup-2
	public String stringTimes(String str, int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(str);
		}

		return String.valueOf(sb);
	}

	public String frontTimes(String str, int n) {
		String front;
		if (str.length() >= 3) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(front);
		}

		return String.valueOf(sb);
	}

	int countXX(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			}
		}

		return cnt;
	}

	boolean doubleX(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				return true;
			}
			if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') {
				return false;
			}
		}

		return false;
	}

	public String stringBits(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i += 2) {
			sb.append(str.charAt(i));
		}

		return String.valueOf(sb);
	}

	public String stringSplosion(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.substring(0, i + 1));
		}

		return String.valueOf(sb);
	}

	public int last2(String str) {
		int cnt = 0;
		String end = "";
		if (str.length() > 2) {
			end = str.substring(str.length() - 2, str.length());

			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 2).equals(end)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public int arrayCount9(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean arrayFront9(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (i < 3 && nums[i] == 9) {
				return true;
			}
		}
		return false;
	}

	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 2 && nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}

		return false;
	}

	public int stringMatch(String a, String b) {

		int length = Math.min(a.length(), b.length());
		int cnt = 0;

		for (int i = 0; i < length - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				cnt++;
			}
		}

		return cnt;
	}

	public String stringX(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') {
				sb.append(str.charAt(i));
			}
		}

		return String.valueOf(sb);
	}

	public String altPairs(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));

			if (i < str.length() - 1 && i % 2 == 1) {
				i += 2;
			}
		}

		return String.valueOf(sb);
	}

	public String stringYak(String str) {
		StringBuilder sb = new StringBuilder();

		String[] arr = str.split("yak");

		for (String string : arr) {
			sb.append(string);
		}

		return String.valueOf(sb);
	}

	public int array667(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && nums[i + 1] == nums[i] || nums[i + 1] == 7) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
				return false;
			}
		}

		return true;
	}

	public boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
				return true;
			}
		}

		return false;
	}

	// Recursion
	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}

		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}
		if (bunnies == 2) {
			return 5;
		}

		return bunnies % 2 == 1 ? 2 + bunnyEars2(bunnies - 1) : 3 + bunnyEars2(bunnies - 1);
	}

	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}

		return rows + triangle(rows - 1);
	}

	public int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return n % 10 + sumDigits(n / 10);
	}

	public int count7(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 7) {
			return 1;
		}

		return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
	}

	public int count8(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 8) {
			return 1;
		}

		if (n % 10 == 8 && n / 10 % 10 == 8) {
			return 2 + count8(n / 10);
		}

		return n % 10 == 8 ? 1 + count8(n / 10) : count8(n / 10);
	}

	public int powerN(int base, int n) {
		if (base == 0) {
			return 0;
		}
		if (base == 1) {
			return 1;
		}
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return base;
		}

		return base * powerN(base, n - 1);
	}

	public int countX(String str) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.equals("x")) {
			return 1;
		}

		return str.substring(str.length() - 1, str.length()).equals("x") ? 1 + countX(str.substring(0, str.length() - 1)) : countX(str.substring(0, str.length() - 1));
	}

	public int countHi(String str) {
		if (str.length() < 2) {
			return 0;
		}
		if (str.equals("hi")) {
			return 1;
		}

		return str.substring(str.length() - 2, str.length()).equals("hi") ? 1 + countHi(str.substring(0, str.length() - 1)) : countHi(str.substring(0, str.length() - 1));
	}

	public String changeXY(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.equals("x")) {
			return "y";
		}

		return str.substring(str.length() - 1, str.length()).equals("x") ? changeXY(str.substring(0, str.length() - 1)) + "y" : changeXY(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1, str.length());
	}

	// String-1
	public String helloName(String name) {

		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		String begin = out.substring(0, (out.length()) / 2);
		String end = out.substring(begin.length(), out.length());

		return begin + word + end;
	}

	public String extraEnd(String str) {
		String end = str.substring(str.length() - 2, str.length());
		return end + end + end;
	}

	public String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		return str.substring(0, 2);
	}

	public String firstHalf(String str) {
		return str.substring(0, (str.length()) / 2);
	}

	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public String comboString(String a, String b) {
		String shorter, longer;
		if (a.length() > b.length()) {
			longer = a;
			shorter = b;
		} else {
			longer = b;
			shorter = a;
		}
		return shorter + longer + shorter;
	}

	public String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public String left2(String str) {
		if (str.length() == 2) {
			return str;
		}
		String begin = str.substring(2, str.length());

		return begin + str.substring(0, 2);
	}

	public String right2(String str) {
		if (str.length() == 2) {
			return str;
		}
		String begin = str.substring(str.length() - 2, str.length());

		return begin + str.substring(0, str.length() - 2);
	}

	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		}
		return str.substring(str.length() - 1);
	}

	public String withouEnd2(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	public String middleTwo(String str) {
		return str.substring((str.length() - 1) / 2, ((str.length() - 1) / 2) + 2);
	}

	public boolean endsLy(String str) {
		if (str.length() < 2) {
			return false;
		}
		return str.substring(str.length() - 2, str.length()).equals("ly");
	}

	public String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	public String twoChar(String str, int index) {

		if (str.length() - index >= 2 && index >= 0) {
			return str.substring(index, index + 2);
		}

		return str.substring(0, 2);
	}

	public String middleThree(String str) {
		return str.substring((str.length() / 2) - 1, (str.length() / 2) - 1 + 3);
	}

	public boolean hasBad(String str) {
		if (str.length() < 3 || (str.length() == 3 && str.charAt(0) != 'b')) {
			return false;
		}
		return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
	}

	public String atFirst(String str) {
		if (str.length() == 0) {
			return "@@";
		}
		if (str.length() == 1) {
			return str + "@";
		}

		return str.substring(0, 2);
	}

	public String lastChars(String a, String b) {
		if (a.length() == 0) {
			a = "@";
		}
		if (b.length() == 0) {
			b = "@";
		}
		return "" + a.charAt(0) + b.charAt(b.length() - 1);
	}

	public String conCat(String a, String b) {
		if (a.length() == 0) {
			return b;
		}
		if (b.length() == 0) {
			return a;
		}

		if (a.charAt(a.length() - 1) == b.charAt(0)) {
			return a + b.substring(1, b.length());
		}

		return a + b;
	}

	public String lastTwo(String str) {
		if (str.length() < 2) {
			return str;
		}
		String end = str.substring(str.length() - 2, str.length());
		if (str.length() == 2) {
			return "" + end.charAt(1) + end.charAt(0);
		}

		return str.substring(0, str.length() - 2) + end.charAt(1) + end.charAt(0);
	}

	public String seeColor(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
			return str.substring(0, 3);
		}
		if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
			return str.substring(0, 4);
		}
		return "";
	}

	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}
		return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
	}

	public String minCat(String a, String b) {
		if (a.length() == 0 || b.length() == 0) {
			return "";
		}
		if (a.length() == b.length()) {
			return a + b;
		}
		if (a.length() < b.length()) {
			return a + b.substring(b.length() - a.length(), b.length());
		}
		return a.substring(a.length() - b.length(), a.length()) + b;
	}

	public String extraFront(String str) {
		if (str.length() < 2) {
			return str + str + str;
		}
		String begin = str.substring(0, 2);
		return begin + begin + begin;
	}

	public String without2(String str) {
		if (str.length() < 2) {
			return str;
		}
		if (str.length() == 2) {
			return "";
		}
		if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
			return str.substring(2, str.length());
		}
		return str;
	}

	public String deFront(String str) {
		if (str.length() < 2) {
			return "";
		}

		if (str.substring(0, 2).equals("ab")) {
			return str;
		}
		if (str.charAt(0) == 'a') {
			return "" + str.charAt(0) + str.substring(2, str.length());
		}
		if (str.charAt(1) == 'b') {
			return "" + str.charAt(1) + str.substring(2, str.length());
		}

		return str.substring(2, str.length());
	}

	public String startWord(String str, String word) {
		if (word.length() > str.length()) {
			return "";
		}
		if (str.length() == 1) {
			return str;
		}
		if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
			return str.substring(0, word.length());
		}
		return "";
	}

	public String withoutX(String str) {
		if (str.length() < 2 || str.equals("x")) {
			return "";
		}
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
			return str.substring(1, str.length() - 1);
		}
		if (str.charAt(0) == 'x') {
			return str.substring(1, str.length());
		}
		if (str.charAt(str.length() - 1) == 'x') {
			return str.substring(0, str.length() - 1);
		}
		return str;
	}

	public String withoutX2(String str) {
		if (str.length() == 1 && str.charAt(0) == 'x') {
			return "";
		}

		if (str.length() >= 2) {
			if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
				return str.substring(2);
			} else if (str.charAt(0) == 'x') {
				return str.substring(1);
			} else if (str.charAt(1) == 'x') {
				return str.charAt(0) + str.substring(2);
			}
		}

		return str;
	}

	// Array-2
	public int countEvens(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public int bigDiff(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
		}

		return max - min;
	}

	public int centeredAverage(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 1; i < nums.length - 1; i++) {
			sum += nums[i];
		}

		return sum / (nums.length - 2);
	}

	public int sum13(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
				continue;
			}
			sum += nums[i];
		}
		return sum;
	}

	public int sum67(int[] nums) {
		int sum = 0;
		boolean good = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				good = false;
			}
			if (nums[i] == 7 && !good) {
				good = true;
				continue;
			}

			if (good) {
				sum += nums[i];
			}
		}

		return sum;
	}

	public boolean has22(int[] nums) {
		int prev;
		for (int i = 1; i < nums.length; i++) {
			prev = nums[i - 1];
			if (prev == 2 && nums[i] == 2) {
				return true;
			}
		}
		return false;
	}

	public boolean lucky13(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				cnt++;
			}
			if (cnt > 0) {
				return false;
			}
		}
		return true;
	}

	public boolean sum28(int[] nums) {
		int twoSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				twoSum += 2;
			}
		}
		return twoSum == 8;
	}

	public boolean more14(int[] nums) {
		int ones = 0, fours = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				ones++;
			}
			if (nums[i] == 4) {
				fours++;
			}
		}
		return ones > fours;
	}

	public int[] fizzArray(int n) {
		if (n == 0) {
			int[] arr = {};
			return arr;
		}
		int[] intArr = new int[n];
		for (int i = 0; i < n; i++) {
			intArr[i] = i;
		}
		return intArr;
	}

	public boolean only14(int[] nums) {
		boolean isGood = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				isGood = false;
			}
		}

		return isGood;
	}

	public String[] fizzArray2(int n) {
		if (n == 0) {
			String[] arr = {};
			return arr;
		}
		String[] strArr = new String[n];
		for (int i = 0; i < n; i++) {
			strArr[i] = String.valueOf(i);
		}
		return strArr;
	}

	public boolean no14(int[] nums) {
		boolean one = false, four = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				one = true;
			}
			if (nums[i] == 4) {
				four = true;
			}
			if (one && four) {
				return false;
			}
		}
		return true;
	}

	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != val && nums[i] != val) {
				return false;
			}
		}

		return true;
	}

	public boolean either24(int[] nums) {
		boolean twoTwo = false, fourFour = false;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == 2 && nums[i] == 2) {
				twoTwo = true;
			}
			if (nums[i - 1] == 4 && nums[i] == 4) {
				fourFour = true;
			}
		}

		return (twoTwo && !fourFour) || (!twoTwo && fourFour);
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int diffCount = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
				diffCount++;
			}
		}

		return diffCount;
	}

	public boolean has77(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] == 7 && nums[i] == 7) {
				return true;
			}
			if (i < nums.length && i > 1 && nums[i - 2] == 7 && nums[i] == 7) {
				return true;
			}
		}

		return false;
	}

	public boolean has12(int[] nums) {
		boolean hasOne = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				hasOne = true;
			}
			if (hasOne && nums[i] == 2) {
				return true;
			}
		}

		return false;
	}

	public boolean modThree(int[] nums) {
		for (int i = 2; i < nums.length; i++) {
			if ((nums[i - 2] % 2 == 0 && nums[i - 1] % 2 == 0 && nums[i] % 2 == 0)
					|| (nums[i - 2] % 2 == 1 && nums[i - 1] % 2 == 1 && nums[i] % 2 == 1)) {
				return true;
			}
		}

		return false;
	}

	public boolean haveThree(int[] nums) {
		int cnt = 0;
		boolean hasTripleThrees = false;
		if (nums.length < 5) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				cnt++;
			}
			if (i >= 4 && (nums[i] == 3 && nums[i - 2] == 3 && nums[i - 4] == 3)) {
				hasTripleThrees = true;
			}
		}

		if (cnt == 3 && hasTripleThrees) {
			return true;
		}

		return false;
	}

	public boolean twoTwo(int[] nums) {
		if (nums.length == 1 && nums[0] == 2) {
			return false;
		}
		if (nums.length == 2 && (nums[0] != 2 || nums[1] != 2)) {
			return false;
		}

		for (int i = 1; i < nums.length - 1; i++) {
			if ((nums[i - 1] != 2 && nums[i] == 2) && (nums[i] == 2 && nums[i + 1] != 2)) {
				return false;
			}
			if (i == nums.length - 2 && nums[i] != 2 && nums[i + 1] == 2) {
				return false;
			}
		}

		return true;
	}

	public boolean sameEnds(int[] nums, int len) {
		if (len == nums.length) {
			return true;
		}

		for (int i = 0; i < nums.length; i++) {
			if (i < len && nums[i] != nums[nums.length - len + i]) {
				return false;
			}
		}

		return true;
	}

	public boolean tripleUp(int[] nums) {
		for (int i = 2; i < nums.length; i++) {
			if (nums[i - 2] == nums[i - 1] - 1 && nums[i - 1] == nums[i] - 1) {
				return true;
			}
		}

		return false;
	}

	public int[] fizzArray3(int start, int end) {
		int[] arr = new int[end - start];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = start;
			start++;
		}

		return arr;
	}

	public int[] shiftLeft(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				arr[i] = nums[i + 1];
			} else {
				arr[arr.length - 1] = nums[0];
			}
		}

		return arr;
	}

	public int[] tenRun(int[] nums) {
		boolean multipleOfTen = false;
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				multipleOfTen = true;
				tmp = nums[i];
			}
			if (multipleOfTen) {
				nums[i] = tmp;
			}
		}

		return nums;
	}

	public int[] pre4(int[] nums) {
		int size = 0;
		if (nums.length == 1 || (nums.length == 2 && nums[1] != 4)) {
			return new int[0];
		}
		boolean gotFour = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 4) {
				gotFour = true;
			}
			if (!gotFour) {
				size++;
			}
		}
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = nums[i];
		}

		return arr;
	}

	public int[] post4(int[] nums) {
		boolean gotFour = false;
		int size = 0;

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] == 4) {
				gotFour = true;
			}
			if (!gotFour) {
				size++;
			}
		}
		int[] arr = new int[size];
		int j = 0;
		for (int i = nums.length - size; i < nums.length; i++) {
			arr[j] = nums[i];
			j++;
		}

		return arr;
	}

	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				nums[i] = nums[i - 1] < nums[i + 1] ? nums[i + 1] : nums[i - 1];
			}
		}

		return nums;
	}

	public int[] zeroFront(int[] nums) {
		int[] arr = new int[nums.length];

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				arr[j] = nums[i];
				j++;
			}
		}

		return arr;
	}

	public int[] withoutTen(int[] nums) {
		int[] arr = new int[nums.length];

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				arr[j] = nums[i];
				j++;
			}
		}
		return arr;
	}

	public int[] zeroMax(int[] nums) {
		int largestOdd = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 == 1 && nums[i] > largestOdd) {
				largestOdd = nums[i];
			}
			if (nums[i] == 0) {
				nums[i] = largestOdd;
			}
		}

		return nums;
	}

	public int[] evenOdd(int[] nums) {
		int[] arr = new int[nums.length];

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				arr[j] = nums[i];
				j++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				arr[j] = nums[i];
				j++;
			}
		}

		return arr;
	}

	public String[] fizzBuzz(int start, int end) {
		String[] sarr = new String[end - start];
		for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				sarr[i - start] = "Fizz";
			} else if (i % 3 != 0 && i % 5 == 0) {
				sarr[i - start] = "Buzz";
			} else if (i % 3 == 0 && i % 5 == 0) {
				sarr[i - start] = "FizzBuzz";
			} else {
				sarr[i - start] = String.valueOf(i);
			}
		}

		return sarr;
	}

	// Map-1
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a") && map.get("a").length() > 0) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}

		return map;
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a") && map.get("a").length() > 0) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("c")) {
			map.remove("c");
		}

		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}

		return map;
	}

	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.replace("ice cream", "cherry");
		}

		map.put("bread", "butter");

		return map;
	}

	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream") && map.get("ice cream").length() > 0) {
			map.put("yogurt", map.get("ice cream"));
		}

		if (map.containsKey("spinach") && map.get("spinach").length() > 0) {
			map.replace("spinach", "nuts");
		}

		return map;
	}

	public Map<String, String> topping3(Map<String, String> map) {
		if (map.containsKey("potato") && map.get("potato").length() > 0) {
			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad") && map.get("salad").length() > 0) {
			map.put("spinach", map.get("salad"));
		}

		return map;
	}

	public Map<String, String> mapAB2(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
			map.remove("a");
			map.remove("b");
		}

		return map;
	}

	public Map<String, String> mapAB3(Map<String, String> map) {
		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("b") && !map.containsKey("a")) {
			map.put("a", map.get("b"));
		}

		return map;
	}

	public Map<String, String> mapAB4(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() != map.get("b").length()) {
			String longerVal = map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b");
			map.put("c", longerVal);
		}
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
			map.replace("a", "");
			map.replace("b", "");
		}

		return map;
	}

	// Array-3
	public int maxSpan(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int maxSpan = 0;

		// with lists
		List<Integer> alist = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			alist.add(nums[i]);
		}
		for (int i = 0; i < alist.size(); i++) {
			if ((alist.lastIndexOf(alist.get(i)) - alist.indexOf(alist.get(i))) > maxSpan) {
				maxSpan = alist.lastIndexOf(alist.get(i)) - alist.indexOf(alist.get(i));
			}
		}

		return maxSpan + 1;

//		// with nested for loops
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i +1; j < nums.length; j++) {
//				if (nums[i] == nums[j] && j - i > maxSpan) maxSpan = j-i;
//			}
//		}
//
//		return maxSpan+1;
	}

	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				int temp = nums[i + 1];
				nums[i + 1] = 4;
				for (int j = i + 2; j < nums.length; j++) {
					if (nums[j] == 4) {
						nums[j] = temp;
					}
				}
			}
		}
		return nums;
	}

	public int[] fix45(int[] nums) {

		int tmpIdx = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5 && i != tmpIdx + 1) {

				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == 4 && j > tmpIdx) {

						tmpIdx = j;
						int tmp = nums[j + 1];
						nums[j + 1] = nums[i];
						nums[i] = tmp;

						if (nums[i] == nums[j + 1]) {
							i--;
						}
						break;
					}
				}
			}
		}

		return nums;
	}

	public boolean canBalance(int[] nums) {
		int sum1 = 0, sum2;

		for (int i = 0; i < nums.length; i++) {
			sum1 += nums[i];
			sum2 = 0;
			for (int j = nums.length - 1; j > i; j--) {
				sum2 += nums[j];
			}
			if (sum1 == sum2) {
				return true;
			}
		}

		return false;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int cnt = 0;

		int j = 0;
		for (int i = 0; i < outer.length; i++) {
			if (cnt < inner.length && outer[i] == inner[j]) {
				cnt++;
				j++;
			}
		}

		return cnt == inner.length;
	}

	public int[] squareUp(int n) {
		int[] arr = new int[n * n];

		int cnt = 0;
		int block = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (block == 0) {
				arr[i] = ++cnt;
			} else {
				++cnt;
				if (cnt <= n - block) {
					arr[i] = cnt;
				}
			}
			if (cnt == n) {
				cnt = 0;
				block++;
			}
		}

		return arr;
	}

	public int[] seriesUp(int n) {
		int[] arr = new int[n * (n + 1) / 2];

		int j = 0;
		for (int i = 1; i < n + 1; i++) {
			for (int k = 1; k < i + 1; k++) {
				arr[j] = k;
				j++;
			}
		}

		return arr;
	}

	public int maxMirror(int[] nums) {
		int max = 0, count;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = nums.length - 1; j >= 0 && count + i < nums.length; j--) {
				if (nums[count + i] == nums[j]) {
					count++;
				} else if (count > 0) {
					max = Math.max(max, count);
					count = 0;
				}
			}
			max = Math.max(max, count);
		}

		return max;
	}

	public int countClumps(int[] nums) {
		int count = 0;
		int j;
		for (int i = 0; i < nums.length - 1; i++) {
			j = i + 1;
			if (nums[i] == nums[j]) {
				while (j < nums.length && nums[i] == nums[j]) {
					j++;
				}
				i = j - 1;
				count++;
			}
		}

		return count;
	}

	// Logic-2
	public boolean makeBricks(int small, int big, int goal) {
		if (goal > big * 5 + small) {
			return false;
		}
		if (goal % 5 > small) {
			return false;
		}

		return true;
	}

	public int loneSum(int a, int b, int c) {
		int sum = 0;

		boolean aDup = true, bDup = true, cDup = true;

		if (a != b && a != c) {
			aDup = false;
		}
		if (b != a && b != c) {
			bDup = false;
		}
		if (c != a && c != b) {
			cDup = false;
		}

		sum += !aDup ? a : 0;
		sum += !bDup ? b : 0;
		sum += !cDup ? c : 0;

		return sum;
	}

	public int luckySum(int a, int b, int c) {

		if (a == 13) {
			return 0;
		}
		if (b == 13) {
			return a;
		}
		if (c == 13) {
			return a + b;
		}

		return a + b + c;
	}

	public int noTeenSum(int a, int b, int c) {
		int sum = 0;

		sum += fixTeen(a);
		sum += fixTeen(b);
		sum += fixTeen(c);

		return sum;
	}

	public int fixTeen(int n) {

		if (n >= 13 && n <= 19 && n != 15 && n != 16) {
			return 0;
		}

		return n;
	}

	public int roundSum(int a, int b, int c) {
		int sum = 0;
		sum += round10(a);
		sum += round10(b);
		sum += round10(c);

		return sum;
	}

	public int round10(int num) {

		if (num % 10 >= 5) {
			return num + (10 - num % 10);
		} else {
			return num - (num % 10);
		}
	}

	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		}

		if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2) {
			return true;
		}

		return false;
	}

	public int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		}

		int aDiff = Integer.MAX_VALUE, bDiff = Integer.MAX_VALUE;
		if (a <= 21) {
			aDiff = Math.abs(a - 21);
		}
		if (b <= 21) {
			bDiff = Math.abs(b - 21);
		}

		return aDiff < bDiff ? a : b;
	}

	public boolean evenlySpaced(int a, int b, int c) {
		int[] abc = {a, b, c};
		Arrays.sort(abc);
		
		int abDiff = Math.abs(abc[0] - abc[1]), bcDiff = Math.abs(abc[1] - abc[2]);
		
		return abDiff == bcDiff;
	}

	public int makeChocolate(int small, int big, int goal) {
		
		if (goal > small + big*5) return -1;
		if (goal % 5 > small) return -1;

		int sum = 0, bigCnt = 0;
		while (sum <= goal && bigCnt <= big){
			sum += 5;
			bigCnt++;
		}
		
		return goal - ((bigCnt - 1) * 5);
	}
}
