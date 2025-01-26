public class QuizQuestion {

    public static void main(String [] args) {
        //  assume this array exists and each index holds a random value ranging from 1-100 (inclusive)
        int [] data = {10, 30, 5, 100, 39};

// initialize variables
int lowest = data[0];
int highest = data[0];

// loop through data array
for (int i = 0; i < data.length; i++) {
    // separate if statements in case the highest and lowest are the same
    if (data[i] < lowest) lowest = data[i];
    if (data[i] > highest) highest = data[i];
}

// output
System.out.println(highest - lowest);


    }
}