import java.util.ArrayList;
import java.util.List;

public class HW1 {

    public static void main(String[] args) {
        oddIndices(new int[] {-45, 590, 234, 985, 12, 68});
    }

    public static String oddEven (int x) {

        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE ) {
            return "Undefined";
        }

        if (x% 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

    public static int[] oddIndices (int[] input) {

        ArrayList<Integer> result;
        for (int i = 0; i < input.length; i++ ) {
            if (i % 2 != 0) {
                result = result + input[i] + ",";
            }
        }

        result = result.substring(0, result.length() - 1);
        result.split(",");



        return null;
    }
}

//Написать алгоритм OddIndices, который принимает массив чисел,
// и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}



//Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
// и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.