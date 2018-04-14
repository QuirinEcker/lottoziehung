public class Ecker_LottoZiehung {

    public static void main(String[] args) {
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            numbers[i] = addRandomNumber(numbers);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" " + numbers[i]);
        }
    }

    private static int addRandomNumber(int[] numbers) {
        boolean keepRunning = true;
        int number = 0;
        while (keepRunning) {
            number = (int) (Math.random() * 45) + 1;
            int count = 0;

            for (int i = 0; i < numbers.length; i++){
                if (number == numbers[i]) {
                    i = numbers.length;
                } else {
                    count++;
                }
            }

            if (count == 6) {
                keepRunning = false;
            }
        }
        return number;
    }
}
