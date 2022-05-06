import javax.swing.*;
public class game {
    public static void main(String[] args) {
        int computernumber = (int) (Math.random() * 100 + 1);
        int useranswer = 0;
        System.out.println("the correct gues would be=" + computernumber);
        int count = 1;
        while (useranswer != computernumber) {
            String response = JOptionPane.showInputDialog(null,
                    "enter a guess between 1 and 100", "guessing game", 3);
            useranswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(useranswer,
                    computernumber, count));
            count++;
        }
    }

    public static String determineGuess(int useranswer, int computernumber, int count) {
        if (useranswer <= 0 || useranswer > 100) {
            return "Your guess is invalid";
        } else if (useranswer == computernumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (useranswer > computernumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else if (useranswer < computernumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}



