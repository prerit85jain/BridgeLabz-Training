package level03;

public class NumberChecker {
	public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    
    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for(int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int getSumOfSquares(int[] digits) {
        int sum = 0;
        for(int d : digits) {
            sum += (int)Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = getSumOfDigits(digits);
        return number % sumOfDigits == 0;
    }
    
    public static int[][] getDigitFrequencies(int[] digits) {
        int[] freq = new int[10];
        for(int d : digits) {
            freq[d]++;
        }

        int[][] result = new int[10][2];
        for(int i=0; i<10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }
    
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumDigits = 0;
        while (square > 0) {
            sumDigits += square % 10;
            square /= 10;
        }
        return sumDigits == number;
    }

    // Check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    // Check if a number is automorphic
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int tempNumber = number;
        int tempSquare = square;

        while (tempNumber > 0) {
            if (tempSquare % 10 != tempNumber % 10) {
                return false;
            }
            tempNumber /= 10;
            tempSquare /= 10;
        }
        return true;
    }

    // Check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if a number is perfect
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false; // 1 and below are not perfect
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Check if a number is abundant
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // Check if a number is deficient
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // Check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumFact = 0;
        int temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sumFact += factorial(d);
            temp /= 10;
        }
        return sumFact == number;
    }
}
